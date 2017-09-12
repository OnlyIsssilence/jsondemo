package com.onlyisssilence.muya;

import com.onlyisssilence.muya.entity.House;
import com.onlyisssilence.muya.entity.Person;
import com.onlyisssilence.muya.entity.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MuYa
 * Date: 2017-09-12
 * Time: 下午 11:57
 */
public class DataUtils {
    public static Person getPersonData() {
        Person person = new Person();
        person.setName("木崖呀");
        person.setAge(18);
        person.setHouses(getHousesData());
        person.setSex(false);
        return person;
    }

    public static List<House> getHousesData() {
        List<House> houses = new ArrayList<House>();
        for (int i = 10; i < 13; i++) {
            House house = new House();
            house.setArea(i * 100);
            String houseName = "西海岸" + i + "栋" + i + "单元";
            house.setAddress(houseName);
            house.setDoorNo(i);
            house.setPrice(i * 1000);
            house.setRooms(getRoomsData(houseName));
            houses.add(house);
        }
        return houses;
    }

    public static List<Room> getRoomsData(String houseName) {
        List<Room> rooms = new ArrayList<Room>();
        for (int i = 0; i < 3; i++) {
            Room room = new Room();
            room.setId(i);
            room.setArea(i * 100);
            room.setName(houseName + " 房间" + i);
            room.setOwnerName("住户人" + i);
            rooms.add(room);
        }
        return rooms;
    }
}
