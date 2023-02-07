public class Conta_corrente {

  public double depositar(double valor, double saldo) {
    double total = 0;
    total = valor + saldo;
    return total;
  }

  public double sacar(double valor, double saldo, double T) {
    matematica Taxa = new matematica();
    double ValorParaSacar = Taxa.taxaParaSacar(T, valor);
    double total = saldo - ValorParaSacar;
    return total;
  }

  public void obiterSaldo(double saldo) {
    System.out.println("Seu saldo : " + saldo);
  }

}
