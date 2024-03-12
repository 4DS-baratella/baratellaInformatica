package ArrayList;

import java.lang.reflect.Array;
import java.util.*;

public class Lista {
    public static void main(String[] args) {
        // Dichiarazione di un ArrayList
        ArrayList<String> lista = new ArrayList<>();


        // Inserimento in coda di un valore
        lista.add("Testo");
        lista.add("Testo1");
        lista.add("Testo2");


        // L'aggiunta di un elemento in posizione specifica ne consegue lo
        // spostamento degli elementi successivi a partire dalla posizione indicata.
        // Se viene specificato un indice superiore al successivo disponibile viene sollevata un'eccezione
        try{
            lista.add(4, "Testo3");
        }catch (Exception e){
            System.out.println("add - Posizione inesistente!");
        }


        // Modifica di un elemento dell'ArrayList. Con il metodo set non è possibile
        // aggiungere elementi, si possono soltanto modificare elementi esistenti.
        try{
            lista.set(0, "Testo modificato");
        }catch (Exception e){
            System.out.println("set - Posizione inesistente!");
        }


        // Lettura di un elemento dell'ArrayList
        try{
            System.out.println((lista.get(0)));
        }catch (Exception e){
            System.out.println("get - Posizione inesistente!");
        }


        // Rimozione di un elemento in una determinata posizione. La rimozione di
        // un elemento in una posizione specifica ne consegue lo spostamento degli
        // elementi successivi a partire dalla posizione indicata
        try{
            lista.remove(0);
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }


        // Rimozione di un elemento per contenuto.
        // Se ci sono più elementi uguali, quale/i vengono rimossi?
        // Se il contenuto della lista è di tipo intero, cosa permette la distinzione
        // dal metodo remove per indice?
        if(lista.remove("Testo2")){
            System.out.println("Rimosso con successo!");
        }else{
            System.out.println("Non rimosso!");
        }


        // Verifica della presenza di un elemento nell'ArrayList
        System.out.println((lista.contains("Ciccio")));


        // Numero di elementi di un ArrayList
        System.out.println(lista.size());


        // Restituzione dell'indice del primo elemento dell'ArrayList, -1 se non è presente
        System.out.println(lista.indexOf("Testo"));


        // Rimozione di tutti gli elementi dell'ArrayList
        lista.clear();


        // Verifica se l'ArrayList è vuoto
        System.out.println(lista.isEmpty());


        // Gli oggetti ArrayList raddoppiano automaticamente la propria capacità
        // quando il programma chiede loro di crescere, pertanto è possibile
        // ridimensionare la gradezza di una lista in base al contenuto.
        lista.trimToSize();



        // Creare un alias di un ArrayList
        ArrayList<String> lista1 = lista;


        // Copiare una ArrayList
        ArrayList<String> lista2 = (ArrayList<String>) lista.clone();


        System.out.println("-------------------------------------------------");


        // Lettura di tutti gli elementi della lista (programmazione normale)
        for(String elemento: lista){
            System.out.println(elemento);
        }

        // Lettura di tutti o parte degli elementi (programmazione normale)
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        // Lettura di tutti gli elementi della lista con forEach (programmazione funzionale)
        // è come un for normale solo scritto in un altro modo
        lista.forEach((elemento) -> {
            System.out.println(elemento);
        });


        //1.
        // Metodo per ordinare un'ArrayList (sort(Comparator<? super E> c))
        //lista.sort();


        //2.
        // Visualizzare l'iteratore dell'elemento in lista in sequenza
        lista.iterator();


        //3.
        // Restituisce l'indice dell'ultimo oggetto specificato nella lista, -1 se non è presente
        lista.lastIndexOf("Testo");


        //4.
        // Rimuove da questo elenco tutti gli elementi che non sono
        // contenuti nella raccolta specificata.
        // retainAll(Collection<?> c)
        //lista.retainAll();


        //5.
        // Restituisce un iteratore di elenco sugli elementi di questo
        // elenco (nella sequenza corretta), a partire dalla posizione
        // specificata nell'elenco.
        // L'indice specificato indica il primo elemento che verrebbe
        // restituito da una chiamata iniziale a next. Una chiamata iniziale
        // a previous restituirebbe l'elemento con l'indice specificato meno uno.
        lista.listIterator();

        // Aggiunge un ArrayList in coda
        System.out.println(lista.addAll(lista1));

        // Aggiunge un ArrayList in una determinata posizione
        System.out.println(lista.addAll(1, lista1));

        // Verifica se il contenuto di un ArrayList è presente in un altro ArrayList
        System.out.println(lista.containsAll(lista1));

        // Verifica se due ArrayList sono uguali
        System.out.println(lista.equals(lista1));

        // Rimuove il contenuto di un ArrayList in un altro
        System.out.println(lista.removeAll(lista1));

        // Rimuove tutti gli elemento che non sono contenuto nell'ArrayList passato come parametro
        System.out.println(lista.retainAll(lista1));

        // Creare una sotto lista di un ArrayList
        List<String> subList = lista.subList(0, 1);

        // Crea un array di Object a partire da un ArrayList
        Object[] toArray = lista.toArray();

        // Ordinare una lista
        lista.sort(Comparator.naturalOrder());
        lista.sort(Comparator.reverseOrder());

        Collections.sort(lista);
        Collections.reverse(lista);

        lista.sort((String s1, String s2) -> s1.compareTo(s2)); // Ordine naturale
        lista.sort((String s1, String s2) -> s2.compareTo(s1)); // Ordine inverso

        // Stampa di un ArrayList
        System.out.println(lista); // lista.toString()

        // Lettura di tutti gli elementi della lista con Iterator
        Iterator i = lista.iterator();
        while(i.hasNext()){
            String s = (String)i.next();
            System.out.println(s);
        }
    }
}