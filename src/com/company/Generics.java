package com.company;

import com.company.Building.Building;
import com.company.Building.House;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public  static void main(String[] args) {
        List<String> names = new ArrayList();
    }
    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        for (T element : array) {
            list.add(element);
        }
        return  list;
    }
    /**
     * Variable number of arguments
     */

    private static void printShoppingList(String string1, String string2) {
        System.out.println(string1);
    }

    private static  void printShoppingList(String... items)
    {
        for (String item : items) {
            System.out.println(item);
        }
    }

    static void printBuildings(List<? extends Building> buildings){

    }
    static void AddToList(List<? super House> building){

    }
}
