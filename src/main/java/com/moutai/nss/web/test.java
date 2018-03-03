package com.moutai.nss.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by WY on 2018/3/2.
 */

public class test {

    public static List<String> findAllStore() {

        List<String> storeList = new ArrayList<>();
//        Map<String, Object> store = new HashMap<String, Object>();
        storeList.add("海津皇冠");
        storeList.add("德飞皓龙");
        storeList.add("大天津");
        storeList.add("鹏宇九州");
        System.out.println("**test.findAllStore.26:"+storeList.toString());
        return storeList;
    }

    public static List<String> findAllAct() {
        List<String> actList = new ArrayList<>();
        actList.add("情暖中国年");
        actList.add("感恩祖国");
        actList.add("茅台文化");
        actList.add("茅台公益行");
        return actList;
    }

}
