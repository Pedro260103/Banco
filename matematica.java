public class matematica{

  public void minhaIdade(int anoNaci , int anoAtual){
    int total ;
    total = anoAtual - anoNaci;
    System.out.println("Sua idade : " + total);
  }
  public double taxaParaSacar(double T , double valor){
    double total =  valor -  T;// T/100
    return total;
  }
}
