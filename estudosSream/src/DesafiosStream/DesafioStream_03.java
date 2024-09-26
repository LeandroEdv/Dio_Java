package DesafiosStream;
import java.util.Arrays;
import java.util.List;

// Desafio 3 - Verifique se todos os números da lista são positivos:
public class DesafioStream_03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -4);

        boolean result = numeros.stream()
                .anyMatch(n -> n < 0);
        String msg = !result ? "A lista não possui numeros negativos":" A lista possui numeros negativos";
        System.out.println(msg);
    }
}
