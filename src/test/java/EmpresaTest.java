import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EmpresaTest {
    @Test
    void deveRetornarResumoDaEquipe() {
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

        String resumoEsperado = "" +
                "Gerencia: Gerência de TI\n" +
                "Gerencia: Gerência de Infraestrutura\n" +
                "Cargo: Administrador de Banco de Dados - carga horária: 40\n" +
                "Gerencia: Gerência de Suporte\n" +
                "Cargo: Analista de Suporte - carga horária: 40\n" +
                "Gerencia: Gerência de Desenvolvimento\n" +
                "Cargo: Desenvolvedor Java - carga horária: 40\n";

        assertEquals(resumoEsperado, empresa.getEquipe());
    }

    @Test
    void deveLancarExcecaoQuandoEquipeNaoDefinida() {
        Empresa empresa = new Empresa();
        assertThrows(NullPointerException.class, () -> empresa.getEquipe());
    }
}
