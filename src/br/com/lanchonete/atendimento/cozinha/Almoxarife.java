package br.com.lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.print("CONTROLANDO A ENTRADA DOS ITENS");
    }
     private void controlarSaida(){
        System.out.println("CONTROLANDO SAIDA DOS ITENS");
    }
     void entregarIngredientes(){

        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();
    }
     void trocarGas(){
        System.out.println("ALMOXARIFE TROCANDO GÁS");
    }
}
