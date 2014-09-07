package com.domain.bar;

public class Main {


    public static String someString() {

//      That's ok
        String foo = com.domain.foo.Main.someString();

//      That's wrong
//      String root = com.domain.root.Main.someString();
//      String zee = com.domain.zee.Main.someString();

        return "String from `bar`";
    }

}
