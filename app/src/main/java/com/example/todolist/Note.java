package com.example.todolist;

public class Note {
    int _id; //나중에 데이터베이스에서 조회한 id값
    String contents; //내용
    String address; //주소
    String locationX;
    String locationY;
    String createDateStr; //작성날자(할일 날짜)
    String category;


    public Note(int _id, String contents, String category, String address, String locationX, String locationY, String createDateStr) {
        this._id = _id;
        this.category = category;
        this.address = address;
        this.locationX = locationX;
        this.locationY = locationY;
        this.contents = contents;
        this.createDateStr = createDateStr;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getCategory(){return category;}
    public void setCategory(String category){this.category = category;}

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocationX() {
        return locationX;
    }

    public void setLocationX(String locationX) {
        this.locationX = locationX;
    }

    public String getLocationY() {
        return locationY;
    }

    public void setLocationY(String locationY) {
        this.locationY = locationY;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getCreateDateStr() {
        return createDateStr;
    }

    public void setCreateDateStr(String createDateStr) {
        this.createDateStr = createDateStr;
    }
}
