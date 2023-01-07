package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;
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
  public static HashMap<String, Integer> calcularQuantidades(ArrayList<Integer> idades) {
    int menores = 0;
    int adultos = 0;
    int idosos = 0;

    for (int index = 0; index < idades.size(); index += 1) {
      if (idades.get(index) < 18) {
        menores += 1;
      }

      if (idades.get(index) >= 18 && idades.get(index) < 50) {
        adultos += 1;
      }

      if (idades.get(index) >= 50) {
        idosos += 1;
      }
    }

    HashMap<String, Integer> totais = new HashMap<String, Integer>();
    totais.put("menores", menores);
    totais.put("adultos", adultos);
    totais.put("idosos", idosos);

    return totais;
  }

  /**
   * Método calcularPercentual.
   * 
   */
  public static HashMap<String, String> calcularPercentual(ArrayList<Integer> idades) {
    int total = idades.size();
    String menores = "0";
    String adultos = "0";
    String idosos = "0";
    HashMap<String, Integer> totais = calcularQuantidades(idades);

    if (idades.size() != 0) {
      menores = new DecimalFormat("##0.0#").format((float) (totais.get("menores") * 100) / total);
      adultos = new DecimalFormat("##0.0#").format((float) (totais.get("adultos") * 100) / total);
      idosos = new DecimalFormat("##0.0#").format((float) (totais.get("idosos") * 100) / total);
    }

    HashMap<String, String> percentuais = new HashMap<String, String>();
    percentuais.put("menores", menores);
    percentuais.put("adultos", adultos);
    percentuais.put("idosos", idosos);

    return percentuais;
  }

}
