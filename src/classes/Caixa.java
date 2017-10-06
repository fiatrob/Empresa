/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author robso
 */
public class Caixa extends Funcionario{
    
    double auxilioCreche;
    double valeAlimentacao;
    
    @Override
    public void bonificacao (double valor){
        salario += valor + auxilioCreche + valeAlimentacao;
        System.out.println(nome+ " seu salário será: " +salario);
    
}
}
