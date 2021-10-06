package com.hackerhank.joao.search;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IceCreamParlor {

    public static void whatFlavors(List<Integer> cost, int money) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= cost.size(); i++) {
            Integer price = cost.get(i - 1);
            Integer change = money - price;
            if (map.containsKey(change)) {
                System.out.println(map.get(change) + " " + i);
                return;
            } else {
                map.put(price, i);
            }
        }
    }
}
