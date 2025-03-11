package beans;
import org.springframework.stereotype.Component;

public class Vehicle {

    public Vehicle() { System.out.println("Vehicle()"); }
    private String name = "Toyota";

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
