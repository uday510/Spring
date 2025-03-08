import beans.Vehicle;
import config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context: " + vehicle.getName());

        System.out.println("--------------------------------------");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Vehicle vehicle1 = context.getBean("audi", Vehicle.class);
//        System.out.println("Vehicle name from spring context: " + vehicle1.getName());
//
//        Vehicle vehicle2 = context.getBean("honda", Vehicle.class);
//        System.out.println("Vehicle name from spring context: " + vehicle2.getName());
//
//        Vehicle vehicle3 = context.getBean("ferrari", Vehicle.class);
//        System.out.println("Vehicle name from spring context: " + vehicle3.getName());

            vehicle = (Vehicle) context.getBean(Vehicle.class);
         System.out.println("Vehicle name from spring context: " + vehicle.getName());


        System.out.println("--------------------------------------");
        String str = context.getBean("str", String.class);
        System.out.println("String name from spring context: " + str);

        Integer num = context.getBean(Integer.class);
        System.out.println("Integer name from spring context: " + num);

    }

}
