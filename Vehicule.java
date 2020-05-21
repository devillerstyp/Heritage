package Heritage;

public abstract class Vehicule {
    // Attributs
    private String marque;
    private int kilometers;

    // constructors
    public Vehicule(String marque, int kilometers) {
        this.marque = marque;
        this.kilometers = kilometers;
    }


    // setters
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    // getters
    public String getMarque() {
        return marque;
    }

    public int getKilometers() {
        return kilometers;
    }

    public abstract void doStuff();


}
