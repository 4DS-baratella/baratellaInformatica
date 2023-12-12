package InterfacciaConfrontabile;

public class Test {
    public static void main(String[] args) {
        try{
            Quadrato quadrato1 = new Quadrato(2);
            Quadrato quadrato2 = new Quadrato(2);
            Quadrato quadrato3 = new Quadrato(3);
            Quadrato quadrato4 = new Quadrato(1);

            System.out.println("Area quadrato 1: " + quadrato1.area());
            System.out.println("Area quadrato 2: " + quadrato2.area());
            System.out.println("Area quadrato 3: " + quadrato3.area());
            System.out.println("Area quadrato 4: " + quadrato4.area());

            System.out.println("\nMetodo confronta maggiore (quadrato1 con quadrato3): " + quadrato1.confrontaMaggiore(quadrato3));
            System.out.println("\nMetodo confronta minore (quadrato1 con quadrato4): " + quadrato1.confrontaMinore(quadrato4));
            System.out.println("\nMetodo confronta uguale (quadrato1 con quadrato2): " + quadrato1.confrontaUguale(quadrato2));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
