package br.com.lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONADO LANCHE NO BALCÃO");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("SUCO ADICIONADO NO BALCÃO");
    }
    public void adicionarComboNoBalcao(){
        System.out.println("COMBO ADICIONADO NO BALCÃO");
    }
    private void prepararLanche(){
        System.out.print("PREPARANDO LANCHE");
    }
    private void prepararVitamina(){
        System.out.println("VITAMINA PREPARADA");
    }
    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    private void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("BATENDO OS INGREDIENTES NO LIQUIDIFICADOR");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("SELECIONANDO INGREDIENTES PARA A VITAMINA");
    }
    private void pedirParaTrocarGas (Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void  pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }

}
