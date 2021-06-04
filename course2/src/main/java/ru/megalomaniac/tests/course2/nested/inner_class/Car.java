package ru.megalomaniac.tests.course2.nested.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine{
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

}
// Для создания inner class требуется экземляр внешнего класса
// создается через className.new innerClassName();
// Inner class не может содержать статичные переменные
// final static можно
// Inner class Moжет обращаться к private полям внешнего класса

class Test{
    public static void main(String[] args) {
        Car car = new Car("Red",3,400);
        Car.Engine engine = car.new Engine(100);
        System.out.println(car);
        System.out.println(engine);
    }
}
