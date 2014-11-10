package guice_test;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceApp {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MyGuiceModule());
        MyService myService = injector.getInstance(MyService.class);
        myService.doSomething();
    }
}
