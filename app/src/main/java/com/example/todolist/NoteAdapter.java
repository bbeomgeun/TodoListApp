package com.example.todolist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class NoteAdapter extends LinearLayout{
    TextView textView1, textView2,textView3,textView4;

    public NoteAdapter(Context context){
        super(context);
        init(context);
    }

    public NoteAdapter(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context); // 인플레이션해서 붙여주는 역할
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.todoitem,this, true);

        textView1 = findViewById(R.id.contentsTextView);
        textView2 = findViewById(R.id.categoryTextView);
        textView3 = findViewById(R.id.locationTextView);
        textView4 = findViewById(R.id.dateTextView);
    }

    public void setContents(String contents){
        textView1.setText(contents);
    }

    public void setCategory(String category){
        textView2.setText(category);
    }
    public void setLocation(String address){
        textView3.setText(address);
    }
    public void setDate(String date){
        textView4.setText(date);
    }
}
