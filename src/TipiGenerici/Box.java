package TipiGenerici;



// Classe generica
public class Box<T> {
    // T serve a specificare il tipo generico
    private T t;

    // Costruttore senza parametri
    public Box(){

    }

    // Costruttore parametrizzato
    public Box(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }

    public void set(T t) throws Exception{
        if(t != null){
            this.t = t;
        }else{
            throw new Exception("L'attributo non può essere null.");
        }

    }

    // Restituisco il tipo dell'oggetto
    public Class tipo(){
        return t.getClass();
    }

    // Metodo generico che returna un tipo generico
    static public <T> T verificaTipo(T valore){
        return (T)valore.getClass();
    }

    @Override
    public String toString(){
        return t.toString();
    }
}
