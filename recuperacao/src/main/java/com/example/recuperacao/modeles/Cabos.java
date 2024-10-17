package com.example.recuperacao.modeles;



public class Cabos extends Produto {
    
    @Override
    public double calcularGanhoMes(int qtdTotal, double comissao){
   if (qtdTotal>= 5){
     return comissao + (comissao * 1.5);
   } 
   return this.comissao;

    }
     


}
