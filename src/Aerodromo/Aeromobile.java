package Aerodromo;

public abstract class Aeromobile implements CMP{
    private String sigla;

    public Aeromobile(String sigla){
        this.sigla = sigla;
    }

    public String getSigla(){
        return sigla;
    }

    @Override
    public abstract boolean confrontaMaggiore(CMP x) throws Exception;

    @Override
    public String toString() {
        return "sigla: " + getSigla();
    }
}
