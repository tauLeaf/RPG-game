package tau;

public class Test {

}

class Car {
    public String brand;
    public String model;
    public String color;
    public int years;
    public int doors;
    public boolean airConditioning;

    public Car(String brand, String model, String color, int years, int doors, boolean airConditioning) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.years = years;
        this.doors = doors;
        this.airConditioning = airConditioning;
    }
}

abstract class CarBuilder {
    public abstract CarBuilder setBrand(String brand);

    public abstract CarBuilder setModel(String model);

    public abstract CarBuilder setColor(String color);

    public abstract CarBuilder setYear(int years);

    public abstract CarBuilder setDoors(int doors);

    public abstract CarBuilder setAirConditioning(boolean airConditioning);

    public abstract Car getResult();
}

class ConcreteCarBuilder extends CarBuilder {
    public String brand;
    public String model;
    public String color;
    public int years;
    public int doors;
    public boolean airConditioning;

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setYear(int years) {
        this.years = years;
        return this;
    }

    public CarBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public CarBuilder setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
        return this;
    }

    public Car getResult() {
        return new Car(brand, model, color, years, doors, airConditioning);
    }
}