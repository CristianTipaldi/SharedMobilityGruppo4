public class VeicoliMotorizzati extends Veicoli{

    public Patenti patenti; // tipologia di patente
    private String tipoCarburante; // benzina, gpl, ecc..

    private String targa;

    public VeicoliMotorizzati(int ID, double tariffa, boolean cascoRichiesto, Patenti patenti, String tipoCarburante, String targa){
        super(ID, tariffa, cascoRichiesto);

        this.patenti = patenti;
        this.tipoCarburante = tipoCarburante;
        this.targa = targa;

    }

    public Patenti getPatenteRichiesta(){
        return this.patenti;
    }

}
