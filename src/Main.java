import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        SharedMobility sharedMobility = new SharedMobility();
        Veicoli auto = new Auto(1, 5, false, Patenti.B, "diesel", "123bbb455");
        Veicoli motorino = new Motorino(2, 3, true, Patenti.A, "diesel", "122cd455");
        Veicoli furgoncino = new Furgoncino(3, 10, false, Patenti.B, "diesel", "123bbb455");
        Veicoli bici = new Bici(4, 2, true);
        Veicoli monopattino = new Monopattino(5, 4, true);
        Utenti utente1 = new Utenti(10,false, Patenti.A, "Mario", "Rossi", "12/12/12", "TKJDKA23", 0.0);
        Database database = new Database();
        database.addUtente(utente1);
        Utenti utente2 = new Utenti(11,false, Patenti.A, "Antonio", "fossi", "12/10/10", "TKsdfsKA23", 0.0);
        database.addUtente(utente2);
        Utenti utente3 = new Utenti(12,false, Patenti.B, "Sergio", "Rossi", "12/12/12", "TKJDKA23", 0.0);
        database.addUtente(utente3);
        Utenti utente4 = new Utenti(13,true, Patenti.A, "Paolo", "fossi", "12/10/10", "TKsdfsKA23", 0.0);
        database.addUtente(utente4);
        Utenti utente5 = new Utenti(14,true, Patenti.A, "Saverio", "Rossi", "12/12/12", "TKJDKA23", 0.0);
        database.addUtente(utente5);
        Utenti utente6 = new Utenti(15,true, Patenti.A, "Cristian", "fossi", "12/10/10", "TKsdfsKA23", 0.0);
        database.addUtente(utente6);
        Utenti utente7 = new Utenti(16,false, Patenti.A, "Sebastiano", "Rossi", "12/12/12", "TKJDKA23", 0.0);
        database.addUtente(utente7);
        Utenti utente8 = new Utenti(17,false, Patenti.B, "Salvatore", "fossi", "12/10/10", "TKsdfsKA23", 0.0);
        database.addUtente(utente8);
        Utenti utente9 = new Utenti(18,true, Patenti.A, "Franco", "Rossi", "12/12/12", "TKJDKA23", 0.0);
        database.addUtente(utente9);
        Utenti utente10 = new Utenti(19,false, Patenti.A, "Mimmo", "fossi", "12/10/10", "TKsdfsKA23", 0.0);
        database.addUtente(utente10);
        System.out.println(database.toString());

        utente3.addCredito(90);
        utente9.addCredito(80);
        utente1.addCredito(25);
        utente5.addCredito(80);
        utente6.addCredito(140);

        sharedMobility.addVeicolo(auto);
        sharedMobility.addVeicolo(motorino);
        sharedMobility.addVeicolo(furgoncino);
        sharedMobility.addVeicolo(bici);
        sharedMobility.addVeicolo(monopattino);

        sharedMobility.ricercaVeicolo();

        sharedMobility.richiestaAffitto(utente3, auto, 6 );
        sharedMobility.richiestaAffitto(utente9, bici, 3 );
        sharedMobility.richiestaAffitto(utente1, monopattino, 10 );
        sharedMobility.richiestaAffitto(utente5, furgoncino, 6 );
        sharedMobility.richiestaAffitto(utente6, motorino, 10 );

        System.out.println("");
        sharedMobility.ricercaVeicolo();


    }
}
