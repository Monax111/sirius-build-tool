package ru.tinkoff.sirius.build.tools;

import com.google.gson.Gson;

public class BestProcess {

    public static void main(String[] args) {
        Foo foo = new Foo("hi");
        String json = new Gson().toJson(foo);
        System.out.println(json);
    }

}
