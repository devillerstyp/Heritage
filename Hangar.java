package Heritage;

public class Hangar {
    public static void main(String[] args) {
        // donald receives a reference to a new instance of class Duck
        Car clio = new Car("Clio", 195);
        clio.doStuff();
        Boat bmw = new Boat("BMW", 150);
        bmw.doStuff();

    }
}
