package Tempo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OraTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Ora classeOra = null;

        int h = 0, m = 0, s = 0, scelta = -1;
        boolean checkScelta, checkOrario, checkH, checkM, checkS;

        do{
            checkOrario = false;
            do{
                checkH = false;
                try{
                    System.out.println("Inserire le ore: ");
                    input = new Scanner(System.in);
                    h = input.nextInt();
                    checkH = true;
                }catch (InputMismatchException e){
                    System.out.println("\nIl numero di ore deve essere un numero intero.");
                }
            }while(!checkH);
            do{
                checkM = false;
                try{
                    System.out.println("Inserire i minuti: ");
                    input = new Scanner(System.in);
                    m = input.nextInt();
                    checkM = true;
                }catch (InputMismatchException e){
                    System.out.println("\nIl numero di minuti deve essere un numero intero.");
                }
            }while(!checkM);
            do{
                checkS = false;
                try{
                    System.out.println("Inserire le ore: ");
                    input = new Scanner(System.in);
                    s = input.nextInt();
                    checkS = true;
                }catch (InputMismatchException e){
                    System.out.println("\nIl numero di ore deve essere un numero intero.");
                }
            }while(!checkS);
            try{
                classeOra = new Ora(h, m, s);
                checkOrario = true;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while(!checkOrario);

        do{
            do{
                checkScelta = false;
                System.out.println("\n0. Per uscire dal menu;" +
                        "\n1. Per visualizzare il numero di ore trascorse dalla mezzanotte;" +
                        "\n2. Per visualizzare il numero di minuti trascorsi dalla mezzanotte;" +
                        "\n3. Per visualizzare il numero di secondi trascorsi dalla mezzanotte;");
                try{
                    input = new Scanner(System.in);
                    scelta = input.nextInt();
                    checkScelta = true;
                }catch (InputMismatchException e){
                    System.out.println("\nLa scelta deve essere un numero intero.");
                }
            }while(!checkScelta);

            switch (scelta){
                case 0:
                    break;

                case 1:
                    System.out.println("\nIl numero di ore passate dalla mezzanotte sono: " + classeOra.getH());
                    break;

                case 2:
                    System.out.println("\nIl numero di minuti passati dalla mezzanotte sono: " + classeOra.minutiDallaMezzanotte());
                    break;

                case 3:
                    System.out.println("\nIl numero di secondi passati dalla mezzanotte sono: " + classeOra.secondiDallaMezzanotte());
                    break;

                default:
                    System.out.println("\nLa scelta fatta non corrisponde a nessuna opzione del menu.");
            }
        }while(scelta != 0);
    }
}
