import beans.Person;
import beans.Vehicle;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
//        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(person.getName());
//        System.out.println(person.getVehicle().getName());

    }

}
