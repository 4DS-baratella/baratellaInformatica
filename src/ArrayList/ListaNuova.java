package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListaNuova {
    public static void main(String[] args) {
        Persona persona1 = null, persona2 = null, persona3 = null;
        try{
            persona1 = new Persona("Baratella", "Alex", "BRTLXA06E28L378S");
            persona2 = new Persona("Anesi", "Christian", "NSACRS06L29L378P");
            persona3 = new Persona("Franchini", "Daniel", "FRNDNL06A01L378G");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        ArrayList<Persona> persone = new ArrayList<>();

        persone.add(persona3);
        persone.add(persona1);
        persone.add(persona2);

        System.out.println("Lista prima del sort: ");
        for(Persona elemento: persone){
            System.out.println(elemento);
        }

        Collections.sort(persone);

        System.out.println("\nLista dopo il sort: ");
        for(Persona elemento: persone){
            System.out.println(elemento);
        }
    }
}
