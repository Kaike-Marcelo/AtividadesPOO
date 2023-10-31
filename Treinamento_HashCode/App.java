public class App {
    public static void main(String[] args) {

        Produto p1 = new Produto(0, "Esqueiro", 10.00);
        Produto p2 = new Produto(0, "Esqueiro", 10.00);

        Produto p3 = new Produto(1, "Torneira", 20.00);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1.equals(p3));
        System.out.println(p3.hashCode());
    }
}
