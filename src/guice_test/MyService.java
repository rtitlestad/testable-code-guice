package guice_test;

import javax.inject.Inject;

public class MyService {

    private final MyDependency myDependency;

    @Inject
    public MyService(MyDependency myDependency) {
        this.myDependency = myDependency;
    }

    public void doSomething() {
        myDependency.doSomething();
    }
}
