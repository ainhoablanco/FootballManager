package Football;

public class Entrenador extends Persona{
    private int numTornejosGuanyats;
    private boolean seleccionadorNacional;

    public Entrenador(int id, String nom, String cognom, String dataNeixament, int nivellMotivacio, int souAnual, int numTornejosGuanyats, boolean seleccionadorNacional) {
        super(id, nom, cognom, dataNeixament, nivellMotivacio, souAnual);
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
