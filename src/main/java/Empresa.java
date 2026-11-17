public class Empresa {

    private Setor equipe;

    public void setEquipe(Setor equipe) {
        this.equipe = equipe;
    }

    public String getEquipe() {
        if (this.equipe == null) {
            throw new NullPointerException("Equipe não definida");
        }
        return this.equipe.getResumo();
    }
}
