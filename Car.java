package Heritage;

public class Car extends Vehicule {


    public Car(String marque, int kilometers){
        super(marque, kilometers);

    }


    @Override
    public void doStuff() {
        System.out.println("Je suis " +  getMarque() + " et je fais  vroum vroum");
    }
}
