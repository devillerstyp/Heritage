package Heritage;

public class Boat extends Vehicule {


    public Boat(String marque, int kilometers){
        super(marque, kilometers);

    }

    @Override
    public void doStuff() {
        System.out.println( "Je suis " +  getMarque() + " et je fais  glou glou");
    }



}
