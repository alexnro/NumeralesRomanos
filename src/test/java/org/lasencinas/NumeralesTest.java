package org.lasencinas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.assertj.core.api.Assertions.*;
import static org.lasencinas.NumerosRomanos.*;

import org.junit.Before;
import org.junit.Test;


public class NumeralesTest {

    @Test
    public void numeralesSolosTest() {
        assertEquals(1, I.getValorDecimal());
        assertEquals(2, II.getValorDecimal());
        assertEquals(3, III.getValorDecimal());
        assertEquals(4, IV.getValorDecimal());
        assertEquals(5, V.getValorDecimal());
        assertEquals(9, IX.getValorDecimal());
        assertEquals(10, X.getValorDecimal());
        assertEquals(40, XL.getValorDecimal());
        assertEquals(50, L.getValorDecimal());
        assertEquals(90, XC.getValorDecimal());
        assertEquals(100, C.getValorDecimal());
        assertEquals(900, CM.getValorDecimal());
        assertEquals(1000, M.getValorDecimal());
    }
}
