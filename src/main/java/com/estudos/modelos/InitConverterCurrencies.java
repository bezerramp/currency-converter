package com.estudos.modelos;

import com.estudos.enums.Currency;
import com.estudos.interfaces.InitConverter;

import java.math.BigDecimal;

public class InitConverterCurrencies implements InitConverter {

    private static final String REAL_PARA_DOLAR = "Real para Dólar";
    private static final String REAL_PARA_EURO = "Real para Euro";
    private static final String REAL_PARA_LIBRA_ESTERLINA = "Real para Libra Esterlina";
    private static final String REAL_PARA_PESO_ARGENTINO = "Real para Peso Argentino";
    private static final String REAL_PARA_PESO_CHILENO = "Real para Peso Chileno";
    private static final String DOLAR_PARA_REAL = "Dólar para Real";
    private static final String EURO_PARA_REAL = "Euro para Real";
    private static final String LIBRA_ESTERLINA_PARA_REAL = "Libra Esterlina para Real";
    private static final String PESO_ARGENTINO_PARA_REAL = "Peso Argentino para Real";
    private static final String PESO_CHILENO_PARA_REAL = "Peso Chileno para Real";

    private final CurrencyConverter currencyConverterDollar = new CurrencyConverterDolar();
    private final CurrencyConverter currencyConverterEuro = new CurrencyConverterEuro();
    private final CurrencyConverter currencyConverterLibraEsterlina = new CurrencyConverterLibraEsterlina();
    private final CurrencyConverter currencyConverterPesoArgentino = new CurrencyConverterPesoArgentino();
    private final CurrencyConverter currencyConverterPesoChileno = new CurrencyConverterPesoChileno();

    private Currency currency;

    @Override
    public BigDecimal operateConversion(String operation, double initialValue) throws Exception {

        switch (operation) {
            case REAL_PARA_DOLAR -> {
                return currencyConverterDollar.convertToCurrency(currency, BigDecimal.valueOf(initialValue));
            }
            case REAL_PARA_EURO -> {
                return currencyConverterEuro.convertToCurrency(currency, BigDecimal.valueOf(initialValue));
            }
            case REAL_PARA_LIBRA_ESTERLINA -> {
                return currencyConverterLibraEsterlina.convertToCurrency(currency, BigDecimal.valueOf(initialValue));
            }
            case REAL_PARA_PESO_ARGENTINO -> {
                return currencyConverterPesoArgentino.convertToCurrency(currency, BigDecimal.valueOf(initialValue));
            }
            case REAL_PARA_PESO_CHILENO -> {
                return currencyConverterPesoChileno.convertToCurrency(currency, BigDecimal.valueOf(initialValue));
            }
            case DOLAR_PARA_REAL -> {
                return currencyConverterDollar.convertToReal(currency, BigDecimal.valueOf(initialValue));
            }
            case EURO_PARA_REAL -> {
                return currencyConverterEuro.convertToReal(currency, BigDecimal.valueOf(initialValue));
            }
            case LIBRA_ESTERLINA_PARA_REAL -> {
                return currencyConverterLibraEsterlina.convertToReal(currency, BigDecimal.valueOf(initialValue));
            }
            case PESO_ARGENTINO_PARA_REAL -> {
                return currencyConverterPesoArgentino.convertToReal(currency, BigDecimal.valueOf(initialValue));
            }
            case PESO_CHILENO_PARA_REAL -> {
                return currencyConverterPesoChileno.convertToReal(currency, BigDecimal.valueOf(initialValue));
            }
            default -> throw new Exception("Escolha inválida!");
        }
    }
}
