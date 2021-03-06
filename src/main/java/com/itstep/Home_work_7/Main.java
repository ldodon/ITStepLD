package com.itstep.Home_work_7;

import java.util.*;

/**
 * Created by utilizator on 5/15/20.
 */
public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Moldova", "Chisinau", "StefancelMare");
        Address address2 = new Address("Moldiva", "Orhei", "MihaiEminescu");
        Address address3 = new Address("Moldova", "Soroca", "APuskin");
        Address address4 = new Address("Moldova", "Chisinau", "Dacia");
        Map<String, Address> homeAddress = new HashMap<>();
        homeAddress.put("home", address1);
        Map<String, Address> homeAddress2 = new HashMap<>();
        homeAddress2.put("home", address2);
        Map<String, Address> addresses = new HashMap<>();
        addresses.put("home", address3);
        addresses.put("work", address4);

        User user1 = new User("spring", homeAddress);
        User user2 = new User("summer", homeAddress2);
        User user3 = new User("autumn", addresses);
        Company company1 = new Company("Salon");
        AdminUser admin = new AdminUser("Admin", homeAddress);
        System.out.println(user1);

        Item item1 = new Item("Shampoo", Catalogue.HAIR, 45.5);
        Item item2 = new Item("Cleansing oils", Catalogue.CARE, 33.5);
        Item item3 = new Item("Creams", Catalogue.SKINCARE, 100);
        Item item4 = new Item("Body oil", Catalogue.BODY, 56.6);
        Item item5 = new Item("Hydratation Mask", Catalogue.MASKS, 12.2);
        List<Item> firstList = new ArrayList<>();
        firstList.add(item1);
        firstList.add(item2);
        firstList.add(item3);
        firstList.add(item4);
        firstList.add(item5);
        List<Item> secondList = new ArrayList<>();
        secondList.add(item3);
        secondList.add(item5);

        UserOrder order1 = new UserOrder(user1, firstList);
        CompanyOrder order2 = new CompanyOrder(company1, secondList);
        List<Order> allOrder = new ArrayList<>();
        allOrder.add(order1);
        allOrder.add(order2);


        List<Item> filterType = order1.filterItemsByType(Catalogue.BODY);

        System.out.println(filterType);
        List<User> all = new ArrayList<>();
        Collections.addAll(all, user1, user2, user3);
        System.out.println(filerUsersByCity(all, "Orhei"));

    }

    static List<Order> filterItemsByType(Catalogue type, List<Order> orders) {
        List<Order> filteredOrders = new ArrayList<>();
        for (Order tempOrder : orders) {
            List<Item> filteredByType
                    = tempOrder.filterItemsByType(type);
            if (!filteredByType.isEmpty()) {
                filteredOrders.add(tempOrder);
            }
        }
        return filteredOrders;

    }

    static List<User> filerUsersByCity(List<User> users, String city) {
        List<User> filtredUsers = new ArrayList<>();
        for (User u : users) {
            for (Address a : u.addresses.values()) {
                if (a.city.equals(city)) {
                    filtredUsers.add(u);
                    break;
                }
            }
        }
        return filtredUsers;
    }
}


