import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface InterfaceAgenda {
    public ArrayList<String> contatos = new ArrayList();

    public void addContato(int telefone, String nome);
    public ArrayList<String> getAgenda();
    public void removeContato(String nome);
}