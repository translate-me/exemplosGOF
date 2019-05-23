import java.util.regex.*;
import java.util.*;

public class AgendaProxy implements InterfaceAgenda{
    private Agenda a;

    public AgendaProxy(){
        this.a = new Agenda();
    }
    
    public void addContato(int numero, String nome) {
        Pattern p = Pattern.compile("[^A-Z a-z]");
        Matcher m = p.matcher(nome);
        boolean has_special_char = m.find();

        if(numero > 100000000 && !has_special_char){
            a.addContato(numero, nome);
        }else{
            System.out.println("Inserção inválida");
        }
    }

    public ArrayList<String> getAgenda() {
        return this.a.getAgenda();
    }

    public void removeContato(String nome) {
        this.a.removeContato(nome);
    }
}