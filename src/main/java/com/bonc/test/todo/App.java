package com.bonc.test.todo;


import org.joda.time.LocalTime;

/**
 * Created by ZhaoZhi qiang
 *
 * @Date 2018/4/21.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("---");
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
