package org.lasencinas;

import java.util.EnumSet;

public enum NumerosRomanos {

    I (1),
    V (5),
    X ( 10),
    L (50),
    C (100),
    D (500),
    M (1000),
    IV (4),
    IX (9),
    XL (40),
    XC (90),
    CD (400),
    CM (900);

    private int valorDecimal = 0;

    NumerosRomanos(int valorDecimal) {
        this.valorDecimal = valorDecimal;
    }

    public int getValorDecimal() {
        return this.valorDecimal;
    }

    public static EnumSet<NumerosRomanos> getGrupoSumatorio() {
        return EnumSet.range(I, M);
    }

    public static EnumSet<NumerosRomanos> getGrupoSubstractivo() {
        return EnumSet.complementOf(getGrupoSumatorio());
    }
}
