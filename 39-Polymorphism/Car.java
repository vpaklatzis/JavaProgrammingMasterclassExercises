public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        wheels = 4;
        engine = true;
    }
    
    public String startEngine() {
        return "Car --> startEngine()";
    }
    
    public String accelerate() {
        return "Car --> accelerate()";
    }
    
    public String brake() {
        return "Car --> brake()";
    }
    
    public String getName() {
        return name;
    }
    
    public int getCylinders() {
        return cylinders;
    }
}
