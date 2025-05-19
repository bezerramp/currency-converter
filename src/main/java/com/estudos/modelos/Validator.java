package com.estudos.modelos;

public class Validator {

    public boolean check(String operation) {

        return operation.matches("[=-]?\\d*(\\.\\d+)?"); // verificando se o resultado da operação é um valor numérico
    }

    public double turnsIntoDouble(String operation) {
        return Double.parseDouble(operation);
    }
}
