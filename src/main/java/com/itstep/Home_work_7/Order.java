package com.itstep.Home_work_7;

import java.util.List;

/**
 * Created by utilizator on 6/3/20.
 */
public interface Order {
    double sum();
    int count();

    List<Item> filterItemsByType(Catalogue type);

}
