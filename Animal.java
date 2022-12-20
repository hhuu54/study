package com.google.hhuu54;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class Animal {
    private static String plot = "NanG";

    private String name;
    private int age;
    private String variety;
    private String color;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void eat() {
        System.out.println(this.name + "吃饭……");
    }

    public void sleep() {
        System.out.println(this.name + "睡觉……");
    }

    public void sick() {
        System.out.println(this.name + "生病……");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 30) {
            System.out.println("您的输入不合法，已清零");
            this.age = 0;
        } else
            this.age = age;
    }

    public static String getPlotInstance() {
        return plot;
    }

    public static void injection() {
        System.out.println("所有的动物，下周打针！！！");
    }
}
