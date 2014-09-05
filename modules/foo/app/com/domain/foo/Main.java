package com.domain.foo;

public class Main {

    public static String someString() {

//      That's wrong
//      String root = com.domain.root.Main.someString();
//      String bar = com.domain.bar.Main.someString();
//      String zee = com.domain.zee.Main.someString();

        return "String from `foo`";
    }

}
