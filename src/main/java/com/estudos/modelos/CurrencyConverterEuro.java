package com.estudos.modelos;

import com.estudos.enums.Currency;

import java.math.BigDecimal;

public class CurrencyConverterEuro extends CurrencyConverter {

    @Override
    public BigDecimal convertToCurrency(Currency currency, BigDecimal valueInReais) {

        currency = Currency.EURO;
        return super.convertToCurrency(currency, valueInReais);
    }

    @Override
    public BigDecimal convertToReal(Currency currency, BigDecimal valueInCurrency) {
        currency = Currency.EURO;
        return super.convertToReal(currency, valueInCurrency);
    }
}
