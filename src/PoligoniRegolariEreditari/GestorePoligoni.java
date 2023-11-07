package PoligoniRegolariEreditari;

import java.util.Arrays;

public class GestorePoligoni {
    PoligonoRegolare[] poligoniReg = null;
    int dimLog, dimFisica;

    public GestorePoligoni(int dimFisica){
        this.poligoniReg = new PoligonoRegolare[dimFisica];
        this.dimLog = 0;
        this.dimFisica = 0;
    }

    public void addPoligono(PoligonoRegolare polReg) throws Exception{
        if (dimLog >= dimFisica) {
            raddoppiaSpazio();
        }
        this.poligoniReg[dimLog] = polReg;
        dimLog++;
    }

    private void raddoppiaSpazio() {
        PoligonoRegolare[] arrayNuovo = new PoligonoRegolare[poligoniReg.length * 2];
        for (int i = 0; i < poligoniReg.length; i++) {
            arrayNuovo[i] = poligoniReg[i];
        }
        poligoniReg = arrayNuovo;
    }

    @Override
    public String toString() {
        return "GestionePoligoni{" +
                "poligoniReg=" + Arrays.toString(poligoniReg) +
                '}';
    }
}
