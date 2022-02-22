package com.testinium.Page;

import com.testinium.methods.Methods;

import java.lang.reflect.Method;

public class HomePage {
    Methods methods;
    public HomePage () {
        methods = new Methods();

    }
    public void home(){
        methods.waitBySeconds(3);

    }
}
