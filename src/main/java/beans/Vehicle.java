package beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    // context.close() will call the destroy method
    // @PreDestroy annotation is used to perform clean-up operations before the bean is removed from the container.
    @PreDestroy
    public void destroy() {
        System.out.println("Destroy method called");
    }

    // @PostConstruct annotation is used to initialize the bean after the bean has been constructed.
    @PostConstruct
    public void initialize() {
        this.name = "Honda City";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello World");
    }

}
