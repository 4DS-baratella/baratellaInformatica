package segmentoPunto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int scelta = -1;
        float x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        boolean checkScelta, checkX1 = false, checkY1 = false, checkX2 = false, checkY2 = false;
        Punto punto1, punto2;

        do{
            System.out.println("Inserire il valore della X del punto 1: ");
            try{
                input = new Scanner(System.in);
                x1 = input.nextFloat();
                checkX1 = true;
            }catch (InputMismatchException e){
                System.out.println("\nLe coordinate devono essere un numero;");
            }
        }while(!checkX1);

        do{
            System.out.println("Inserire il valore della Y del punto 1: ");
            try{
                input = new Scanner(System.in);
                y1 = input.nextFloat();
                checkY1 = true;
            }catch (InputMismatchException e){
                System.out.println("\nLe coordinate devono essere un numero;");
            }
        }while(!checkY1);

        do{
            System.out.println("Inserire il valore della X del punto 2: ");
            try{
                input = new Scanner(System.in);
                x2 = input.nextFloat();
                checkX2 = true;
            }catch (InputMismatchException e){
                System.out.println("\nLe coordinate devono essere un numero;");
            }
        }while(!checkX2);

        do{
            System.out.println("Inserire il valore della Y del punto 2: ");
            try{
                input = new Scanner(System.in);
                y2 = input.nextFloat();
                checkY2 = true;
            }catch (InputMismatchException e){
                System.out.println("\nLe coordinate devono essere un numero;");
            }
        }while(!checkY2);

        punto1 = new Punto(x1, y1);
        punto2 = new Punto(x2, y2);
        Segmento segmento = new Segmento(punto1, punto2);

        do{
            do{
                checkScelta = false;
                System.out.println("\n0. Per uscire dal programma;" +
                        "\n1. Per modificare la X del punto 1;" +
                        "\n2. Per modificare la Y del punto 1;" +
                        "\n3. Per modificare la X del punto 2;" +
                        "\n4. Per modificare la Y del punto 2;" +
                        "\n5. Per traslare la X del punto 1;" +
                        "\n6. Per traslare la Y del punto 1;" +
                        "\n7. Per traslare la X del punto 2;" +
                        "\n8. Per traslare la Y del punto 2;" +
                        "\n9. Per traslare la X del segmento;" +
                        "\n10. Per traslare la Y del segmento;" +
                        "\n11. Per visualizzare la lunghezza del segmento;" +
                        "\n12. Per visualizzare i dati del punto 1;" +
                        "\n13. Per visualizzare i dati del punto 2;" +
                        "\n14. Per visualizzare i dati del segmento;" +
                        "\n\nInserire:");
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
                    float newX1;
                    System.out.println("\nInserire la nuova coordinata X del punto 1: ");
                    try{
                        input = new Scanner(System.in);
                        newX1 = input.nextFloat();
                        punto1.setX(newX1);
                    }catch (InputMismatchException e){
                        System.out.println("\nLa coordinata deve essere un numero;");
                    }
                    break;

                case 2:
                    float newY1;
                    System.out.println("\nInserire la nuova coordinata Y del punto 1: ");
                    try{
                        input = new Scanner(System.in);
                        newY1 = input.nextFloat();
                        punto1.setY(newY1);
                    }catch (InputMismatchException e){
                        System.out.println("\nLa coordinata deve essere un numero;");
                    }
                    break;

                case 3:
                    float newX2;
                    System.out.println("\nInserire la nuova coordinata X del punto 2: ");
                    try{
                        input = new Scanner(System.in);
                        newX2 = input.nextFloat();
                        punto1.setX(newX2);
                    }catch (InputMismatchException e){
                        System.out.println("\nLa coordinata deve essere un numero;");
                    }
                    break;

                case 4:
                    float newY2;
                    System.out.println("\nInserire la nuova coordinata Y del punto 2: ");
                    try{
                        input = new Scanner(System.in);
                        newY2 = input.nextFloat();
                        punto1.setY(newY2);
                    }catch (InputMismatchException e){
                        System.out.println("\nLa coordinata deve essere un numero;");
                    }
                    break;

                case 5:
                    float addX1;
                    System.out.println("\nInserire il numero da aggiungere all'attuale X del punto 1: ");
                    try{
                        input = new Scanner(System.in);
                        addX1 = input.nextFloat();
                        punto1.trsX(addX1);
                    }catch (InputMismatchException e){
                        System.out.println("\nLa coordinata deve essere un numero;");
                    }
                    break;

                case 6:
                    float addY1;
                    System.out.println("\nInserire il numero da aggiungere all'attuale Y del punto 1: ");
                    try{
                        input = new Scanner(System.in);
                        addY1 = input.nextFloat();
                        punto1.trsY(addY1);
                    }catch (InputMismatchException e){
                        System.out.println("\nLa coordinata deve essere un numero;");
                    }
                    break;

                case 7:
                    float addX2;
                    System.out.println("\nInserire il numero da aggiungere all'attuale X del punto 2: ");
                    try{
                        input = new Scanner(System.in);
                        addX2 = input.nextFloat();
                        punto2.trsX(addX2);
                    }catch (InputMismatchException e){
                        System.out.println("\nLa coordinata deve essere un numero;");
                    }
                    break;

                case 8:
                    float addY2;
                    System.out.println("\nInserire il numero da aggiungere all'attuale Y del punto 2: ");
                    try{
                        input = new Scanner(System.in);
                        addY2 = input.nextFloat();
                        punto2.trsY(addY2);
                    }catch (InputMismatchException e){
                        System.out.println("\nLa coordinata deve essere un numero;");
                    }
                    break;

                case 9:
                    float trsXSegm;
                    System.out.println("\nInserire il numero da aggiungere all'attuale X per traslare il segmento: ");
                    try{
                        input = new Scanner(System.in);
                        trsXSegm = input.nextFloat();
                        segmento.trsX(trsXSegm);
                    }catch (InputMismatchException e){
                        System.out.println("\nLa coordinata deve essere un numero;");
                    }
                    break;

                case 10:
                    float trsYSegm;
                    System.out.println("\nInserire il numero da aggiungere all'attuale Y per traslare il segmento: ");
                    try{
                        input = new Scanner(System.in);
                        trsYSegm = input.nextFloat();
                        segmento.trsY(trsYSegm);
                    }catch (InputMismatchException e){
                        System.out.println("\nLa coordinata deve essere un numero;");
                    }
                    break;

                case 11:
                    System.out.println("\nLa lunghezza del segmento è: " + segmento.lunghezza());
                    break;

                case 12:
                    System.out.println("\nI dati del punto 1 sono: " + punto1.toString());
                    break;

                case 13:
                    System.out.println("\nI dati del punto 2 sono: " + punto2.toString());
                    break;

                case 14:
                    System.out.println("\nI dati del segmento sono: " + segmento.toString());
                    break;

                default:
                    System.out.println("\nLa scelta fatta non corrisponde a nessuna opzione del menu.");
                    break;
            }
        }while(scelta != 0);
    }
}
