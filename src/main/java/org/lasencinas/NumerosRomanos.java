package org.lasencinas;

public enum NumerosRomanos {

    I (1),
    II (2),
    III (3),
    IV (4),
    V (5),
    IX (9),
    X (10),
    XL (40),
    L (50),
    XC (90),
    C (100),
    CM (900),
    M (1000);

    private int valorDecimal = 0;

    NumerosRomanos() {
    }

    NumerosRomanos(int valorDecimal) {
        this.valorDecimal = valorDecimal;
    }

    public int getValorDecimal() {
        return this.valorDecimal;
    }

}
