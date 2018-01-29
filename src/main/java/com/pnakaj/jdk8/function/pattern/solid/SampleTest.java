package com.pnakaj.jdk8.function.pattern.solid;

/**
 * Created by pankaj on 1/28/2018.
 */
public class SampleTest {

    public static void main(String[] args) {
        Car car1 = new Car(2015, new TurboEngine());
        System.out.println(car1);
        Car car2 = new Car(car1);
        System.out.println(car2);
    }
}

class Engine {
    public Engine() {
    }

    protected Engine(Engine engine) {
    }

    public String toString() {
        return getClass().getName() + ":" + hashCode();
    }

}

class TurboEngine extends Engine {

    public TurboEngine() {

    }

    public TurboEngine(TurboEngine other) {
        super(other);
    }

}

class Car {
    private int year;
    private Engine engine;

    public Car(int year, Engine engine) {
        this.year = year;
        this.engine = engine;
    }

    public Car(Car other) {
        year = other.year;
        engine = new Engine(other.engine);
    }

    @Override
    public String toString() {
        return year + "-" + engine;
    }
}




