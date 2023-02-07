// Crie uma classe para representar uma conta-corrente, com métodos para depositar uma //quantia, sacar uma quantia e obter o saldo. Para cada saque será debitada também uma taxa de //operação equivalente à 0,5% do valor sacado. Para a criação de objetos dessa classe será //possível (opcional) informar o valor do saldo da conta.
class Main {
  public static void main(String[] args) {
    double saldo = 1000;
        int vezes = 5;
        double T = 0.5;
        double valor = 50;
        double ValorParaDepositar = valor;
        double ValorParaSacar = valor;
        Conta_corrente Usuario = new Conta_corrente();
        for (int i = 0; i <= vezes; i++) {
          Usuario.obiterSaldo(saldo);
          saldo = Usuario.depositar(ValorParaDepositar, saldo);
          Usuario.obiterSaldo(saldo);
        }
        System.out.println("Sacando ...");
        for (int i = 0; i <= vezes; i++) {
          double total , saldoTotal;
          Usuario.obiterSaldo(saldo);
          total = Usuario.sacar(ValorParaSacar, saldo, T);
          Usuario.obiterSaldo(total);
          saldo = total;
       }
  }
}

