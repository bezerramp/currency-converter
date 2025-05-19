package com.estudos.modelos;

import com.estudos.enums.Currency;
import com.estudos.interfaces.ConvertibleCurrency;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConverter implements ConvertibleCurrency {

    @Override
    public BigDecimal convertToCurrency(Currency currency, BigDecimal valueInReais) {
        return valueInReais.divide(currency.getCONVERSION_FACTOR(), 2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal convertToReal(Currency currency, BigDecimal valueInCurrency) {
        return valueInCurrency.multiply(currency.getCONVERSION_FACTOR()).setScale(2, RoundingMode.HALF_UP);
    }
}
