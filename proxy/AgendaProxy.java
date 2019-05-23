import java.util.regex.*;
import java.util.*;

public class AgendaProxy implements InterfaceAgenda{
    private Agenda a;

    public AgendaProxy(){
        this.a = new Agenda();
    }
    
    public void addContato(int numero, String nome) {
        Pattern p = Pattern.compile("[^A-Za-z]");
        Matcher m = p.matcher(nome);
        boolean has_special_char = m.find();

        if(numero > 100000000 && !has_special_char){
            String num = Integer.toString(numero);
            String contato = nome + "-" + num;
            this.contatos.add(contato);
        }else{
            System.out.println("Inserção inválida");
        }
    }

    public ArrayList<String> getAgenda() {
        return this.contatos;
    }

    public void removeContato(String nome) {
        for (int i = 0; i < this.contatos.size(); i++) {
            if (this.contatos.get(i).contains(nome)) {
                contatos.remove(i);
            }
        }
    }
}