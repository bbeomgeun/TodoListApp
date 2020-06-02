package com.example.todolist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Fragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment1, container, false);
        // onCreateView() 메소드 안에서 LayoutInflater 객체의 inflate() 메서드를 호출하면서 fragment1을 파라미터로 전달.
        initUI(rootView);

        return rootView;
    }
    private void initUI(ViewGroup rootView){
        //인플레이션 후에 xml레이아웃 안에 들어있는 위젯이나 레이아웃을 찾아 변수에 할당하는 코드들을 넣기 위해 만들어진것.
        ListView listView = rootView.findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter();
        adapter.addItem(new Note(0, "친구랑 점심", "약속", "강남구 삼성동","", "", "2월 10일"));
        listView.setAdapter(adapter);
    }
    class MyAdapter extends BaseAdapter{
        private ArrayList<Note> items = new ArrayList<>();

        public void addItem(Note note){
            items.add(note);
        }

        @Override
        public int getCount(){
            return items.size();
        }

        @Override
        public Note getItem(int position){
            return items.get(position);
        }
        public long getItemId(int position){
            return position;
        }

        @Override
        public View getView(final int position, final View convertView, ViewGroup parent){
            NoteAdapter view = new NoteAdapter(getContext());

            Note note = items.get(position);
            view.setContents(note.getContents());
            view.setCategory(note.getCategory());
            view.setLocation(note.getAddress());
            view.setDate(note.getCreateDateStr());

            return view;
        }

    }
}
