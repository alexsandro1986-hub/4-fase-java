package com.example.recuperacao.modeles;

public class Capa extends Produto {
    
    @Override
    public double calcularGanhoMes(int qtdTotal, double comissao){
   if (qtdTotal>= 10){
     return comissao + (comissao * 1.3);
   } 
   return this.comissao;

    }
     


}