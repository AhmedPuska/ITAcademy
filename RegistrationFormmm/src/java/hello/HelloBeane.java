package hello;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

@Named(value = "helloBean")
@Dependent
public class HelloBeane {

    
    public HelloBeane() {
    }
    
}
