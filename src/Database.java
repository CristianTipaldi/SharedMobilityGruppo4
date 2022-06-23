public class Database {

    Utenti[] ListUtenti= new Utenti[10];
    int count = 0;
    public Database(){


    }

    public void addUtente(Utenti utente){

        this.ListUtenti[count] =  new Utenti(utente.getUtenteId(), utente.gethaCasco(), utente.getPatenti(), utente.getNome(), utente.getCognome(), utente.getDataDiNascita(), utente.getCodiceFiscale(), utente.getSaldoUtente());
        this.count++;

    }

    public String toString(){
        String s = "";
        for (int i = 0; i < this.ListUtenti.length; i++) {
            s += "L'utente"+ i +  "è: " + String.valueOf(this.ListUtenti[i]) + "\n";
        }
        return s;

    }



}
