import Veicolo.Macchina;
import Veicolo.Moto;

public class Start {

    public static void main(String[] args) {
        Macchina macchina1 = new Macchina("Peugeout",2012,1.2,"diesel", 5);
        Macchina macchina2 = new Macchina("Fiat",2018,1.6,"diesel", 5);
        Macchina macchina3 = new Macchina("Mercedes",2020,3.2,"benzina", 5);


        Moto moto1 = new Moto ("Honda",2020,600, 2);
        Moto moto2 = new Moto("Yamaha", 2018,750,4);
        Moto moto3 = new Moto("Aprilia", 2022, 1000,4);

    }
}
