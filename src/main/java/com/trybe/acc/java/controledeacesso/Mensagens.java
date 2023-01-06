package com.trybe.acc.java.controledeacesso;

/**
 * Classe Mensagens.
 *
 */
public class Mensagens {
  /**
   * Método opcoes.
   * 
   */
  public static void opcoes() {
    System.out.println("Entre com o número correspondente à opção desejada:");
    System.out.println("1 - Acessar o estabelecimento");
    System.out.println("2 - Finalizar sistema e mostar relatório");
  }

  public static void entradaIdade() {
    System.out.println("Entre com a sua idade:");
  }

  /**
   * Métofdo liberacao.
   * 
   */
  public static void liberacao(short idade) {
    if (idade < 18) {
      System.out.println("Pessoa cliente menor de idade, catraca liberada!");
    }

    if (idade >= 18 && idade < 50) {
      System.out.println("Pessoa adulta, catraca liberada!");
    }

    if (idade >= 50) {
      System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
    }
  }

  /**
   * Método relatorioQuantidade.
   * 
   */
  public static void relatorioQuantidade(int menores, int adultos, int idosos) {
    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + menores);
    System.out.println("adultas: " + adultos);
    System.out.println("a partir de 50: " + idosos);
  }

  /**
   * Método relatorioPercentual.
   * 
   */
  public static void relatorioPercentual(int menores, int adultos, int idosos) {
    System.out.println("----- Percentual -----");
    System.out.println("menores: " + menores);
    System.out.println("adultas: " + adultos);
    System.out.println("a partir de 50: " + idosos);
  }

  public static void totalPessoas(int total) {
    System.out.println("TOTAL: " + total);
  }

}
