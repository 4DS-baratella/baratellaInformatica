package Studente;

public class Test {
    public static void main(String[] args) {
        try{
            // Creazione di oggetti Persona e Studente per il test
            Persona persona = new Persona("Rossi", "Marco", "RSSMRC95M16H224T");
            Studente studente = new Studente("Bianchi", "Giulia", "BNCGLI98M18H345R", "01/01/1998");

            // Stampa delle informazioni delle persone
            System.out.println("Informazioni Persona:");
            System.out.println(persona.toString());

            System.out.println("\nInformazioni Studente:");
            System.out.println(studente.toString());

            // Test del metodo verificaOmonimia
            Persona altraPersona = new Persona("Rossi", "Marco", "RSSXYZ00M00H000X");
            boolean sonoOmonime = persona.verificaOmonimia(altraPersona);
            System.out.println("\nLe due persone sono omonime? " + sonoOmonime);

            // Test del metodo clone per Studente
            Studente studenteClone = studente.clone();
            System.out.println("\nStudente originale: " + studente.toString());
            System.out.println("Copia dello studente: " + studenteClone.toString());

            // Modifica del clone e verifica dell'indipendenza
            studenteClone.setNome("Giovanni");
            System.out.println("\nStudente originale dopo la modifica del clone: " + studente.toString());
            System.out.println("Copia dello studente dopo la modifica: " + studenteClone.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
