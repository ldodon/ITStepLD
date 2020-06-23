package com.itstep.Home_work_5;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by utilizator on 5/21/20.
 */
public class Main {
    public static void main(String[] args) {
        CharList chList1 = new CharList();
        CharList chList2 = new CharList("Summer");

        ArrayList<Character> chars = new ArrayList<>();
        Collections.addAll(chars, 'm', 'o', 'n', 'd', 'a', 'y');
        CharList chList3 = new CharList(chars);
        CharList cutCharList = chList2.subString(2, 5);
        System.out.println("Substring: "+cutCharList.internalList);

        ArrayList<Character> str = new ArrayList<>();
        Collections.addAll(str, 'r','r','r','e','e','s','u','l','t','t');
        CharList chList4 = new CharList(str);
        CharList dublCharList= chList4.removeDuplicates();
        System.out.println("Removed Dublicates: "+dublCharList.internalList);

        ArrayList<Character> rem = new ArrayList<>();
        Collections.addAll(rem, 'a','u','m','t','u','m','n');
        CharList chList5 = new CharList(rem);
        CharList remFirst= chList5.removeFirst('m');
        System.out.println("Removed First: "+remFirst.internalList);

        ArrayList<Character> remall = new ArrayList<>();
        Collections.addAll(remall, 'a','u','m','t','u','m','n');
        CharList chList6 = new CharList(remall);
        CharList remAll= chList6.removeAll('m');
        System.out.println("Removed First: "+remAll.internalList);

        CharList mix = chList3.mixedList();
        System.out.println("Mix: " +mix.internalList);

        ArrayList<Character> t = new ArrayList<>();
        Collections.addAll(t,' ',' ','w','i','n','t','e','r',' ');
        CharList chList7 = new CharList(t);
//        boolean tt = chList7.trim();
        System.out.println("Trim: "+chList7.internalList);

    }
}


