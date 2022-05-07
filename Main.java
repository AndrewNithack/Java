public class Main {
  public static void main(String[] args) {
    System.out.println("exercicio calculadora");
    Calculadora.soma(3, 6);
    Calculadora.subtracao(9, 1.8);
    Calculadora.multiplicacao(7, 8);
    Calculadora.divisao(5, 2.5);

    System.out.println("exercicio Mensagem");
    Mensagem.obterMenssagem(9);
    Mensagem.obterMenssagem(14);
    Mensagem.obterMenssagem(1);

    System.out.println("exercicio Emprestimo");
    Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
    Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
    Emprestimo.calcular(1000, 5);

  }
}
