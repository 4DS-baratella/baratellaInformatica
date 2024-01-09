package CorrezioneVerifica.baratella;

import java.util.Arrays;

public class Cognome {
    public static void main(String[] args){
        try{
            Data data1 = new Data(12, 12, 2020);
            Data data2 = new Data(13, 12, 2020);

            /*
            Persona persona1 = new Persona("Rossi", "Marco", data1);
            Persona persona2 = new Persona("Bianchi", "Mario", data2);

            Studente studente1 = new Studente(4, false, "Rossi", "Marco", data1);
            Studente studente2 = new Studente(3, true, "Bianchi", "Mario", data2);

            StudenteObj studenteObj1 = new StudenteObj(4, false, "Rossi", "Marco", data1);
            StudenteObj studenteObj2 = new StudenteObj(3, true, "Bianchi", "Mario", data2);


            //Verifico i metodi della classe Persona
            System.out.println(persona1.info());
            System.out.println(persona2.info());

            System.out.println("\nVerifica omonimia tra due persone non omonime: ");
            if(persona1.verificaOmonimia(persona2)){
                System.out.println("Le persone sono omonime.");
            }else{
                System.out.println("Le persone non sono omonime.");
            }

            System.out.println("\nVerifica omonimia tra due persone omonime: ");
            if(persona1.verificaOmonimia(persona1)){
                System.out.println("Le persone sono omonime.");
            }else{
                System.out.println("Le persone non sono omonime.");
            }

            System.out.println("\nL'età di persona1 è: " + persona1.calcolaEta() + " anni.");
            System.out.println("\nL'età di persona2 è: " + persona2.calcolaEta() + " anni.");


            //Verifico i metodi della classe Studente
            System.out.println(studente1.info());
            System.out.println(studente2.info());

            System.out.println("\nVerifica omonimia tra due studenti non omonimi: ");
            if(studente1.verificaOmonimia(studente2)){
                System.out.println("Gli studenti sono omonimi.");
            }else{
                System.out.println("Gli studenti non sono omonimi.");
            }

            System.out.println("\nVerifica omonimia tra due studente omonimi: ");
            if(studente1.verificaOmonimia(studente1)){
                System.out.println("Gli studenti sono omonimi.");
            }else{
                System.out.println("Gli studenti non sono omonimi.");
            }

            studente1.aggiungiVoto((float)7.5);
            studente1.aggiungiVoto((float)6.25);
            studente1.aggiungiVoto((float)8);

            System.out.println("\nVoti studente 1 prima dell'eliminazione: " + Arrays.toString(studente1.getVoti()));

            studente1.rimuoviVoto(2);

            System.out.println("\nVoti studente 1 dopo l'eliminazione: " + Arrays.toString(studente1.getVoti()));

            System.out.println("\nVerifica metodo promuovi senza parametri su studente1 (momentaneamente in quarta):");
            if(studente1.promuovi()){
                System.out.println("Studente promosso.");
            }else{
                System.out.println("Studente non promosso perché già in quinta.");
            }

            System.out.println("\nVerifica metodo promuovi con parametri su studente2 (momentaneamente in terza, promuovendolo di 3 classi):");
            if(studente2.promuovi(3)){
                System.out.println("Studente promosso.");
            }else{
                System.out.println("Studente non promosso perchè la classe corrente sommata al numero di classi da promuovere è maggiore di 5.");
            }


            //Verifico i metodi della classe StudenteObj
            System.out.println(studenteObj1.info());
            System.out.println(studenteObj2.info());

            System.out.println("\nVerifica tra oggetti di StudenteObj non uguali: ");
            if(studente1.verificaOmonimia(studente2)){
                System.out.println("Gli oggetti sono uguali.");
            }else{
                System.out.println("Gli oggetti non sono uguali.");
            }

            System.out.println("\nVerifica tra oggetti di StudenteObj uguali: ");
            if(studente1.verificaOmonimia(studente1)){
                System.out.println("Gli oggetti sono uguali.");
            }else{
                System.out.println("Gli oggetti non sono uguali.");
            }

            System.out.println("\nVerifico che gli hashCode generati tra oggetti uguali (quindi con gli stessi attributi) siano diversi: ");
            StudenteObj studenteObj3 = new StudenteObj(4, false, "Rossi", "Marco", data1);
            System.out.println(studenteObj1.hashCode());
            System.out.println(studenteObj3.hashCode());

            System.out.println("\nVerifica ovveride metodo toString() nella classe StudenteObj" + studenteObj1.toString());

             */

            System.out.println("Giorni di differenza tra le due date: " + data1.differenzaInGiorni(data1, data2));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}