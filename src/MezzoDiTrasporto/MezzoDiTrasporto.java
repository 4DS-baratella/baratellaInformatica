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
        this.marca = marca.toUpperCase();
    }

    public int getNumIstanze() {
        return numIstanze;
    }

    public int calcolaKw(){
        return (int)(this.cavalli * COEFF_CONV_DA_CV_A_KW); //cast a int perché il coefficiente è float
    }

    public String info() throws Exception{
        if(cavalli <= 0 && marca != null){
            return "[Marca auto: " + this.marca + " | Cavalli: " + this.cavalli + "]";
        }else{
            throw new Exception("\nMancano informazioni");
        }
    }
}
