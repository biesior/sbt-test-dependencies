package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

    public static Result index() {

        // Here's in the root everything is accessible...
        // Check `Main` classes in modules for samples

        String root = com.domain.root.Main.someString();
        String foo = com.domain.foo.Main.someString();
        String bar = com.domain.bar.Main.someString();
        String zee = com.domain.zee.Main.someString();

        return ok(index.render("Your new application is ready."));
    }

}
