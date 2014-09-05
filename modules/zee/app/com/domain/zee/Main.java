package com.domain.zee;

public class Main {

    public static String someString() {

//      That's ok
        String foo = com.domain.foo.Main.someString();

//      That's wrong
//      String root = com.domain.root.Main.someString();
//      String bar = com.domain.bar.Main.someString();

        return "String from `zee`";
    }

}
