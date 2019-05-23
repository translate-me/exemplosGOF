public class Main{
    public static void main(String[] args) {
        System.out.println("Agenda:");
        AgendaProxy a = new AgendaProxy();
        a.addContato(987654321, "Milene");
        a.addContato(912345678, "Mauricio");
        System.out.println(a.getAgenda());

    }
}