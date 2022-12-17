package hello;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

//@Named(value = "helloBean")
@ManagedBean(name = "hello", eager = true)
@RequestScoped
public class HelloBean {

    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public HelloBean() {
    }
    
}
