package com.estudos;

import com.estudos.enums.ConverterType;
import com.estudos.interfaces.InitConverter;
import com.estudos.modelos.InitConverterCurrencies;
import com.estudos.modelos.Repeater;
import com.estudos.modelos.Validator;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.math.BigDecimal;

public class Converter {
    public static void main(String[] args) throws Exception {

        UIManager.put("OptionPane.cancelButtonText", "Cancelar");

        String currencyConversion = "Converter moeda";

        Object[] options = {currencyConversion};

        boolean execute = true;

        Repeater repeater = new Repeater();

        while (execute) {

            String conversionType = JOptionPane.showInputDialog(null, "Escolha o tipo de conversão", "Conversor",
                    JOptionPane.PLAIN_MESSAGE, null, options, options[0]).toString();

            InitConverter initConverter = null;

            String operation = null;

            if (conversionType.equals(currencyConversion)) {
                initConverter = new InitConverterCurrencies();

                operation = JOptionPane.showInputDialog(null, "Escolha a operação", "Conversão de moedas",
                        JOptionPane.PLAIN_MESSAGE, null,
                        new String[] { ConverterType.REAL_PARA_DOLLAR.getDescription(),
                                ConverterType.REAL_PARA_EURO.getDescription(),
                                ConverterType.REAL_PARA_LIBRA_ESTERLINA.getDescription(),
                                ConverterType.REAL_PARA_PESO_ARGENTINO.getDescription(),
                                ConverterType.REAL_PARA_PESO_CHILENO.getDescription(),
                                ConverterType.DOLLAR_PARA_REAL.getDescription(),
                                ConverterType.EURO_PARA_REAL.getDescription(),
                                ConverterType.LIBRA_ESTERLINA_PARA_REAL.getDescription(),
                                ConverterType.PESO_ARGENTINO_PARA_REAL.getDescription(),
                                ConverterType.PESO_CHILENO_PARA_REAL.getDescription() },
                        0).toString();
            }

            String message = "Insira um valor para ser convertido \n(apenas números separados por \".\")";
            String valueInserted = JOptionPane.showInputDialog(null, message, "Conversão de " + operation,
                    JOptionPane.PLAIN_MESSAGE);

            Validator validator = new Validator();

            if (!validator.check(valueInserted) || valueInserted.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "Atenção!", JOptionPane.ERROR_MESSAGE);
            } else {
                double valor = validator.turnsIntoDouble(valueInserted);
                BigDecimal valueConverted = initConverter != null ? initConverter.operateConversion(operation, valor) : null;

                String result = ("Conversão de " + operation + "\n Valor inserido: " + valueInserted
                        + "\n Resultado: " + valueConverted);

                JOptionPane.showMessageDialog(null, result, "Resultado da operação", JOptionPane.PLAIN_MESSAGE);
            }
            execute = repeater.tryRepeat();
        }
    }
}
