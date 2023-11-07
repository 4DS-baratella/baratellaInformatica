package OpereDarte;

import java.util.Arrays;

public class Collezione {
    private String nome, luogo;
    private OperaDarte[] opereDarte;
    private int dimLog;

    public Collezione(String nome, String luogo, int dim){
        this.nome = nome;
        this.luogo = luogo;
        opereDarte = new OperaDarte[dim];
        dimLog = 0;
    }

    public void inserireOpera(OperaDarte opera) throws Exception{
        if(dimLog < opereDarte.length){
            opereDarte[dimLog] = opera;
            dimLog++;
        }else{
            throw new Exception("\nE' stato raggiunto il numero massimo di opere d'arte inseribile.");
        }
    }

    public double stampaIngombroOpera(OperaDarte opera){
        return opera.ingombro();
    }

    public double ingombroTotale(){
        double ingrombroTot = 0;
        for(int i = 0; i < dimLog; i++){
            ingrombroTot += opereDarte[i].ingombro();
        }
        ingrombroTot /= 1000000;
        return ingrombroTot;
    }

    @Override
    public String toString() {
        return "Collezione[Nome collezione: " + nome + ", luogo dove si trova: " + luogo + ", opere d'arte della collezione: " + toStringOpere() + "\n]";
    }

    private String toStringOpere(){
        String str = "";
        for(int i = 0; i < dimLog; i++){
            str += "\nOpera " + (i+1) + ": " + opereDarte[i].toString();
        }
        return str;
    }
}
