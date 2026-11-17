import java.util.ArrayList;
import java.util.List;

public class Gerencia extends Setor {

    private List<Setor> setores;

    public Gerencia(String nome) {
        super(nome);
        this.setores = new ArrayList<Setor>();
    }

    public void addSetor(Setor setor) {
        this.setores.add(setor);
    }

    public String getResumo() {
        String saida = "";
        saida = "Gerencia: " + this.getNome() + "\n";
        for (Setor setor : setores) {
            saida += setor.getResumo();
        }
        return saida;
    }
}
