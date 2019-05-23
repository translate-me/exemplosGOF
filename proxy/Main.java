public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
        AgendaProxy a = new AgendaProxy();
        a.addContato(123456789, "gabi");
        System.out.println(a.getAgenda());

    }
}