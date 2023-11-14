package OpereDarte;

public abstract class OperaDarte {
    protected String titolo, artista;

    public OperaDarte(String titolo, String artista){
        this.titolo = titolo;
        this.artista = artista;
    }

    public boolean equals(OperaDarte operaDarte){
        boolean flag = false;
        if(this.titolo.equals(operaDarte.titolo) && this.artista.equals(operaDarte.artista)){
            flag = true;
        }
        return flag;
    }

    public abstract double ingombro();

    @Override
    public String toString() {
        return "Titolo opera: " + titolo + ", Artista: " + artista;
    }
}
