package OpereDarte;

public abstract class OperaDarte {
    protected String titolo, artista;

    public OperaDarte(String titolo, String artista){
        this.titolo = titolo;
        this.artista = artista;
    }

    public void checkOperaDarte(OperaDarte operaDarte) throws Exception{
        if(this.titolo.matches(operaDarte.titolo) && this.artista.matches(operaDarte.artista)){
            throw new Exception("\nOpera già inserita.");
        }
    }

    public abstract double ingombro();

    @Override
    public String toString() {
        return "Titolo opera: " + titolo + ", Artista: " + artista;
    }
}
