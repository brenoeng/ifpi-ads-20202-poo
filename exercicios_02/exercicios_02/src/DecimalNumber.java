public class DecimalNumber {
    double numero;

    public int exibirParteInteira() {
        int inteiro = (int) numero;
        return inteiro;
    }

    public double exibirParteDecimal() {
        double decimal = numero - (int) numero;
        return decimal;
    }
}
