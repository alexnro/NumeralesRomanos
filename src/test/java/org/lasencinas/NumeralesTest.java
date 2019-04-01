package org.lasencinas;

import static org.junit.Assert.*;
import static org.lasencinas.NumerosRomanos.*;

import org.junit.Test;


public class NumeralesTest {

    @Test
    public void numeralesSolosTest() {
        assertEquals(1, I.getValorDecimal());
        assertEquals(4, IV.getValorDecimal());
        assertEquals(5, V.getValorDecimal());
        assertEquals(9, IX.getValorDecimal());
        assertEquals(10, X.getValorDecimal());
        assertEquals(40, XL.getValorDecimal());
        assertEquals(50, L.getValorDecimal());
        assertEquals(90, XC.getValorDecimal());
        assertEquals(100, C.getValorDecimal());
        assertEquals(400, CD.getValorDecimal());
        assertEquals(500, D.getValorDecimal());
        assertEquals(900, CM.getValorDecimal());
        assertEquals(1000, M.getValorDecimal());
    }

    @Test
    public void comprobarNumeroRomano() {
        ConversorADecimal conversor = new ConversorADecimal("XIII");
        assertTrue(conversor.comprobarNumeroRomano());
        conversor.setNumeroRomano("VVV");
        assertFalse(conversor.comprobarNumeroRomano());
        conversor.setNumeroRomano("IIII");
        assertFalse(conversor.comprobarNumeroRomano());
        conversor.setNumeroRomano("CCM");
        assertFalse(conversor.comprobarNumeroRomano());
        conversor.setNumeroRomano("CMXIV");
        assertTrue(conversor.comprobarNumeroRomano());
    }

}
