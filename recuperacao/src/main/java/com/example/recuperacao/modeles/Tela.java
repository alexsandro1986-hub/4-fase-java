package com.example.recuperacao.modeles;

public class Tela extends Produto {
    
    @Override
    public double calcularGanhoMes(int qtdTotal, double comissao){
   if (qtdTotal>= 2){
     return comissao + (comissao * 5.6);
   } 
   return this.comissao;

    }
     


}
