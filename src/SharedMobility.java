public class SharedMobility {

    private Veicoli[] ListVeicoli = new Veicoli[6];
    private int count = 0;

    public SharedMobility(){



    }

    public void addVeicolo(Veicoli veicolo){

        if(count < ListVeicoli.length -1) {
            this.ListVeicoli[count] = veicolo;
            count++;
        }

    }

    public boolean richiestaAffitto(Utenti utente, Veicoli veicolo, int richiestaMinuti){


        if (richiestaMinuti < 5) {
            System.out.println(" La richiesta deve superare i 5 minuti.");
            return false;
        }
        if (veicolo.getID() == 1 || veicolo.getID() == 3) {
            if (utente.getPatenti() == Patenti.B) {
                if (utente.getSaldoUtente() >= (veicolo.getTariffa() * richiestaMinuti)) {
                    for (int i = 0; i < ListVeicoli.length -1 ; i++) {
                        if(this.ListVeicoli[i].getID() == veicolo.getID()){
                        this.ListVeicoli[i].setStatoVeicolo();
                        return ListVeicoli[i].getStatoVeicolo();
                        }
                    }
                }
            }
            else if (utente.getPatenti() != Patenti.B) {
                System.out.println("Patente non adatta");
            }
        }
        if (veicolo.getID() == 2 ) {
            if (utente.getPatenti() == Patenti.A && utente.gethaCasco() == true) {
                if (utente.getSaldoUtente() >= (veicolo.getTariffa() * richiestaMinuti)) {
                    for (int i = 0; i < ListVeicoli.length -1 ; i++) {
                        if(this.ListVeicoli[i].getID() == veicolo.getID()){
                            this.ListVeicoli[i].setStatoVeicolo();
                            return ListVeicoli[i].getStatoVeicolo();
                        }
                    }
                }
            } else if (utente.getPatenti() != Patenti.A) {
                System.out.println("Patente non adatta");
            }
        }
        if (veicolo.getID() == 4 || veicolo.getID() == 5 ) {
            if (utente.gethaCasco() == true) {
                if (utente.getSaldoUtente() >= (veicolo.getTariffa() * richiestaMinuti)) {
                    for (int i = 0; i < ListVeicoli.length -1 ; i++) {
                        if(this.ListVeicoli[i].getID() == veicolo.getID()){
                            this.ListVeicoli[i].setStatoVeicolo();
                            return ListVeicoli[i].getStatoVeicolo();
                        }
                    }
                }
            }
        }


        return false;
    }


    public void ricercaVeicolo(){
        for(int i = 0; i < ListVeicoli.length -1 ; i++){
            if(ListVeicoli[i].getStatoVeicolo() == true){
                System.out.println(ListVeicoli[i].toString());
            }
        }
    }

    public void lasciaVeicolo(Veicoli veicolo){

        if (veicolo.getStatoVeicolo() == false){
            veicolo.setStatoVeicolo();
        }
        else {
            System.out.println("il veicolo è libero");
        }
    }

    public Veicoli[] getListVeicoli() {
        return ListVeicoli;
    }
}
