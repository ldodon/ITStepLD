package com.itstep.Home_work_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by utilizator on 5/15/20.
 */
public class Order {
    long id;
    User user;
    List<Item> items;
    Random random = new Random();

    public Order(User user, List<Item> items) {
        this.id = random.nextInt();
        this.user = user;
        this.items = items;

    }

    List<Item> filterItemsByType(Catalogue type) {
        List<Item> filteredList = new ArrayList<>();
        for (Item item : items) {
            if (item.type == type) {
                filteredList.add(item);
            }
        }
        return filteredList;


    }

    @Override
    public String toString() {
        return "UserOrder{" +
                "id=" + id +
                ", user=" + user +
                ", items=" + items +
                '}';
    }
}
