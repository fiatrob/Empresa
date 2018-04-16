package conta;

public class ContaPoupanca extends Conta {
    
    int numeroPoupanca;
    //double saldo;
    double taxa = 0.05;
    
   
    @Override
    public void saque (double valor){
         saldo = saldo - (valor + taxa);
        //System.out.println(nomeTitular+ " seu saldo é de : " +saldo);
    
}
   
}
