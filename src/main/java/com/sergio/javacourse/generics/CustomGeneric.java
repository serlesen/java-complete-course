package com.sergio.javacourse.generics;

import java.util.ArrayList;
import java.util.List;

public class CustomGeneric {

    public static void main(String[] args) {

    }

    /**
     * Create inside this method a list of String. Add the given item to the list and return it.
     * When adding the element to the list, you will need to cast it correctly.
     */
    public static List createStringList(Object item) {
        List<String> list = new ArrayList<>();
        list.add((String) item);
        return list;
    }

    /**
     * Create inside this method a list of int/Integer. Add the given item to the list and return it.
     * When adding the element to the list, you will need to cast it correctly.
     * Be aware, that only objects are accepted in the Generics definitions, not primitive types.
     */
    public static List createIntegerList(Object item) {
        List<Integer> list = new ArrayList<>();
        list.add((Integer) item);
        return list;
    }

    /**
     * Edit the class {@see com.sergio.javacourse.generics.MyGenericClass} located in the same package as the current
     * class.
     * Create an instance of the Class that accepts String values. Add the given input to the method {@code accept()}
     * and return the created object.
     */
    public static MyGenericClass editCustomGenericClass(Object item) {
        MyGenericClass<String> myGenericClass = new MyGenericClass<>();
        myGenericClass.accept((String) item);
        return myGenericClass;
    }
}
