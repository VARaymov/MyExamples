package шаблоны_порождающие_creational.шаблон_фабрика_factory.ex2;

public class CarFactory {
    public static Car makeCar(int speed, String color, Engine engine) {
        return new Car(speed, color, engine);
    }
}
