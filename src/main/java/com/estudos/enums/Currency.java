package com.estudos.enums;

import java.math.BigDecimal;

public enum Currency {

    // cotações em 16/05/2025
    DOLLAR(BigDecimal.valueOf(5.66)),
    EURO(BigDecimal.valueOf(6.32)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(7.52)),
    PESO_ARGENTINO(BigDecimal.valueOf(0.0049)),
    PESO_CHILENO(BigDecimal.valueOf(0.0059));

    private final BigDecimal CONVERSION_FACTOR;

    Currency(BigDecimal CONVERSION_FACTOR) {
        this.CONVERSION_FACTOR = CONVERSION_FACTOR;
    }

    public BigDecimal getCONVERSION_FACTOR() {
        return CONVERSION_FACTOR;
    }
}
