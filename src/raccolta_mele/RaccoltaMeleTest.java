package raccolta_mele;

import Tempo.Data;
import javafx.animation.ScaleTransition;

import javax.sound.midi.MidiMessage;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RaccoltaMeleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int scelta = -1, dim = 0;
        boolean checkScelta;

        GestioneRaccolto gest = null;
        Data data = null;

        do{
            try{
                System.out.println("\nInserire il numero di giornate che si vogliono inserire: ");
                input = new Scanner(System.in);
                dim = input.nextInt();
                gest = new GestioneRaccolto(dim);
            }catch (InputMismatchException e){
                System.out.println("\nIl numero di giornate deve essere un numero intero.");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while(dim <= 0);

        do {
            do {
                checkScelta = false;
                System.out.println("\n0. Per uscire dal menu;" +
                        "\n1. Per inserire una nuova giornata di raccolto;" +
                        "\n2. Per visualizzare tutte le giornate in cui c'è stato un raccolto;" +
                        "\n3. Per visualizzare il giorno in cui c'è stata la massima raccolta;" +
                        "\n4. Per visualizzare la raccolta media giornaliera;" +
                        "\n5. Per visualizzare le giornate dove la raccolta supera una certa soglia;" +
                        "\n6. Per visualizzare i quintali raccolti in una certa data;" +
                        "\n7. Per visualizzare il totale dei quintali raccolti;");
                try {
                    input = new Scanner(System.in);
                    scelta = input.nextInt();
                    checkScelta = true;
                } catch (InputMismatchException e) {
                    System.out.println("\nLa scelta deve essere un numero intero.");
                }
            } while (!checkScelta);

            switch (scelta){
                case 0:
                    break;

                case 1:
                    int gg = 0, mm = 0, aa = 0;
                    float quintali;
                    boolean checkG = false, checkM = false, checkA = false;
                    do{
                        try{
                            System.out.println("\nInserire il giorno: ");
                            input = new Scanner(System.in);
                            gg = input.nextInt();
                            checkG = true;
                        }catch (InputMismatchException e){
                            System.out.println("\nIl giorno deve essere un numero intero.");
                        }
                    }while(!checkG);
                    do{
                        try{
                            System.out.println("\nInserire il mese: ");
                            input = new Scanner(System.in);
                            mm = input.nextInt();
                            checkM = true;
                        }catch (InputMismatchException e){
                            System.out.println("\nIl mese deve essere un numero intero.");
                        }
                    }while(!checkM);
                    do{
                        try{
                            System.out.println("\nInserire l'anno: ");
                            input = new Scanner(System.in);
                            aa = input.nextInt();
                            checkA = true;
                        }catch (InputMismatchException e){
                            System.out.println("\nL'anno deve essere un numero intero.");
                        }
                    }while(!checkA);
                    System.out.println("\nInserire il numero di quintali raccolti in questa giornata: ");
                    input = new Scanner(System.in);
                    quintali = input.nextFloat();
                    try{
                        data = new Data(gg, mm, aa);
                        System.out.println("\nGiornata inserita.");
                        gest.setRaccolto(data, quintali);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println(gest.toString());
                    break;

                case 3:
                    try{
                        System.out.println(gest.massimaRaccolta());
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("\nLa raccolta media giornaliera è: " + gest.raccoltaMediaGiornaliera());
                    break;

                case 5:
                    float soglia;
                    System.out.println("\nInserire la soglia: ");
                    input = new Scanner(System.in);
                    soglia = input.nextFloat();
                    int dimLogArrGiornSopraSoglia = gest.numGiorniSopraTot(soglia);
                    Raccolto[] giornateSopraSoglia = new Raccolto[dimLogArrGiornSopraSoglia];
                    if(dimLogArrGiornSopraSoglia == 0){
                        System.out.println("\nNon ci sono giornate che superano questa soglia.");
                    }else{
                        try{
                            int dimGiornateSopraSoglia = gest.giornateSopraTot(soglia, giornateSopraSoglia);
                            System.out.println("\nLe giornate che superano la soglia sono: ");
                            for(int i = 0; i < dimGiornateSopraSoglia; i++){
                                System.out.println("\nGiorno: " + giornateSopraSoglia[i].getData()  + " | Quintali raccolti: " + giornateSopraSoglia[i].getQuintali());
                            }
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    }
                    break;

                case 6:
                    gg = 0;
                    mm = 0;
                    aa = 0;
                    checkG = false;
                    checkM = false;
                    checkA = false;
                    do{
                        try{
                            System.out.println("\nInserire il giorno: ");
                            input = new Scanner(System.in);
                            gg = input.nextInt();
                            checkG = true;
                        }catch (InputMismatchException e){
                            System.out.println("\nIl giorno deve essere un numero intero.");
                        }
                    }while(!checkG);
                    do{
                        try{
                            System.out.println("\nInserire il mese: ");
                            input = new Scanner(System.in);
                            mm = input.nextInt();
                            checkM = true;
                        }catch (InputMismatchException e){
                            System.out.println("\nIl mese deve essere un numero intero.");
                        }
                    }while(!checkM);
                    do{
                        try{
                            System.out.println("\nInserire l'anno: ");
                            input = new Scanner(System.in);
                            aa = input.nextInt();
                            checkA = true;
                        }catch (InputMismatchException e){
                            System.out.println("\nL'anno deve essere un numero intero.");
                        }
                    }while(!checkA);
                    try{
                        data = new Data(gg, mm, aa);
                        System.out.println("\nI quintali raccolti in data " + gg + "/" + mm + "/" + aa + " è: " + gest.quintaliData(data));
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    System.out.println("\nIl totale dei quintali raccolti è: " + gest.totRaccolta());
                    break;

                default:
                    System.out.println("\nLa scelta fatta non corrisponde a nessuna opzione del menu.");
                    break;
            }
        }while(scelta != 0);
    }
}
