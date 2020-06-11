package com.core.shibaev.first.service;

import com.core.shibaev.first.exeption.CustomExeption;
import com.core.shibaev.first.validator.NumericValidator;

public class NumericService {

    public double calculateDivisionSquare(String stringValueOfNum) throws CustomExeption {
        if (NumericValidator.StringIsDouble(stringValueOfNum)) {
            String lastNumeral = String.valueOf(stringValueOfNum.charAt(stringValueOfNum.length() - 1));
            return Math.pow(Double.parseDouble(lastNumeral), 2);
        } else {
            throw new CustomExeption("WrongInput");
        }
    }

    public boolean isNumPerfect(String checkedNum) throws CustomExeption {
        int sum = 0;
        int num;
        boolean result = false;
        if (NumericValidator.StringIsInt(checkedNum)) {
            num = Integer.parseInt(checkedNum);
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (num == sum) {
                result = true;
            }
            return result;
        } else {
            throw new CustomExeption("WrongInput");
        }

    }

    //This method returns true if massive has at least 2 even values
    public boolean isMassEven(String[] mass) throws CustomExeption {
        boolean result = false;
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (!NumericValidator.StringIsInt(mass[i])) {
                throw new CustomExeption("WrongInput");
            } else if (Integer.parseInt(mass[i]) % 2 == 0) {
                count++;
            }
        }
        if (count >= 2) {
            result = true;
        }
        return result;
    }


}
