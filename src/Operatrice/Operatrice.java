package Operatrice;

public class Operatrice <T> {
    private T val1;
    private T val2;

    Operatrice(){
    }

    Operatrice(T val1, T val2) throws Exception{
        setVal1(val1);
        setVal2(val2);
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) throws Exception{
        if(val1 == null){
            throw new Exception("L'oggetto val1 non può essere null.");
        }else{
            this.val1 = val1;
        }
    }

    public T getVal2(){
        return val2;
    }

    public void setVal2(T val2) throws Exception{
        if(val2 == null){
            throw new Exception("L'oggetto val2 non può essere null.");
        }else{
            this.val2 = val2;
        }
    }

    public T somma(){
        if(val1 instanceof Integer){
            Integer ris = (Integer)val1 + (Integer)val2;
            return (T)ris;
        }

        if(val1 instanceof Float){
            Float ris = (Float)val1 + (Float)val2;
            return (T)ris;
        }

        if(val1 instanceof Double){
            Double ris = (Double)val1 + (Double)val2;
            return (T)ris;
        }

        if(val1 instanceof String){
            String ris = (String)val1 + (String)val2;
            return (T)ris;
        }

        if(val1 instanceof Boolean){
            Boolean ris = (Boolean) val1 || (Boolean)val2;
            return (T)ris;
        }
        return null;
    }

    public T sottrazione(){
        if(val1 instanceof Integer){
            Integer ris = (Integer)val1 - (Integer)val2;
            return (T)ris;
        }

        if(val1 instanceof Float){
            Float ris = (Float)val1 - (Float)val2;
            return (T)ris;
        }

        if(val1 instanceof Double){
            Double ris = (Double)val1 - (Double)val2;
            return (T)ris;
        }

        if(val1 instanceof String){
            String ris = "Non si può fare la sottrazione tra due stringhe.";
            return (T)ris;
        }

        if(val1 instanceof Boolean){
            String ris = "Non si può fare la sottrazione tra due booleani.";
            return (T)ris;
        }
        return null;
    }

    public T moltiplicazione(){
        if(val1 instanceof Integer){
            Integer ris = (Integer)val1 * (Integer)val2;
            return (T)ris;
        }

        if(val1 instanceof Float){
            Float ris = (Float)val1 * (Float)val2;
            return (T)ris;
        }

        if(val1 instanceof Double){
            Double ris = (Double)val1 * (Double)val2;
            return (T)ris;
        }

        if(val1 instanceof String){
            String ris = "Non si può fare la moltiplicazione tra due stringhe.";
            return (T)ris;
        }

        if(val1 instanceof Boolean){
            Boolean ris = (Boolean) val1 && (Boolean)val2;
            return (T)ris;
        }
        return null;
    }

    public T divisione(){
        if(val1 instanceof Integer){
            Integer ris = (Integer)val1 / (Integer)val2;
            return (T)ris;
        }

        if(val1 instanceof Float){
            Float ris = (Float)val1 / (Float)val2;
            return (T)ris;
        }

        if(val1 instanceof Double){
            Double ris = (Double)val1 / (Double)val2;
            return (T)ris;
        }

        if(val1 instanceof String){
            String ris = "Non si può fare la divisione tra due stringhe.";
            return (T)ris;
        }

        if(val1 instanceof Boolean){
            String ris = "Non si può fare la divisione tra due booleani.";
            return (T)ris;
        }
        return null;
    }

    public Class tipoVal1(){
        return val1.getClass();
    }

    public Class tipoVal2(){
        return val2.getClass();
    }

    // Metodo generico che returna un tipo generico
    static public <T> T verificaTipo(T valore){
        return (T)valore.getClass();
    }

    @Override
    public String toString() {
        return "Operatrice{" +
                "val1=" + val1 +
                ", val2=" + val2 +
                '}';
    }
}
