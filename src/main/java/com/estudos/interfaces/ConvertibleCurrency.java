package com.estudos.interfaces;

import com.estudos.enums.Currency;

import java.math.BigDecimal;

public interface ConvertibleCurrency {

    BigDecimal convertToCurrency(Currency currency, BigDecimal valorEmReais);

    BigDecimal convertToReal(Currency currency, BigDecimal valorNaMoeda);
}
