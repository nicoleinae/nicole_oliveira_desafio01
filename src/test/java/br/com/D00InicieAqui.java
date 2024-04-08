package br.com;

import org.junit.jupiter.api.*;

import static br.com.Util.checkPoint;
import static br.com.Util.imprimir;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class D00InicieAqui {

    @Test
    @DisplayName("Checkpoint[01] - criarRepo")
    public void criarRepo() {
        imprimir("[00] - Este exercício não deve ser divulgado.");
        imprimir("[00] - Não são permitidas edições nos arquivos de teste, exceto nos checkpoints.");
        imprimir("[00] - Conforme for avançando, troque false para true.");
        imprimir("[01] - Crie um repositório no GitHub privado:");
        imprimir("    [01.A] - Padrão do nome: primeiroNome_ultimoNome_desafio01");
        imprimir("    [01.B] - A branch principal deve ter o nome main.");
        checkPoint("Checkpoint 01", true);
    }

    @Test
    @DisplayName("Checkpoint[02] - criarBranchIntrucoes")
    public void criarBranchIntrucoes() {
        imprimir("[02] - Deve existir uma branch dev.");
        imprimir("    [02.A] - A branch main só deve receber Pull Requests ou Merge Requests da branch dev.");
        imprimir("    [02.B] - Crie uma branch por desafio sendo ramificada da branch dev.");
        imprimir("    [02.C] - Obrigatório README documentando progresso.");
        imprimir("    [02.D] - Crie uma branch por desafio, desafio01 ... desafio05.");
        imprimir("    [02.F] - Utilize commits semânticos.");
        imprimir("[03] - Execute os exercícios em ordem.");
        imprimir("[04] - Abra um PR por desafio da branch dev para a main.");
        imprimir("[05] - Boa sorte e divirta-se.");
        checkPoint("Checkpoint 02", false);
    }
}
