
package conta;


public class Tela {
    public static void main(String[] args) {
        ContaPoupanca c1 = new ContaPoupanca();
        c1.nomeTitular = "Joao";
        c1.cpf = "123456789-11";
        c1.numeroPoupanca = 43824368;
        c1.saldo = 50000;
        c1.consulta();
        c1.saque(50000);
        c1.consulta();
        c1.deposito(50000);
        c1.consulta();
        
        
        
        ContaCorrente c2 = new ContaCorrente();
        c2.nomeTitular = "Maria";
        c2.cpf = "123456";
        c2.numeroCorrente = 123456789;
        c2.saldo = 50000.00;
        c2.consulta();
        c2.saque(50000.00);
        c2.consulta();
        c2.deposito(50000.00);
        c2.consulta();
        
        
        
    }
}
