package com.company;


public class Dog {
    String name;
    int weight;
    String gender;
    int age;
    String birth;

    Dog(String n, int w) {
        name = n;
        weight = w;
    }

    Dog(String g, int a, String b) {
        gender = g;
        age = a;
        birth = b;
    }

    Dog(String n, String b, int w) {
        name = n;
        birth = b;
        weight=w;
    }


    int grow() {
        return (int) (weight * 1.3);
    }


    public static void change(String g, int a, String b) {
        System.out.println("Lari- " + g + " gender, " + "Lari age- " + a + " year, " + "Lari birth- " + b);
    }


    public static void change(String n, String b, int w) {
        System.out.println(n + " -very big dog, " + n + " birth- " + b+", "+n+" weight- "+w+ " kg");
    }


    public static void main(String[] args) {
        Dog Rex = new Dog("Rex", 30);
        System.out.println("Dog name- " + Rex.name + " Dog weight- " + Rex.weight + " kg");
        System.out.println("1 year later " + Rex.name + " weight-" + Rex.grow() + " kg");
        Dog Bobik = new Dog("Bobik", 10);
        System.out.println("Dog name- " + Bobik.name + " Dog weight- " + Bobik.weight + " kg");
        System.out.println("1 year later " + Bobik.name + " weight-" + Bobik.grow() + " kg");
        System.out.println("");

        Dog Lari = new Dog("man", 23, "korgi");
        change(Lari.gender,Lari.age,Lari.birth);
        System.out.println("");

        Dog Fantik = new Dog("Fantik", "Alabay", 97);
        change(Fantik.name, Fantik.birth, Fantik.weight);

    }
}
