package Veicolo;

public class Moto extends VeicoloAMotore {

    private int tempi;


    public Moto(String marca, int anno, int cilindrata, int tempi) {
        super(marca, anno, cilindrata);
        this.tempi=tempi;
    }

    @Override
    public String getInfoVeicoli() {
        return super.getInfoVeicoli() + "a "+ tempi+" tempi.";
    }
}