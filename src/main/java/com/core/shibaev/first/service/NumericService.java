package com.core.shibaev.first.service;

import com.core.shibaev.first.exeption.CustomExeption;
import com.core.shibaev.first.validator.NumericValidator;

public class NumericService {

    public double calculateDivisionSquare(double num) {
        String stringNum = String.valueOf(num);
        double lastNumeral = Integer.parseInt(String.valueOf(stringNum.charAt(stringNum.length() - 1)));
        return Math.pow(lastNumeral, 2);
    }

    public boolean isNumPerfect(int num) throws CustomExeption {
        int sum = 0;
        boolean result = false;
        if (!NumericValidator.IsNatural(num)) {
            throw new CustomExeption("Wrong input");
        }
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            result = true;
        }
        return result;
    }

    //This method returns true if massive has at least 2 even values
    public boolean isMassEven(double[] mass) {
        boolean result = false;
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                count++;
            }
        }
        if (count >= 2) {
            result = true;
        }
        return result;
    }


}
