package calc_fin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author papiro
 */
public class negocioDesc {
    double nominal,taxa,tempo,vAtual,desconto;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getNominal() {
        return nominal;
    }

    public void setNominal(double nominal) {
        this.nominal = nominal;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getvAtual() {
        return vAtual;
    }

    public void setvAtual(double vAtual) {
        this.vAtual = vAtual;
    }
    
    public double calcDesc(double nominal, double vAtual){
        return desconto = nominal - vAtual;        
    }
    public double calcSimplesRac(double nominal, double taxa, double tempo){
        return vAtual = nominal/(1+(taxa*tempo));               
    }
    
    public double calcCompRac(double nominal, double taxa, double tempo){
        return vAtual = nominal/Math.pow((1+taxa),tempo);  
    }
    
    public double calcSimplesBan(double nominal, double taxa, double tempo){
        return vAtual = nominal*(1-(taxa*tempo));        
    }
    
    public double calcCompBan(double nominal, double taxa, double tempo){
        return vAtual = nominal*(Math.pow(1-taxa,tempo));    
    }
    
   
}
