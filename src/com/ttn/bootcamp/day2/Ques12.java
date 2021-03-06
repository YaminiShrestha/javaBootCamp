package com.ttn.bootcamp.day2;

/**
 * What will be the  output on new Child(); ?
 */
class Parent extends Grandparent {

    {
        System.out.println("instance - parent");
    }

    public Parent() {
        System.out.println("constructor - parent");
    }

    static {
        System.out.println("static - parent");
    }
}

class Grandparent {

    static {
        System.out.println("static - grandparent");
    }

    {
        System.out.println("instance - grandparent");
    }

    public Grandparent() {
        System.out.println("constructor - grandparent");
    }
}

class Child extends Parent {

    public Child() {
        System.out.println("constructor - child");
    }

    static {
        System.out.println("static - child");
    }

    {
        System.out.println("instance - child");
    }
}

public class Ques12 {
//    driver code
    public static void main(String[] args) {
        System.out.println("Start");
//        call new child
        new Child();
        System.out.println("End");
    }
}



