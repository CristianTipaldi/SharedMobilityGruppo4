public class Utenti {

    private int utenteId;
    private boolean haCasco;
    private Patenti patenti;
    private String nome;
    private String cognome;
    private String dataDiNascita;
    private String codiceFiscale;
    private double saldoUtente;

   public Utenti(int utenteId,boolean haCasco, Patenti patenti, String nome, String cognome, String dataDiNascita, String codiceFiscale, double saldoUtente){
       this.utenteId = utenteId;
       this.haCasco = haCasco;
       this.patenti = patenti;
       this.nome = nome;
       this.cognome = cognome;
       this.dataDiNascita = dataDiNascita;
       this.codiceFiscale = codiceFiscale;
       this.saldoUtente = saldoUtente;

   }

    public void addCredito(double saldoUtente){
       this.saldoUtente += saldoUtente;
   }

    public int getUtenteId() {
        return utenteId;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public String getCognome() {
        return cognome;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public String getNome() {
        return nome;
    }

    public boolean gethaCasco(){
       return haCasco;
    }

    public double getSaldoUtente() {
        return this.saldoUtente;
    }

    public Patenti getPatenti(){
       return this.patenti;
    }

    public boolean isVeicolo(Veicoli veicolo){

       boolean isAffittato = veicolo.getStatoVeicolo();

       return  isAffittato;
    }

    @Override
    public String toString() {
        return "Utenti{" +
                "utenteId=" + utenteId +
                ", haCasco=" + haCasco +
                ", patenti=" + patenti +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita='" + dataDiNascita + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", saldoUtente=" + this.saldoUtente +
                '}';
    }
}
