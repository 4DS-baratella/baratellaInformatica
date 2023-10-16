package Tempo;

public class Ora {
    private int h, m, s;

    public Ora(int h, int m, int s) throws Exception{
        if(h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59){
            this.h = h;
            this.m = m;
            this.s = s;
        }else{
            throw new Exception("\nI valori inseriti non sono validi.");
        }
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    @Override
    public String toString() {
        return "\nL'orario attuale è " + this.h + ":" + this.m + ":" + this.s;
    }

    public int minutiDallaMezzanotte(){
        int min;
        min = (this.h * 60) + this.m + (this.s / 60);
        return min;
    }

    public int secondiDallaMezzanotte(){
        int sec;
        sec = (this.h * 3600) + (this.m * 60) + this.s;
        return sec;
    }
}
