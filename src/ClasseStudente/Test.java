package ClasseStudente;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Studente[] studenti = new Studente[4];

        Classe classe = null;
        Studente studente = null;

        try{
            studenti[0] = new Studente("rOssI", "MArIO");
            studenti[1] = new Studente("v     eR d  I", "GiUsEpPe");
            studenti[2] = new Studente("b  i A n        Chi" , "    l u C a");
            studente = new Studente("v   e RdI", "S imonE ");
            studenti[3] = new Studente(studente);
            classe = new Classe(studente, studenti);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(classe.toString());

        Studente[] classe2 = classe.getStudenti();
        System.out.println("\nArray per visualizzazione studenti: \n" + Arrays.toString(classe2));

        //verifico che l'aggregazione stretta funzioni
        try{
            classe2[0] = new Studente(studenti[0].getCognome(), classe2[0].getNome());
            classe2[0].setCognome("modifica");
            System.out.println("\nArray clone dopo la modifica: \n" + Arrays.toString(classe2) + "\nArray iniziale dopo la modifica: \n" + classe.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //controllo il metodo inverti attributi
        try{
            Studente std = new Studente("  P a o lO", "paolI");
            classe.setCapoClasse(std);
            classe.invertiAttributi();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("\nArray studenti con capo classe diverso e inversione attributi: \n" + classe.toString());
    }
}
