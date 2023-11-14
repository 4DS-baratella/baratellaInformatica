package OpereDarte;

import java.time.DateTimeException;

public class Test {
    public static void main(String[] args) {
        // Creazione di opere d'arte
        Quadro quadro1 = new Quadro("La notte stellata", "Vincent van Gogh", 100, 80);
        Scultura scultura1 = new Scultura("David", "Michelangelo", 200, 100, 50);
        Quadro quadro2 = new Quadro("Mona Lisa", "Leonardo da Vinci", 80, 60);

        // Creazione di una collezione
        Collezione collezione1 = new Collezione("Collezione 1", "Louvres", 10);

        // Inserimento delle opere d'arte nella collezione
        try{
            collezione1.inserireOpera(quadro1);
            collezione1.inserireOpera(scultura1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        // Stampa delle informazioni sulla collezione
        System.out.println(collezione1.toString());

        // Provo a stampare l'ingombro di un'opera non esistente nella collezione
        try{
            System.out.println("\nIngombro opera della collezione: " + collezione1.stampaIngombroOpera(quadro2) + " cm^3.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        // Stampo l'ingombro di un'opera della collezione
        try{
            System.out.println("\nIngombro opera della collezione: " + collezione1.stampaIngombroOpera(quadro1) + " cm^3.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
