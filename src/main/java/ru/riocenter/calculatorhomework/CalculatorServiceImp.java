package ru.riocenter.calculatorhomework;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp implements CalculatorService {
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        if (num1 == null && num2 == null) {
            return "Необходимо ввести оба значения";
        }
        if (num1 == null) {
            return "Необходимо ввести первое число";
        }
        if (num2 == null) {
            return "Необходимо ввести первое число";
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num1 == null && num2 == null) {
            return "Необходимо ввести оба значения";
        }
        if (num1 == null) {
            return "Необходимо ввести первое число";
        }
        if (num2 == null) {
            return "Необходимо ввести первое число";
        }
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null && num2 == null) {
            return "Необходимо ввести оба значения";
        }
        if (num1 == null) {
            return "Необходимо ввести первое число";
        }
        if (num2 == null) {
            return "Необходимо ввести первое число";
        }
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(Double num1, Double num2) {
        if (num1 == null && num2 == null) {
            return "Необходимо ввести оба значения";
        }
        if (num1 == null) {
            return "Необходимо ввести первое число";
        }
        if (num2 == null) {
            return "Необходимо ввести первое число";
        }
        if (num2 == 0) {
            return "Второе число не должно быть равно нулю";
        }
        return String.format("%f / %f = %.2f", num1, num1, num1 / num2);
//        return Double.toString(num1) + " / " + Double.toString(num2) + " = " + Double.toString(num1 / num2);
    }
}
