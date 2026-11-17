
public class Main {
    public static void main(String[] args) {
        Gerencia gerencia = new Gerencia("Gerência de TI");
        Gerencia gerenciaDeInfra = new Gerencia("Gerência de Infraestrutura");
        Gerencia gerenciaDeSuporte = new Gerencia("Gerência de Suporte");
        Gerencia gerenciaDeDesenvolvimento = new Gerencia("Gerência de Desenvolvimento");

        gerencia.addSetor(gerenciaDeInfra);
        gerencia.addSetor(gerenciaDeSuporte);
        gerencia.addSetor(gerenciaDeDesenvolvimento);

        gerenciaDeInfra.addSetor(new Operacional("Administrador de Banco de Dados", 40));
        gerenciaDeSuporte.addSetor(new Operacional("Analista de Suporte", 40));
        gerenciaDeDesenvolvimento.addSetor(new Operacional("Desenvolvedor Java", 40));

        Empresa empresa = new Empresa();
        empresa.setEquipe(gerencia);

        System.out.println(empresa.getEquipe());
    }
}
