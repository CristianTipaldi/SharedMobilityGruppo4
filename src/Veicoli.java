public class Veicoli {

    public int ID;
    private boolean statoVeicolo;  // è libero o meno
    private int autonomia; // quantità residua di carburante
    private String posizione;
    private double tariffa;

    private boolean cascoRichiesto;



    public Veicoli(int ID, double tariffa, boolean cascoRichiesto){

        this.ID = ID;
        this.tariffa = tariffa;
        this.statoVeicolo = true;
        this.autonomia = 100;
        this.posizione = "posizione 0";
        this.cascoRichiesto = cascoRichiesto;

    }

    public void setStatoVeicolo(){
        if(this.statoVeicolo == true){
            this.statoVeicolo = false;
        }
        else {
            this.statoVeicolo = true;
        }
    }

    public void setPosizione(String posizione){
        this.posizione = posizione;
    }

    public void setAutonomia(int autonomia){
        this.autonomia = autonomia;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public String getPosizione() {
        return posizione;
    }

    public boolean getStatoVeicolo(){
        return this.statoVeicolo;
    }

    public int getID() {
        return ID;
    }

    public double getTariffa() {
        return tariffa;
    }

    public boolean getCascoRichiesto(){return this.cascoRichiesto;}

    @Override
    public String toString() {
        return "Veicoli{" +
                "Id veicolo = " + ID +
                "statoVeicolo=" + statoVeicolo +
                ", autonomia=" + autonomia +
                ", posizione='" + posizione + '\'' +
                ", tariffa=" + tariffa +
                ", cascoRichiesto=" + cascoRichiesto +
                '}';
    }
}
