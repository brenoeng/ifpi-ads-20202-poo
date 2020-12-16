public class TestaDecimalNumber {
    public static void main(String[] args) {
        DecimalNumber dn = new DecimalNumber();

        dn.numero = 1.325354;
// asfa
        System.out.println(dn.exibirParteInteira());
        System.out.println(dn.exibirParteDecimal());

    }
}
