public class TestaApp {
    public static void main(String[] args) {
        App teste = new App();
        System.out.println(teste.quantReservas);
        teste.adicionarReserva();
        System.out.println(teste.quantReservas);
    }
}
