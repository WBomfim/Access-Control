package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

/**
 * Classe Principal.
 *
 */
public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    ArrayList<Integer> idades = new ArrayList<Integer>();
    short opcao = 1;

    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    while (opcao != 2) {
      Mensagens.opcoes();
      opcao = scan.nextShort();

      if (opcao != 1 && opcao != 2) {
        Mensagens.imprime("Entre com uma opção válida!");
      }

      if (opcao == 1) {
        Mensagens.entradaIdade();
        int idade = scan.nextInt();

        idades.add(idade);
        Mensagens.liberacao(idade);
      }
    }

    HashMap<String, Integer> quantidades = Calculadora.calcularQuantidades(idades);
    HashMap<String, String> percentuais = Calculadora.calcularPercentual(idades);

    Mensagens.relatorioQuantidade(quantidades.get("menores"), quantidades.get("adultos"),
        quantidades.get("idosos"));

    Mensagens.relatorioPercentual(percentuais.get("menores"), percentuais.get("adultos"),
        percentuais.get("idosos"));

    Mensagens.totalPessoas(idades.size());

    scan.close();
  }

}
