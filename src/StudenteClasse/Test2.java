package StudenteClasse;

public class Test2 {
    public static void main(String[] args) {
        Studente[] studenti = new Studente[1];

        try{
            Studente stud = new Studente("De Mattè", "Daniele Paolo");
            System.out.println("Studente: " + stud.getNome() + " " + stud.getCognome());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
