package conta;

import java.math.BigDecimal;

public class Conta {
    
    String nomeTitular;
    int numeroConta;
        String cpf;
        double saldo;
    

     public void saque (double valor){
        
         saldo = saldo - valor;
        BigDecimal bg = new BigDecimal(saldo);
         System.out.println(nomeTitular+" seu saldo é de : "+bg.setScale(3, BigDecimal.ROUND_HALF_DOWN));
        //System.out.printf("%s%s%.3f",nomeTitular," seu saldo é de : ",saldo);
         System.out.println("");
    
}
    public void deposito(double valor){
        
        saldo = saldo + valor;
         BigDecimal bg = new BigDecimal(saldo);
         System.out.println(nomeTitular+" seu saldo é de : "+bg.setScale(3, BigDecimal.ROUND_HALF_DOWN));
        //System.out.printf("%s%s%.3f",nomeTitular," seu saldo é de : ",saldo);
        //System.out.println("");
    }
       public void consulta(){
        BigDecimal bg = new BigDecimal(saldo);
         System.out.println(nomeTitular+" seu saldo é de : "+bg.setScale(3, BigDecimal.ROUND_HALF_DOWN));      
        //System.out.printf("%s%s%.3f",nomeTitular," seu saldo é de : ",saldo);
        System.out.println("");
    }
    
}
