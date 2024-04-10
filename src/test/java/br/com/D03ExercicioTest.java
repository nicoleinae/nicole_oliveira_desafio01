package br.com;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

import static br.com.Util.checkPoint;
import static br.com.Util.imprimir;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class D03ExercicioTest {

    @Test
    @DisplayName("Checkpoint[07] - class Calculadora")
    public void calculadoraClass() {

        try {
            Class<?> aClass = Class.forName("br.com.desafio03.Calculadora");
            if (!aClass.getName().isEmpty()) {
                imprimir("[14] - Parabéns, a classe Calculadora foi criada com sucesso.");
            }

        } catch (ClassNotFoundException e) {
            imprimir("[15] - Crie um package, desafio03.");
            fail("[16] - A classe 'Calculadora' precisa ser criada antes de executar os testes.");
        }
        imprimir("[17] - Commit com a mensagem abaixo:");
        imprimir("[07] - feat: classe Calculadora.");
        checkPoint("Checkpoint 07", true);
    }

    @Test
    @DisplayName("Checkpoint[08] - método soma")
    public void soma() {
        try {
            Class<?> aClass = Class.forName("br.com.desafio03.Calculadora");
            aClass.getMethod("soma", Integer.class, Integer.class);

        } catch (ClassNotFoundException e) {
            fail("[16] - A classe 'Calculadora' precisa ser implementada antes de executar os testes.");
        } catch (NoSuchMethodException e) {
            imprimir("[18] - crie o método soma com 2 parâmetros do tipo Integer:");
            fail("[19] - O método 'soma' precisa ser criado.");
        }
        imprimir("[20] - Commit com a mensagem abaixo:");
        imprimir("[08] - feat: método soma.");
        checkPoint("Checkpoint 08", true);
    }

    @Test
    @DisplayName("Checkpoint[09] - método subtração")
    public void subtracao() {
        try {
            Class<?> aClass = Class.forName("br.com.desafio03.Calculadora");
            aClass.getMethod("subtracao", String.class, Integer.class);

        } catch (ClassNotFoundException e) {
            fail("[16] - A classe 'Calculadora' precisa ser implementada antes de executar os testes.");
        } catch (NoSuchMethodException e) {
            imprimir("[21] - crie o método subtração com 2 parâmetros String e Integer:");
            fail("[22] - O método 'subtração' precisa ser criado.");
        }
        imprimir("[23] - Commit com a mensagem abaixo:");
        imprimir("[09] - feat: método subtração.");
        checkPoint("Checkpoint 09", true);
    }

    @Test
    @DisplayName("Checkpoint[10] - método multiplicação")
    public void multiplicacao() {
        imprimir("[24] - Dada a sua experiência adquirida até aqui, faça o teste passar:");
        imprimir("[25] - Nessa etapa, as informações são limitadas:");
        imprimir("[26] - Commit dos avanços.");
        try {
            Class<?> calculadora = Class.forName("br.com.desafio03.Calculadora");
            Class<?> multiplicador = Class.forName("br.com.desafio03.tipos.Multiplicador");
            Class<?> multiplicando = Class.forName("br.com.desafio03.tipos.Multiplicando");
            Class<?> retorno = Class.forName("br.com.desafio03.tipos.Resultado");

            Method metodo = calculadora.getMethod("multiplicacao", multiplicador, multiplicando);
            Method metodo2 = calculadora.getMethod("multiplicacao", multiplicando, multiplicador);

            Type genericReturnType = metodo.getGenericReturnType();
            Type genericReturnType2 = metodo2.getGenericReturnType();
            System.out.println(retorno.getName());
            System.out.println(genericReturnType2);

            if (!retorno.getName().equals(genericReturnType.getTypeName())){
                fail("[28] - Método multiplicação precisa ter um retorno.");
            }

            String retornoMultiplicacao = "java.util.List<" + retorno.getName() + ">";
            if (!retornoMultiplicacao.equals(genericReturnType2.getTypeName())){
                fail("[29] - Método multiplicação precisa ter um retorno.");
            }

        } catch (ClassNotFoundException e) {
            fail("[26] - Crie as classes e o pacote necessários.");
        } catch (NoSuchMethodException e) {
            fail("[27] - Crie os métodos necessários.");
        }

        imprimir("[30] - Parabéns, você concluiu esta etapa do desafio:");
        checkPoint("Checkpoint 10", true);
    }

}