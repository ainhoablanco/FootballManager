package Football;

public class Lliga {
    private String nomLliga;
    private int numeroEquips;

    public Lliga(String nomLliga, int numeroEquips) {
        this.nomLliga = nomLliga;
        this.numeroEquips = numeroEquips;
    }

    public String getNomLliga() {
        return nomLliga;
    }

    public void setNomLliga(String nomLliga) {
        this.nomLliga = nomLliga;
    }

    public int getNumeroEquips() {
        return numeroEquips;
    }

    public void setNumeroEquips(int numeroEquips) {
        this.numeroEquips = numeroEquips;
    }
}
