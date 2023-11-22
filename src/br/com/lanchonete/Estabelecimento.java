package br.com.lanchonete;

import br.com.lanchonete.area.cliente.Cliente;
import br.com.lanchonete.atendimento.cozinha.Almoxarife;
import br.com.lanchonete.atendimento.Atendente;
import br.com.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[]args){
        Cozinheiro cozinheiro = new Cozinheiro();

        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();



        Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();


        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();







    }
}

