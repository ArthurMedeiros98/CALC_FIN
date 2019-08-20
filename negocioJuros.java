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
public class negocioJuros {
    public double juros, montante;
    
    public double calcJurosSimples(double c, double i, double t){
        System.out.println(c+"e"+i+"e"+t);
        return juros = (c*i)*t;
    }
    public double calcJurosComposto(double c, double i, double t){
        System.out.println(c+"e"+i+"e"+t);
        return juros = c*((Math.pow(1+i,t))-1);
    }
    public double calcMontante(double c, double j){
        return montante = c+j;
    }
}
