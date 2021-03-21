package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
       if(NumberUtils.isCreatable(str)){
           BigDecimal number = NumberUtils.createBigDecimal(str);
           if (number.compareTo(BigDecimal.ZERO) > 0) {
               return true;
           }
       }
        return false;
    }
}
