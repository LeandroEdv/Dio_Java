package binaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemple {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        BinaryOperator<Integer> soma = (num1, num2) -> num1 + num2;

        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println("A soma dos numeros é: " + resultado);
    }
}
