import java.util.*;
import java.lang.String;

public class Agenda implements InterfaceAgenda{

    public Agenda(){}

    public void addContato(int numero, String nome){
        String num = Integer.toString(numero);
        String contato = nome + "-" + num;
        this.contatos.add(contato);
    }
    public ArrayList<String> getAgenda() {
        return this.contatos;
    }
    public void removeContato(String nome){
        for (int i = 0; i < this.contatos.size(); i++){
            if(this.contatos.get(i).contains(nome)){
                contatos.remove(i);
            }
        }
    }
}