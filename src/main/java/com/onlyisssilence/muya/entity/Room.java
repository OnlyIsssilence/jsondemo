package com.onlyisssilence.muya.entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MuYa
 * Date: 2017-09-12
 * Time: 下午 11:43
 */
public class Room implements Serializable {

    private float area;
    private String name;
    private int id;
    private String ownerName;

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Room{" +
                "area=" + area +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
