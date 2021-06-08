package ru.megalomaniac.tests.course2.lambda.supplier;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;
public class SupplierTest {

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> al=new ArrayList<>();
        for(int i=0; i<3;i++){
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void upgradeCar(Car car,Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(
                ()->new Car("Nissan Tilda","Silver Metallic",1.6F)
        );
        System.out.println("Our cars: "+ourCars);

        upgradeCar(ourCars.get(0),car->{
            car.color="red";
            car.engine=2.4F;
        });

        System.out.println("car list with upgraded car");
        System.out.println(ourCars);
    }

}
class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
