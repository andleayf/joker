package com.xcy.joker.test;

/**
 * @program: joker
 * @Description:
 * @author: YeMao
 * @create: 2019-08-09 13:07
 */

public class Test {


    public Test(){
        System.out.println("bye");
    }

    public Test(double var){
        this((int)var);
    }

    public Test(int var){
        this("hello");
    }

    public Test(String s){
        this();
        System.out.println(s);
    }

    public static void main(String[] args) {
        Test t =  new Test(5);
    }
}
