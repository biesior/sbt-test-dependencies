package com.domain.root;

public class Main {

    public static String someString() {

//      That's ok
//      String root = com.domain.root.Main.someString(); //this works, anyway we don't wan't to call this recursibely ;)
        String foo = com.domain.foo.Main.someString();
        String bar = com.domain.bar.Main.someString();
        String zee = com.domain.bar.Main.someString();

        return "String from `root`";
    }

}
