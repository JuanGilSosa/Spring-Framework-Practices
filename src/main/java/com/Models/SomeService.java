package com.Models;

public class SomeService {
    private static SomeService myService = new SomeService();
    public SomeService(){}
    public static SomeService createInstance(){
        return myService;
    }
    public String data(){
        return "Una data";
    }
}
