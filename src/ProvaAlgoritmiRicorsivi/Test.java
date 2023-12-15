package ProvaAlgoritmiRicorsivi;

public class Test {
    public static int modulo(int dividendo, int divisore){
        int resto = 0;
        if(dividendo < divisore){ //caso base
            resto = dividendo;
        }

        if(dividendo == divisore){ //caso base
            resto = 0;
        }

        if(dividendo > divisore){
            resto = modulo(dividendo - divisore, divisore);
        }

        return resto;
    }

    static int contaCarattere(String s, char c, int indice, int counterCarattere){
        if(indice <= s.length()){
            if(s.charAt(indice) == c){
                counterCarattere++;
            }
            counterCarattere = contaCarattere(s, c, indice+1, counterCarattere);
        }
        return counterCarattere;
    }


    public static void main(String[] args) {
        String s = "pippo";
        char c = 'i';
        System.out.println("Il carattere '" + c + "' all'interno della stringa \"" + s + "\" si ripete: " + contaCarattere(s, c, 0, 0) + " volte.");
    }
}
