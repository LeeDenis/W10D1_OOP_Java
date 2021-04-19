package com.tts;

public class Pet {
    //private instance variables
    private static String name;
    private static int age;
    private static String location;
    private static String type;

    //get method
    public static String getName() {
        return name;
    }
    //set method
    public void setName(String name) {
        this.name = name;
    }

    public static int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public Pet() {
        this.name = getName();
        this.age = getAge();
        this.location = getLocation();
        this.type = getType();
    }
}

