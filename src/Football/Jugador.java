package Football;

public class Jugador extends Persona implements Transferible{
    private int dorsal;
    private String posicio;//POR, DEF, MIG, DAV//
    private int puntuacio; //entre 30 - 100//
    private Equip equip;

    public Jugador(int id, String nom, String cognom, String dataNeixament, int nivellMotivacio, int souAnual, int dorsal, String posicio, int puntuacio, Equip equip) {
        super(id, nom, cognom, dataNeixament, nivellMotivacio, souAnual);
        this.dorsal = dorsal;
        if (posicio.equals("POR") || posicio.equals("DEF") || posicio.equals("MIG") || posicio.equals("DAV")) {
            this.posicio = posicio;
        } else {
            this.posicio = "DAV";
            System.out.println("La posició proporcionada no és vàlida. S'estableix per defecte com a DAV.");
        }
        if (puntuacio < 30) {
            this.puntuacio = 30;
        } else if (puntuacio > 100) {
            this.puntuacio = 100;
        } else {
            this.puntuacio = puntuacio;
        }
        this.equip = equip;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicio() {
        return posicio;
    }

    public void setPosicio(String posicio) {
        this.posicio = posicio;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    @Override
    public void trasnferirAEquip(Equip e) {
        this.equip.getJugadors().remove(this);
        e.getJugadors().add(this);
    }

    @Override
    public void esTransferible() {

    }

    public Equip getEquip() {
        return equip;
    }

    public void setEquip(Equip equip) {
        this.equip = equip;
    }
}
