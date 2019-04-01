package org.lasencinas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConversorADecimal {

    private String numeroRomano = null;
    private int valorTotal = 0;

    public ConversorADecimal() {
    }

    public ConversorADecimal(String numeroRomano) {
        this.numeroRomano = numeroRomano;
    }

    public void setNumeroRomano(String numeroRomano) {
        this.numeroRomano = numeroRomano;
    }

    public String getNumeroRomano() {
        return this.numeroRomano;
    }

    public int getValorTotal() {
        return this.valorTotal;
    }

    public Boolean comprobarNumeroRomano() {
        String patronCorrecto = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
        Pattern pattern = Pattern.compile(patronCorrecto);
        Matcher matcher = pattern.matcher(numeroRomano);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public int calcularGrupoSumatorio(String numeroRomano) {
        for (NumerosRomanos numerosRomanos : NumerosRomanos.getGrupoSumatorio()) {
            if (numeroRomano.contains(numerosRomanos.name())) {
                valorTotal += numerosRomanos.getValorDecimal();
            } else {

            }
        }
        return valorTotal;
    }
}
