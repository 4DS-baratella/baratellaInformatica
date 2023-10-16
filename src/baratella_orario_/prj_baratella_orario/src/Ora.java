package baratella_orario_.prj_baratella_orario.src;

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
        return "\n" + this.h + ":" + this.m + ":" + this.s;
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

    public void incrOre(int oreAggiunte) throws Exception{
        if(oreAggiunte < 0){
            throw new Exception("\nIl numero non può essere negativo.");
        }else if(oreAggiunte == 0){
            throw new Exception("\nPer incrementare le ore il numero da inserire deve essere maggiore di 0.");
        }else{
            this.h += oreAggiunte;
            while(this.h > 24){
                this.h -= 24;
            }
        }
    }

    public void incrMin(int minAggiunti) throws Exception{
        if(minAggiunti < 0) {
            throw new Exception("\nIl numero non può essere negativo.");
        }else if(minAggiunti == 0){
            throw new Exception("\nPer incrementare i minuti il numero da inserire deve essere maggiore di 0.");
        }else{
            this.m += minAggiunti;
            while(this.m > 59){
                this.h += 1;
                this.m -= 60;
            }
            if(this.h > 23){
                this.h -= 24;
            }
        }
    }

    public void incrSec(int secAggiunti) throws Exception{
        if(secAggiunti < 0) {
            throw new Exception("\nIl numero non può essere negativo.");
        }else if(secAggiunti == 0){
            throw new Exception("\nPer incrementare i secondi il numero da inserire deve essere maggiore di 0.");
        }else{
            this.s += secAggiunti;
            while(this.s > 59){
                this.m += 1;
                this.s -= 60;
            }
            if(this.m > 59){
                this.h += 1;
                this.m -= 60;
            }
            if(this.h > 23){
                this.h -= 24;
            }
        }
    }

    public void resetOrario(int oreIniz, int minIniz, int secIniz){
        this.h = oreIniz;
        this.m = minIniz;
        this.s = secIniz;
    }
}
