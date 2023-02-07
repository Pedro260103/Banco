// Crie uma classe para representar uma conta-corrente, com métodos para depositar uma //quantia, sacar uma quantia e obter o saldo. Para cada saque será debitada também uma taxa de //operação equivalente à 0,5% do valor sacado. Para a criação de objetos dessa classe será //possível (opcional) informar o valor do saldo da conta.
class Main {
  public static void main(String[] args) {
    double saldo = 1000;
        int vezes = 5;
        double T = 0.5;
        double valor = 50;
        double ValorParaDepositar = valor;
        double ValorParaSacar = valor;
        for (int i = 0; i <= vezes; i++) {
          obiterSaldo(saldo);
          saldo = depositar(ValorParaDepositar, saldo);
          obiterSaldo(saldo);
        }
        System.out.println("Sacando ...");
        for (int i = 0; i <= vezes; i++) {
          double total , saldoTotal;
          obiterSaldo(saldo);
          total = sacar(ValorParaSacar, saldo, T);
          obiterSaldo(total);
          saldo = total;
       }
  }
  // Conta_corrente
  public static double depositar(double valor, double saldo) {
    double total = 0;
    total = valor + saldo;
    return total;
  }

  public static double sacar(double valor, double saldo, double T) {
    double ValorParaSacar = taxaParaSacar(T, valor);
    double total = saldo - ValorParaSacar;
    return total;
  }

  public static void obiterSaldo(double saldo) {
    System.out.println("Seu saldo : " + saldo);
  }
  // Matematica
  public static void minhaIdade(int anoNaci , int anoAtual){
    int total ;
    total = anoAtual - anoNaci;
    System.out.println("Sua idade : " + total);
  }
  public static double taxaParaSacar(double T , double valor){
    double total =  valor -  T;// T/100
    return total;
  }
}

