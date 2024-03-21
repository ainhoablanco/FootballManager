package Football;

public abstract class Persona {
    protected static int nextId = 1; // Variable para llevar el conteo de los IDs
    protected int id;
    protected String nom;
    protected String cognom;
    protected String dataNeixament;
    protected int nivellMotivacio; // del 1 - 10//
    protected int souAnual;

    public Persona(int id, String nom, String cognom, String dataNeixament, int nivellMotivacio, int souAnual) {
        this.id = nextId++;
        if (id >= nextId) {
            nextId = id + 1;
        }
        this.nom = nom;
        this.cognom = cognom;
        this.dataNeixament = dataNeixament;
        if (nivellMotivacio < 1) {
            this.nivellMotivacio = 1;
        } else if (nivellMotivacio > 10) {
            this.nivellMotivacio = 10;
        } else {
            this.nivellMotivacio = nivellMotivacio;
        }
        this.souAnual = souAnual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getDataNeixament() {
        return dataNeixament;
    }

    public void setDataNeixament(String dataNeixament) {
        this.dataNeixament = dataNeixament;
    }

    public int getNivellMotivacio() {
        return nivellMotivacio;
    }

    public void setNivellMotivacio(int nivellMotivacio) {
        this.nivellMotivacio = nivellMotivacio;
    }

    public int getSouAnual() {
        return souAnual;
    }

    public void setSouAnual(int souAnual) {
        this.souAnual = souAnual;
    }
}
