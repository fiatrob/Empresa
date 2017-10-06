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
public class Principal {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor();
        v1.nome = "Joao";
        v1.cpf = "123456789-11";
        v1.matricula = "43824368";
        v1.salario = 10000;
        v1.comissao = 1000;
        v1.bonificacao(500);
        
        Caixa c1 = new Caixa();
        c1.nome = "Joaquin Barbosa";
        c1.cpf = "888888888";
        c1.matricula = "9397807";
        c1.salario = 1000;
        c1.bonificacao(250000);
        
    }
}
