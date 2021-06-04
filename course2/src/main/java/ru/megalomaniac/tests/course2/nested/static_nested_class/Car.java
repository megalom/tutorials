package ru.megalomaniac.tests.course2.nested.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    // Мы можем обращаться к статичным переменным вложенного статичного класа
    // Мы можем обращаться к приватным переменным экземпляра объекта статичного класса
    // Engine engine = new Engine(100);
    // engine.horsePower = 100;
    public void method(){
        System.out.println(Engine.countOfObjects);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    // Статический вложенный класс может иметь модификатор доступа. Т.к.
    // модификтаор доуступа public, то мы можем создать объект класса Engine
    // извне используя путь до класса - Car.Engine engine = new Car.engine(100);
    // По сути используется как обычный внешний класс.
    // static nested class может быть final, abstract,может extends, implements
    // может содержать статичные и не статичные элементы.
    // можно получать доступ к статическим полям внешнего класса,
    // но нельзя получить доступ к нестатичным
    public static class Engine{
        int horsePower;
        static int countOfObjects;

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

class Test{
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(100);
        System.out.println("Engine: "+engine);
        Car car = new Car("Yellow", 5,engine);
        System.out.println(car);
    }
}
