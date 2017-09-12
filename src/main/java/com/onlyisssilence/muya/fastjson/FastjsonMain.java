package com.onlyisssilence.muya.fastjson;

import com.alibaba.fastjson.JSON;
import com.onlyisssilence.muya.DataUtils;
import com.onlyisssilence.muya.entity.Person;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MuYa
 * Date: 2017-09-12
 * Time: 下午 11:49
 */
public class FastjsonMain {
    public static void main(String[] args) {

        Person person = DataUtils.getPersonData();


        System.out.println(JSON.toJSONString(person));
        System.out.println(person.toString());
    }
}
