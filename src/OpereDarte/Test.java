package OpereDarte;

import java.time.DateTimeException;

public class Test {
    public static void main(String[] args) {
        try{
            //Creazione di cornici
            Cornice cornice1 = new Cornice(11, 9, 5);
            Cornice cornice2 = new Cornice(6, 4, 3);

            //Creazione di supporti
            Supporto supporto1 = new Supporto(21, 11, 6);
            Supporto supporto2 = new Supporto(22, 12, 7);

            // Creazione di opere d'arte
            Quadro quadro1 = new Quadro("La notte stellata", "Vincent van Gogh", 10, 8, cornice1);
            Scultura scultura1 = new Scultura("David", "Michelangelo", 20, 10, 5, supporto1);
            Quadro quadro2 = new Quadro("Mona Lisa", "Leonardo da Vinci", 8, 6, cornice2);

            //Stampo le opere d'arte
            System.out.println(quadro1.toString() + "\n" + scultura1.toString() + "\n" + quadro2.toString());

            // Creazione di una collezione
            Collezione collezione1 = new Collezione("Collezione 1", "Louvres", 10);

            // Inserimento delle opere d'arte nella collezione
            collezione1.inserireOpera(quadro1);
            collezione1.inserireOpera(scultura1);

            // Stampa delle informazioni sulla collezione
            System.out.println(collezione1.toString());

            //Creazione opera deperibile
            SculturaDeperibile sculturaDeperibile1 = new SculturaDeperibile("Banana", "Maruzio Cattelan", 5, 3, 2, 1, 3 ,supporto2);

            //Stampa opera deperibile
            System.out.println("\nIngombro opera deperibile appena creata: " + sculturaDeperibile1.ingombroIniziale() + "cm^3");
            System.out.println("\nIngombro opera deperibile ad adesso: " + sculturaDeperibile1.ingombro() + "cm^3");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
