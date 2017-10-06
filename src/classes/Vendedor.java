
package classes;


public class Vendedor extends Funcionario{
    double comissao;
    
    @Override
    public void bonificacao (double valor){
        salario += valor + comissao;
        System.out.println(nome+" o salario deste mês é: " +salario);
    }
}
