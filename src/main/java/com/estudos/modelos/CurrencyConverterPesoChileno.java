package com.estudos.modelos;

import com.estudos.enums.Currency;

import java.math.BigDecimal;

public class CurrencyConverterPesoChileno extends CurrencyConverter {

    @Override
    public BigDecimal convertToCurrency(Currency currency, BigDecimal valueInReais) {

        currency = Currency.PESO_CHILENO;
        return super.convertToCurrency(currency, valueInReais);
    }

    @Override
    public BigDecimal convertToReal(Currency currency, BigDecimal valueInCurrency) {
        currency = Currency.PESO_CHILENO;
        return super.convertToReal(currency, valueInCurrency);
    }
}
