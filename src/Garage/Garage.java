package Garage;
import Veicolo.VeicoloAMotore;
import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<VeicoloAMotore> myGarage = new ArrayList<>() ;
    private final int maxPosti = 15;

    public List<VeicoloAMotore> getMyGarage() {
        return myGarage;
    }

    public void setMyGarage(List<VeicoloAMotore> myGarage) {
        this.myGarage = myGarage;
    }

    public int getMaxPosti() {
        return maxPosti;
    }

    /**
     * This method takes a vehicle as parameter and it adds it to the garage(list)
     * If the garage is full it won't add the vehicle but it will print an error message
     * @param veicoloAMotore the vehicle that we are working with
     */
    public void parcheggiaVeicolo (VeicoloAMotore veicoloAMotore) {
        if(myGarage.size()<=maxPosti) {
            myGarage.add(veicoloAMotore);
        } else {
            System.out.println("Error : the garage is full");
        }
    }
    /**
     * This method takes a vehicle as parameter and it removes it from the garage
     * Then it returns the vehicle
     * @param veicoloAMotore the vehicle that we are working with
     */
    public VeicoloAMotore rimuoviVeicolo(VeicoloAMotore veicoloAMotore){
        myGarage.remove(getMyGarage().indexOf(veicoloAMotore));
        return veicoloAMotore;
    }
}
