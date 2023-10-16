package baratella_orario_.prj_baratella_orario.src;

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
                    System.out.println("Inserire i secondi: ");
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

        int oreIniz = h, minutiIniz = m, secondiIniz = s;

        do{
            do{
                checkScelta = false;
                System.out.println("\n0. Per uscire dal menu;" +
                        "\n1. Per visualizzare il numero di ore trascorse dalla mezzanotte;" +
                        "\n2. Per visualizzare il numero di minuti trascorsi dalla mezzanotte;" +
                        "\n3. Per visualizzare il numero di secondi trascorsi dalla mezzanotte;" +
                        "\n4. Per aumentare il numero di ore;" +
                        "\n5. Per aumentare il numero di minuti;" +
                        "\n6. Per aumentare il numero di secondi;");
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

                case 4:
                    boolean flagOreIncr = false;
                    int oreAgg = 0;

                    do{
                        try{
                            System.out.println("\nInserire il numero di ore che si vuole incrementare: ");
                            input = new Scanner(System.in);
                            oreAgg = input.nextInt();
                            flagOreIncr = true;
                        }catch (InputMismatchException e){
                            System.out.println("\nIl numero di ore deve essere un numero intero.");
                        }
                    }while(!flagOreIncr);
                    try{
                        classeOra.incrOre(oreAgg);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("\nIl nuovo orario è: " + classeOra.toString());
                    classeOra.resetOrario(oreIniz, minutiIniz, secondiIniz);
                    break;

                case 5:
                    boolean flagMinIncr = false;
                    int minAgg = 0;

                    do{
                        try{
                            System.out.println("\nInserire il numero di minuti che si vogliono incrementare: ");
                            input = new Scanner(System.in);
                            minAgg = input.nextInt();
                            flagMinIncr = true;
                        }catch (InputMismatchException e){
                            System.out.println("\nIl numero di minuti deve essere un numero intero.");
                        }
                    }while(!flagMinIncr);
                    try{
                        classeOra.incrMin(minAgg);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("\nIl nuovo orario è: " + classeOra.toString());
                    classeOra.resetOrario(oreIniz, minutiIniz, secondiIniz);
                    break;

                case 6:
                    boolean flagSecIncr = false;
                    int secAgg = 0;

                    do{
                        try{
                            System.out.println("\nInserire il numero di secondi che si vogliono incrementare: ");
                            input = new Scanner(System.in);
                            secAgg = input.nextInt();
                            flagSecIncr = true;
                        }catch (InputMismatchException e){
                            System.out.println("\nIl numero di secondi deve essere un numero intero.");
                        }
                    }while(!flagSecIncr);
                    try{
                        classeOra.incrSec(secAgg);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("\nIl nuovo orario è: " + classeOra.toString());
                    classeOra.resetOrario(oreIniz, minutiIniz, secondiIniz);
                    break;

                default:
                    System.out.println("\nLa scelta fatta non corrisponde a nessuna opzione del menu.");
                    break;
            }
        }while(scelta != 0);
    }
}
