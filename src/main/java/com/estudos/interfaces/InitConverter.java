package com.estudos.interfaces;

import java.math.BigDecimal;

public interface InitConverter {
    BigDecimal operateConversion(String operation, double initialValue) throws Exception;
}
