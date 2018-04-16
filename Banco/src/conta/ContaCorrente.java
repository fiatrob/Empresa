package conta;

public class ContaCorrente extends Conta {
    
    int numeroCorrente;
    //double saldo;
    double taxa = 0.10;
    
   
    @Override
    public void saque (double valor){
       saldo = saldo - (valor + taxa);
        //System.out.println(nomeTitular+ " seu saldo é de : " +saldo);
    
}
    
}
