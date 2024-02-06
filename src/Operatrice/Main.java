package Operatrice;

public class Main {
    public static void main(String[] args) {
        // Test dei metodi della classe Operatrice

        // Creazione di un'istanza di Operatrice con valori Integer
        try {
            Operatrice<Integer> operatriceInt = new Operatrice<>(5, 3);
            System.out.println("Valore 1: " + operatriceInt.getVal1());
            System.out.println("Valore 2: " + operatriceInt.getVal2());
            System.out.println("Somma: " + operatriceInt.somma());
            System.out.println("Sottrazione: " + operatriceInt.sottrazione());
            System.out.println("Moltiplicazione: " + operatriceInt.moltiplicazione());
            System.out.println("Divisione: " + operatriceInt.divisione());
            System.out.println("Tipo Valore 1: " + operatriceInt.tipoVal1());
            System.out.println("Tipo Valore 2: " + operatriceInt.tipoVal2());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Creazione di un'istanza di Operatrice con valori String
        try {
            System.out.println("\n");
            Operatrice<String> operatriceString = new Operatrice<>("Hello, ", "world!");
            System.out.println("Valore 1: " + operatriceString.getVal1());
            System.out.println("Valore 2: " + operatriceString.getVal2());
            System.out.println("Somma: " + operatriceString.somma());
            System.out.println("Sottrazione: " + operatriceString.sottrazione());
            System.out.println("Moltiplicazione: " + operatriceString.moltiplicazione());
            System.out.println("Divisione: " + operatriceString.divisione());
            System.out.println("Tipo Valore 1: " + operatriceString.tipoVal1());
            System.out.println("Tipo Valore 2: " + operatriceString.tipoVal2());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Creazione di un'istanza di Operatrice con valori Boolean
        try {
            System.out.println("\n");
            Operatrice<Boolean> operatriceString = new Operatrice<>(true, false);
            System.out.println("Valore 1: " + operatriceString.getVal1());
            System.out.println("Valore 2: " + operatriceString.getVal2());
            System.out.println("Somma: " + operatriceString.somma());
            System.out.println("Sottrazione: " + operatriceString.sottrazione());
            System.out.println("Moltiplicazione: " + operatriceString.moltiplicazione());
            System.out.println("Divisione: " + operatriceString.divisione());
            System.out.println("Tipo Valore 1: " + operatriceString.tipoVal1());
            System.out.println("Tipo Valore 2: " + operatriceString.tipoVal2());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Creazione di un'istanza di Operatrice con valori Boolean
        try {
            System.out.println("\n");
            Operatrice<Boolean> operatriceString = new Operatrice<>(true, true);
            System.out.println("Valore 1: " + operatriceString.getVal1());
            System.out.println("Valore 2: " + operatriceString.getVal2());
            System.out.println("Somma: " + operatriceString.somma());
            System.out.println("Sottrazione: " + operatriceString.sottrazione());
            System.out.println("Moltiplicazione: " + operatriceString.moltiplicazione());
            System.out.println("Divisione: " + operatriceString.divisione());
            System.out.println("Tipo Valore 1: " + operatriceString.tipoVal1());
            System.out.println("Tipo Valore 2: " + operatriceString.tipoVal2());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

