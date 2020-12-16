class Retangulo {
    double l1;
    double l2;

    double calcularArea() {
        return l1*l2;
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.l1 = 5;
        retangulo.l2 = 5;
        System.out.println(retangulo.calcularArea());

    }
}

