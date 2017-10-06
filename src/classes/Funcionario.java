package classes;



public class Funcionario {
    String matricula;
    String nome;
    String cpf;
    String ctps;
    double salario;
    
    public  void bonificacao(double valor){
        salario = salario + valor;
        System.out.println("O salario do mês é: "+ salario);
    }
    
}
