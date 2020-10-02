package com.example.listmusic.model;

public class Contact {
    private String name;
    private String type;
    private Integer imgid;


    public Contact(String name, String type, String number, Integer imgid) {
        this.name = name;
        this.type = type;
        this.imgid=imgid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getImgid() {
        return imgid;
    }



    public void setImgid(Integer imgid) {
        this.imgid = imgid;
    }
}
