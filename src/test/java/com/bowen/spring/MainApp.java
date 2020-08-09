package com.bowen.spring;


public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        HelloWorld runner = context.getBean(HelloWorld.class);
        Student runner = context.getBean(Student.class);
        runner.getMessage();
    }
}