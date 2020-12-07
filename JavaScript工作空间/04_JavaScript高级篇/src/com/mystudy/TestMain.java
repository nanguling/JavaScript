package com.mystudy;

public class TestMain {
    //int...args动态参数，java实现方法重载的基础
    public static void test(int...args) {
        System.out.println("test method is run");
    }

    public static void main(String[] args) {
        //test(null);

        test(10,20,30);
        //test("abc");
    }
    
}
