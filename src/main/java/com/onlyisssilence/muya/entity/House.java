package com.onlyisssilence.muya.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MuYa
 * Date: 2017-09-12
 * Time: 下午 11:40
 */
public class House implements Serializable {
    private String address;
    private int doorNo;
    private float price;
    private float area;
    private List<Room> rooms;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", doorNo=" + doorNo +
                ", price=" + price +
                ", area=" + area +
                ", rooms=" + rooms.toString() +
                '}';
    }
}
