package Football;
//clase entrenador
public class Entrenador extends Persona{
    private int numTornejosGuanyats;
    private boolean seleccionadorNacional;

    public Entrenador(int id, String nom, String cognom, String dataNeixament, int nivellMotivacio, int souAnual, int numTornejosGuanyats, boolean seleccionadorNacional) {
        super(id, nom, cognom, dataNeixament, nivellMotivacio, souAnual);
        this.id = id;
        this.numTornejosGuanyats = numTornejosGuanyats;
        this.seleccionadorNacional = seleccionadorNacional;
    }

    public Entrenador(String nom, String cognom, String dataNeixament, int nivellMotivacio, int souAnual, int numTornejosGuanyats, boolean seleccionadorNacional) {
        super(nextId++, nom, cognom, dataNeixament, nivellMotivacio, souAnual);
        this.id = nextId - 1;
        this.numTornejosGuanyats = numTornejosGuanyats;
        this.seleccionadorNacional = seleccionadorNacional;
    }

    public int getNumTornejosGuanyats() {
        return numTornejosGuanyats;
    }

    public void setNumTornejosGuanyats(int numTornejosGuanyats) {
        this.numTornejosGuanyats = numTornejosGuanyats;
    }

    public boolean isSeleccionadorNacional() {
        return seleccionadorNacional;
    }

    public void setSeleccionadorNacional(boolean seleccionadorNacional) {
        this.seleccionadorNacional = seleccionadorNacional;
    }
}
