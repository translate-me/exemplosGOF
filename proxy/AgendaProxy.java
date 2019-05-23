import java.util.regex.*;
import java.util.*;

public class AgendaProxy implements InterfaceAgenda{
    private Agenda agenda;

    public AgendaProxy(){
        this.agenda = new Agenda();
    }
    
    public void addContato(int numero, String nome) {
        Pattern p = Pattern.compile("[^A-Z a-z]");
        Matcher m = p.matcher(nome);
        boolean has_special_char = m.find();

        if(numero > 100000000 && !has_special_char){
            agenda.addContato(numero, nome);
        }else{
            System.out.println("Inserção inválida");
        }
    }

    public ArrayList<String> getAgenda() {
        return this.agenda.getAgenda();
    }

    public void removeContato(String nome) {
        this.agenda.removeContato(nome);
    }
}