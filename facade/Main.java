public class Main {
    public static void main(String[] args) {
        StoreFacade store = new StoreFacade(new AddToStorage(), new RemoveFromStorage(), new SellProduct(), new RefundProduct());

        System.out.print("Adicionado: ");
        System.out.println(store.add("Camiseta", 2));

        System.out.print("Removido: ");
        System.out.println(store.remove("Short", 1));

        System.out.print("Vendido: ");
        System.out.println(store.sell("Calça", 1));

        System.out.print("Estornado: ");
        System.out.println(store.refund("Tênis", 4));
    }
}