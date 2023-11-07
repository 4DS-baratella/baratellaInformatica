package OpereDarte;

public abstract class OperaDarte {
    protected String titolo, artista;

    public OperaDarte(String titolo, String artista){
        this.titolo = titolo;
        this.artista = artista;
    }

    public void checkOperaDarte(OperaDarte operaDarte) throws Exception{

    }

    public abstract double ingombro();

    @Override
    public String toString() {
        return "OperaDarte{" +
                "titolo='" + titolo + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }
}
