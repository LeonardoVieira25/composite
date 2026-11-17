public class Operacional extends Setor {

    private int cargaHoraria;

    public Operacional(String descricao, int cargaHoraria) {
        super(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getResumo() {
        return "Cargo: " + this.getNome() + " - carga horária: " + this.cargaHoraria + "\n";
    }

}
