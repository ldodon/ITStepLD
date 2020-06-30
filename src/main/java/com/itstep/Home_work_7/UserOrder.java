package com.itstep.Home_work_7;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by utilizator on 5/15/20.
 */
public class UserOrder implements com.itstep.Home_work_7.Order {
    long id;
    private User user;
    private List<Item> items;
    Random random = new Random();

    public UserOrder(User user, List<Item> items) {
        this.id = random.nextInt();
        this.user = user;
        this.items = items;

    }

    public List<Item> filterItemsByType(Catalogue type) {
        List<Item> filteredList = new ArrayList<>();
        for (com.itstep.Home_work_7.Item item : items) {
            if (item.getType() == type) {
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

    @Override
    public double sum() {
        double temp = 0;
        for (Item i : items) {
            temp += i.getPrice();
        }
        return temp;
    }

    @Override
    public int count() {
        return items.size();
    }

    public double sum(Item item) {
        double temp = 0;
        for (Item i : items) {
            if (item.getType().equals(i.getType())) {
                temp += i.getPrice();
            }
        }return temp;
    }
    public double count(Item item) {
       return filterItemsByType(item.getType()).size();

    }
}
