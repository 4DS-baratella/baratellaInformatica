package MezzoDiTrasporto;

public class MezzoDiTrasporto {
    private float COEFF_CONV_DA_CV_A_KW;
    private int cavalli;
    private String marca;
    protected int numIstanze;

    MezzoDiTrasporto(){
        numIstanze++;
    }

    MezzoDiTrasporto(int cavalli, String marca) throws Exception{
        this();
        COEFF_CONV_DA_CV_A_KW = 0.73f;
        setCavalli(cavalli);
        setMarca(marca);
    }

    public int getCavalli() {
        return cavalli;
    }

    public void setCavalli(int cavalli) throws Exception{
        if(cavalli >= 100 && cavalli <= 1000){
            this.cavalli = cavalli;
        }else{
            throw new Exception("\nIl valore dei cavalli deve essere tra 100 e 1000.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) throws Exception{
        String[] parole = marca.split(" ");
        for(int i = 0; i < parole.length; i++){
            if(parole[i].length() < 3){
                throw new Exception("\nLa marca non può essere più corta di 3 lettere.");
            }
        }
        marca.toUpperCase();
    }

    public int getNumIstanze() {
        return numIstanze;
    }

    public void setNumIstanze(int numIstanze) {
        this.numIstanze = numIstanze;
    }
}
