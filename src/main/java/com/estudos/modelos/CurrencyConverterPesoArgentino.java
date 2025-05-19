package com.estudos.modelos;

import com.estudos.enums.Currency;

import java.math.BigDecimal;

public class CurrencyConverterPesoArgentino extends CurrencyConverter {

    @Override
    public BigDecimal convertToCurrency(Currency currency, BigDecimal valueInReais) {

        currency = Currency.PESO_ARGENTINO;
        return super.convertToCurrency(currency, valueInReais);
    }

    @Override
    public BigDecimal convertToReal(Currency currency, BigDecimal valueInCurrency) {
        currency = Currency.PESO_ARGENTINO;
        return super.convertToReal(currency, valueInCurrency);
    }
}
