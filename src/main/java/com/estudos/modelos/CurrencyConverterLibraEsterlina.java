package com.estudos.modelos;

import com.estudos.enums.Currency;

import java.math.BigDecimal;

public class CurrencyConverterLibraEsterlina extends CurrencyConverter {

    @Override
    public BigDecimal convertToCurrency(Currency currency, BigDecimal valueInReais) {

        currency = Currency.LIBRA_ESTERLINA;
        return super.convertToCurrency(currency, valueInReais);
    }

    @Override
    public BigDecimal convertToReal(Currency currency, BigDecimal valueInCurrency) {
        currency = Currency.LIBRA_ESTERLINA;
        return super.convertToReal(currency, valueInCurrency);
    }
}
