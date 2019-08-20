package calc_fin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author papiro
 */
public class taxaTempo {
    public double converterTaxa(String t, String t1, double i){
        i = 1+ i;
        if(t.equals("Dia") && t1.equals("Mês")){
            System.out.println("CONVERTENDO DE DIA/MÊS...");
            
            double big0 = Math.pow(i,30);
            big0= (big0-1)*100;
            i = big0;
            
          //  System.out.printf("%.3f",big0);
           // System.out.print("% a.m.\n");
        }
        else if (t.equals("Dia") && t1.equals("Ano")){
            System.out.println("CONVERTENDO DE DIA/ANO...");
            double aux0 = Math.pow(i,360);
            aux0= (aux0-1)*100;

          //  System.out.printf("%.3f",aux0);
          //  System.out.print("% a.a.\n");
        }
        else if (t.equals("Mês") && t1.equals("Dia")){
            System.out.println("CONVERTENDO DE MÊS/DIA...");
            BigDecimal aux1 = new BigDecimal("1");
            BigDecimal aux2 = new BigDecimal("30");


            BigDecimal aux3 = aux1.divide(aux2, 4, RoundingMode.UP);                
            double num0 = aux3.doubleValue();


            double aux4 = Math.pow(i,num0);
            aux4= (aux4-1)*100;
            i = aux4;
            
         //   System.out.printf("%.3f",aux4);
         //   System.out.print("% a.d.\n");
        }
        else if (t.equals("Mês") && t1.equals("Ano")){
            System.out.println("CONVERTENDO DE MÊS/ANO...");
            System.out.println(i);
            double big1 = Math.pow(i,12);
            big1 = (big1-1)*100;
            i = big1;
         //   System.out.printf("%.3f",big1);
        //    System.out.print("% a.a.\n");
        }
        else if (t.equals("Ano") && t1.equals("Dia")){
            System.out.println("CONVERTENDO DE ANO/DIA...");
            BigDecimal aux5 = new BigDecimal("1");
            BigDecimal aux6 = new BigDecimal("360");




            BigDecimal aux7 = aux5.divide(aux6, 4, RoundingMode.UP);                
            double num1 = aux7.doubleValue();


            double aux8 = Math.pow(i,num1);
            aux8= (aux8-1)*100;
            i = aux8;
            
         //   System.out.printf("%.3f",aux8);
          //  System.out.print("% a.d.\n");
        }
        else if (t.equals("Ano") && t1.equals("Mês")){
            System.out.println("CONVERTENDO DE ANO/MÊS...");
            BigDecimal big2 = new BigDecimal("1");
            BigDecimal big3 = new BigDecimal("12");




            BigDecimal big4 = big2.divide(big3, 4, RoundingMode.UP);                
            double num2 = big4.doubleValue();

            double big5 = Math.pow(i,num2);
            big5 = (big5-1)*100;
            i = big5;
            
         //   System.out.printf("%.3f",big5);
        //    System.out.print("% a.m.\n");
        }
        System.out.println("TAXA "+i);
        return i/100;
    }
    public double calcularTempoCompostoBan(double n, double i, double d, double t,String taxa, String tempo){
            System.out.println("N = "+n+" I = "+i+" D = "+d+"T = "+t);
            t = Math.log10(1-(d/n))/Math.log10(1-i);
            if(t > 0){
                t = Math.round(t);
                System.out.println(t);
            }
            System.out.println("t antes: "+t);
            if(tempo.equals("Dia") && taxa.equals("Mês")){
                t = t * 30;                
            }
            else if(tempo.equals("Dia") && taxa.equals("Ano")){
                t = t * 360;                
            }
            else if(tempo.equals("Mês") && taxa.equals("Dia")){
                t = t / 30;
            }
            else if(tempo.equals("Mês") && taxa.equals("Ano")){
                t = t * 12;
            }
            else if(tempo.equals("Ano") && taxa.equals("Dia")){
                t = t / 360 ;
            }
            else if(tempo.equals("Ano") && taxa.equals("Mês")){
                t = t / 12 ;
                
            }
            System.out.println("t depois: "+t);
            DecimalFormat decimal = new DecimalFormat("0.00");
            String temp = decimal.format(t);
            System.out.println("t formatado: "+temp);                       
            return t;
    }
    public double calcularTempoCompostoRac(double n, double i, double d, double t, String taxa, String tempo){
         System.out.println("N = "+n+" I = "+i+" D = "+d+"T = "+t);
            t = (Math.log10(n/d))/Math.log10(1+i);
            if(t > 0){
                t = Math.round(t);
                System.out.println(t);
            }
            System.out.println("t antes: "+t);
            if(tempo.equals("Dia") && taxa.equals("Mês")){
                t = t * 30;                
            }
            else if(tempo.equals("Dia") && taxa.equals("Ano")){
                t = t * 360;                
            }
            else if(tempo.equals("Mês") && taxa.equals("Dia")){
                t = t / 30;
            }
            else if(tempo.equals("Mês") && taxa.equals("Ano")){
                t = t * 12;
            }
            else if(tempo.equals("Ano") && taxa.equals("Dia")){
                t = t / 360 ;
            }
            else if(tempo.equals("Ano") && taxa.equals("Mês")){
                t = t / 12 ;
                
            }
            System.out.println("t depois: "+t);
            DecimalFormat decimal = new DecimalFormat("0.00");
            String temp = decimal.format(t);
            System.out.println("t formatado: "+temp);                       
            return t;
    }
    public double calcularTempoSimplesRac(double n, double i, double d, double t,String taxa, String tempo){
            System.out.println("N = "+n+" I = "+i+" D = "+d+"T = "+t);
            t = ((n/d)-1)/i;
            if(t > 0){
                t = Math.round(t);
                System.out.println(t);
            }
            System.out.println("t antes: "+t);
            if(tempo.equals("Dia") && taxa.equals("Mês")){
                t = t * 30;                
            }
            else if(tempo.equals("Dia") && taxa.equals("Ano")){
                t = t * 360;                
            }
            else if(tempo.equals("Mês") && taxa.equals("Dia")){
                t = t / 30;
            }
            else if(tempo.equals("Mês") && taxa.equals("Ano")){
                t = t * 12;
            }
            else if(tempo.equals("Ano") && taxa.equals("Dia")){
                t = t / 360 ;
            }
            else if(tempo.equals("Ano") && taxa.equals("Mês")){
                t = t / 12 ;
                
            }
            DecimalFormat decimal = new DecimalFormat("0.00");
            String temp = decimal.format(t);
            System.out.println("t formatado: "+temp);                       
            return t;
    }
    public double calcularTempoSimplesBan(double n, double i, double d, double t,String taxa, String tempo){
            System.out.println("N = "+n+" I = "+i+" D = "+d+"T = "+t);
            t = d/(n*i);
            if(t > 0){
                t = Math.round(t);
                System.out.println(t);
            }
            System.out.println("t antes: "+t);
            if(tempo.equals("Dia") && taxa.equals("Mês")){
                t = t * 30;                
            }
            else if(tempo.equals("Dia") && taxa.equals("Ano")){
                t = t * 360;                
            }
            else if(tempo.equals("Mês") && taxa.equals("Dia")){
                t = t / 30;
            }
            else if(tempo.equals("Mês") && taxa.equals("Ano")){
                t = t * 12;
            }
            else if(tempo.equals("Ano") && taxa.equals("Dia")){
                t = t / 360 ;
            }
            else if(tempo.equals("Ano") && taxa.equals("Mês")){
                t = t / 12 ;
                
            }
            DecimalFormat decimal = new DecimalFormat("0.00");
            String temp = decimal.format(t);
            System.out.println("t formatado: "+temp);                       
            return t;
    }
    public double calcularTempoJSimples(double c, double i, double m, double t, String taxa, String tempo){              
        System.out.println(c+"e"+i+"e"+t+"e"+m);
        t = (m-c)/(c*i);
        if(t > 0){
                t = Math.round(t);
                System.out.println(t);
            }
            System.out.println("t antes: "+t);
            if(tempo.equals("Dia") && taxa.equals("Mês")){
                t = t * 30;                
            }
            else if(tempo.equals("Dia") && taxa.equals("Ano")){
                t = t * 360;                
            }
            else if(tempo.equals("Mês") && taxa.equals("Dia")){
                t = t / 30;
            }
            else if(tempo.equals("Mês") && taxa.equals("Ano")){
                t = t * 12;
            }
            else if(tempo.equals("Ano") && taxa.equals("Dia")){
                t = t / 360 ;
            }
            else if(tempo.equals("Ano") && taxa.equals("Mês")){
                t = t / 12 ;
                
            }
            DecimalFormat decimal = new DecimalFormat("0.00");
            String temp = decimal.format(t);
            System.out.println("t formatado: "+temp);  
        return t;
    }
    public double calcularTempoJComposto(double c, double i, double m, double t, String taxa, String tempo){
        System.out.println(c+"e"+i+"e"+t+"e"+m);
        t = Math.log10(m/c)/Math.log10(1+i);
        /*if(t > 0){
                t = Math.round(t);
                System.out.println(t);
            }*/
            System.out.println("t antes: "+t);
            if(tempo.equals("Dia") && taxa.equals("Mês")){
                t = t * 30;                
            }
            else if(tempo.equals("Dia") && taxa.equals("Ano")){
                t = t * 360;                
            }
            else if(tempo.equals("Mês") && taxa.equals("Dia")){
                t = t / 30;
            }
            else if(tempo.equals("Mês") && taxa.equals("Ano")){
                t = t * 12;
            }
            else if(tempo.equals("Ano") && taxa.equals("Dia")){
                t = t / 360 ;
            }
            else if(tempo.equals("Ano") && taxa.equals("Mês")){
                t = t / 12 ;
                
            }
            DecimalFormat decimal = new DecimalFormat("0.00");
            String temp = decimal.format(t);
            System.out.println("t formatado: "+temp);  
        return t;
    }
}
