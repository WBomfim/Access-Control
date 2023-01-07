package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.HashMap;

/**
 * Classe Calculadora.
 *
 */
public class Calculadora {
  /**
   * Método calcularQuantidade.
   * 
   */
  public static HashMap<String, Integer> calcularQuantidade(short[] idades) {
    int menores = 0;
    int adultos = 0;
    int idosos = 0;

    for (int index = 0; index < idades.length; index += 1) {
      if (idades[index] < 18) {
        menores += 1;
      }

      if (idades[index] >= 18 && idades[index] < 50) {
        adultos += 1;
      }

      if (idades[index] >= 50) {
        idosos += 1;
      }
    }

    HashMap<String, Integer> totais = new HashMap<>();
    totais.put("menores", menores);
    totais.put("adultos", adultos);
    totais.put("idosos", idosos);

    return totais;
  }

  /**
   * Método calcularPercentual.
   * 
   */
  public static HashMap<String, String> calcularPercentual(short[] idades) {
    int total = idades.length;
    HashMap<String, Integer> totais = calcularQuantidade(idades);
    
    String menores = new DecimalFormat("##0.0#").format((totais.get("menores") * 100) / total);
    String adultos = new DecimalFormat("##0.0#").format((totais.get("adultos") * 100) / total);
    String idosos = new DecimalFormat("##0.0#").format((totais.get("idosos") * 100) / total);
    
    HashMap<String, String> percentuais = new HashMap<>();
    percentuais.put("menores", menores);
    percentuais.put("adultos", adultos);
    percentuais.put("idosos", idosos);
    
    return percentuais;
  }
}
