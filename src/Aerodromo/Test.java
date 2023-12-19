package Aerodromo;

public class Test {
    public static void main(String[] args) {
        try{
            Aliante aliante1 = new Aliante("AAA", 10);
            Aliante aliante2 = new Aliante("BBB", 5);

            Aeromotore aeromotore1 = new Aeromotore("AAA", 10.5);
            Aeromotore aeromotore2 = new Aeromotore("BBB", 5.5);

            System.out.println("Informazioni Aeromobili: ");
            System.out.println("\nAliante 1: " + aliante1.toString() + "\nAliante 2: " + aliante2.toString());
            System.out.println("\nAeromotore 1: " + aeromotore1.toString() + "\nAeromotore 2: " + aeromotore2.toString());

            System.out.println("\nConfronto efficienza aerodinamica aliante 1 con aliante 2: ");
            if(aliante1.confrontaMaggiore(aliante2)){
                System.out.println("L'efficienza aerodinamica dell'aliante 1 è MAGGIORE dell'aliante 2.");
            }else{
                System.out.println("L'efficienza aerodinamica dell'aliante 1 è MINORE dell'aliante 2.");
            }

            System.out.println("\nConfronto potenza aeromotore 1 con aeromotore 2: ");
            if(aliante2.confrontaMaggiore(aliante1)){
                System.out.println("La potenza dell'aeromotore 1 è MAGGIORE dell'aeromotore 2.");
            }else{
                System.out.println("La potenza dell'aeromotore 1 è MINORE dell'aeromotore 2.");
            }

            System.out.println("\nControllo metodo equals (classe Aliante) con oggetti diversi:");
            if(aliante1.equals(aliante2)){
                System.out.println("Gli oggetti sono uguali.");
            }else{
                System.out.println("Gli oggetti sono diversi.");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
