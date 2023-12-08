class Car implements Cloneable {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

}

public class PrototypeDesignPatternExample {
        public static void main(String[] args) throws CloneNotSupportedException {
            Car prototypCar = new Car("sedan");
            Car carCopy = prototypCar.clone();

            System.out.println(prototypCar.getModel());
            System.out.println(carCopy.getModel());
            
        }
}
