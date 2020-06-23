package com.itstep.Home_work_5;

import java.util.*;

/**
 * Created by utilizator on 5/21/20.
 */
public class CharList {
    public ArrayList<Character> internalList;

    public CharList(ArrayList<Character> internalList) {
        this.internalList = internalList;
    }

    public CharList() {
        this.internalList = new ArrayList<>();
    }

    public CharList(String string) {
        this.internalList = new ArrayList<>();
        int stringLength = string.length();
        for (int i = 0; i < stringLength; i++) {
            internalList.add(string.charAt(i));
        }
    }

    public char charAt(int index) {
        return internalList.get(index);
    }

    public int indexOf(char d) {
        return internalList.indexOf(d);

    }

    public CharList subString(int start, int end) {
        ArrayList<Character> collected = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            collected.add(internalList.get(i));
        }
        return new CharList(collected);
    }

    public CharList removeDuplicates() {
        Set<Character> remDubl = new LinkedHashSet<>(internalList);
//        for (Character ch : internalList) {
//            remDubl.add(ch);
//        }

        return new CharList(new ArrayList<>(remDubl));
    }

    public CharList removeFirst(Character c) {
//        boolean removed = false;
//        for (Character ch : internalList) {
//            if (ch == c) {
                internalList.remove(c);


            return this;

    }

    public CharList removeAll(Character c) {
        internalList.removeAll(Collections.singletonList(c));
        return this;
    }

    public boolean isEmpty() {
        return internalList.isEmpty();
    }

    public boolean contains(Character c) {
        return internalList.contains(c);
    }

    public CharList clearList() {
        internalList.clear();
        return this;
    }

    public CharList sortList() {
        Collections.sort(internalList);
        return this;
    }

    public CharList reverseList() {
        Collections.reverse(internalList);
        return this;
    }

    public CharList mixedList() {
        Collections.shuffle(internalList);
        return this;
    }
    public String toString(){
        String result = "";
        for (Character r:internalList ){
            result += r;
//            result =  result + r;
        }
        return result;
    }

    public CharList trim() {
//        for (int i = 0; i < internalList.size(); i++) {
//            i=0;
//            if (internalList.get(i) != ' ') {
//                break;
//            }
//            if (internalList.get(i) == ' ') {
//                internalList.remove(i);
//            }
//        }
//        for (int i = internalList.size() - 1; i > 0; i--) {
//            i = internalList.size() - 1;
//            if (internalList.get(i) != ' ') {
//                break;
//            }
//            if (internalList.get(i) == ' ') {
//                internalList.remove(i);
//            }
//        }
//        return internalList.get(0) != ' ' && internalList.get(internalList.size() - 1) != ' ';
       String temp = this.toString().trim();
        return new CharList(temp);
   }
//public CharList concat(){

//}
}
