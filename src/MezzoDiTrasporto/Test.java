package MezzoDiTrasporto;

import java.util.Random;

public class Test {

    public static int calcoloCavalli(){
        Random rand = new Random();
        int n1 = rand.nextInt(100) + 100;
        int n2 = rand.nextInt(100) + 900;
        return rand.nextInt(n2 - n1 + 1) + n1;
    }
    public static void main(String[] args) {
        try {
            Persona p1 = new Persona("Mario", "Rossi", "AAAAAA00A00A000A",  30);
            Persona p2 = new Persona("Luigi", "Bianchi", "AAAAAA00A00A000A", 25);
            Persona p3 = new Persona("Simone", "Verdi", "AAAAAA00A00A000A", 35);
            Persona p4 = new Persona("Andrea", "Moscardelli", "AAAAAA00A00A000A", 40);

            //creazione di un'automobile
            Automobile auto = new Automobile(calcoloCavalli(), "Fiat");

            //aggiunta di passeggeri
            auto.aggiungiPasseggero(p1);
            auto.aggiungiPasseggero(p2);
            auto.aggiungiPasseggero(p3);
            auto.aggiungiPasseggero(p4);

            //stampa informazioni sull'auto
            System.out.println("Informazioni sull'auto: " + auto.toString());

            //stampa dei passeggeri prima dell'ordinamento
            System.out.println("\nPasseggeri prima dell'ordinamento:");
            System.out.println(auto);

            //ordinamento dei passeggeri in ordine crescente di età
            auto.ordinaPasseggeriCrescente();
            System.out.println("\nPasseggeri ordinati per età crescente:");
            System.out.println(auto);

            //ordinamento dei passeggeri in ordine decrescente di età
            auto.ordinaPasseggeriDecrescente();
            System.out.println("\nPasseggeri ordinati per età decrescente:");
            System.out.println(auto);

            //stampa KW auto
            System.out.println("\nKw auto: " + auto.calcolaKw());

            //rimozione ultimo passeggero inserito
            auto.rimuoviUltimoPasseggero();

            //arrayList dopo rimozione ultimo passeggero
            System.out.println("\nArrayList dopo rimozione ultimo passeggero: " + auto.toString());

            //rimozione passeggero specifico
            auto.rimuoviPasseggero(p4);

            //arrayList dopo rimozione passeggero specifico
            System.out.println("\nArrayList dopo rimozione passeggero specifico: " + auto.toString());

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
