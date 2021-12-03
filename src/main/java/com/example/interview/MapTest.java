package com.example.interview;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //按key进行比较
        Map<String, Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        map.put("1.B.1.c", 45);
        map.put("1.B.1.d", 65);
        map.put("1.B.1.a", 12);
        map.put("1.B.1.b", 15);
        map.put("1.B.1.e", 78);
        //keySet获取map集合key的集合  然后在遍历key即可
        for (String key : map.keySet()) {
            String value = map.get(key).toString();//
            System.out.println("key:" + key + " vlaue:" + value);
        }


        // 按value进行比较
        //这里将map.entrySet()转换成list，再用collections工具类中的sort()方法完成排序操作
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int t = -o1.getValue().compareTo(o2.getValue());
                if (t == 0)
                    return o1.getKey().compareTo(o2.getKey());
                return t;
            }

        });

    }
}
