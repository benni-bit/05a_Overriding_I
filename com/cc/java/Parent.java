package com.cc.java;

public class Parent  extends GrandParent{

    public String sayHello(){
        return "Hello from parent!";

}

public String sayHello(String str){
    return  str + "Hello from parent!";
}
}