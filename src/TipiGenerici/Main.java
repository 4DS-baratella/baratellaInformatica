package TipiGenerici;

public class Main {
    public static void main(String[] args) {
        /*
        Box<Integer> box = new Box<>(10);

        System.out.println(box.get());
        System.out.println(box.toString());
        System.out.println(box.tipo());

        // Verifico di che tipo è la classe del parametro box
        System.out.println(Box.verificaTipo(box));

        // Nel replit condiviso ci sono altri esempi di dichiarazione
        // e stampa di oggetti di tipi diversi
         */

        Integer n = 10;
        try{
            System.out.println(Stampa.stampaElemento(n));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
