package Football;

import java.util.ArrayList;

public class Equip {
    private String nomEquip;
    private int anyFundacio;
    private String ciutat;
    private String estadi;
    private String president;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadors;


    public Equip(String nomEquip, int anyFundacio, String ciutat, String estadi, String president, Entrenador entrenador, ArrayList<Jugador> jugadors) {
        this.nomEquip = nomEquip;
        this.anyFundacio = anyFundacio;
        this.ciutat = ciutat;
        this.estadi = estadi;
        this.president = president;
        this.entrenador = entrenador;
        this.jugadors = jugadors;
    }

    public ArrayList<Jugador> getJugadors() {
        return jugadors;
    }

    public void setJugadors(ArrayList<Jugador> jugadors) {
        this.jugadors = jugadors;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
    public String getNomEquip() {
        return nomEquip;
    }

    public int getAnyFundacio() {
        return anyFundacio;
    }

    public String getCiutat() {
        return ciutat;
    }

    public String getEstadi() {
        return estadi;
    }

    public String getPresident() {
        return president;
    }

    public void setNomEquip(String nomEquip) {
        this.nomEquip = nomEquip;
    }

    public void setAnyFundacio(int anyFundacio) {
        this.anyFundacio = anyFundacio;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

    public void setEstadi(String estadi) {
        this.estadi = estadi;
    }

    public void setPresident(String president) {
        this.president = president;
    }
}

