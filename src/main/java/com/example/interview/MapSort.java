package com.example.interview;

import java.util.*;

public class MapSort {
    //2、map集合根据列出key根据值降序
    //write you code here to list the keys sort by its value desc


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("小明", 12);
        map.put("大米", 16);
        map.put("小啥", 15);
        map.put("大画", 12);
        map.put("燕子", 16);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int t = -o1.getValue().compareTo(o2.getValue());
                return t;
            }

        });
//        Collections.sort(list,(o1, o2) -> {
//                    return Integer.compare(o2.getValue(),o1.getValue());
//                }
//        );
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey());
        }

    }

}
