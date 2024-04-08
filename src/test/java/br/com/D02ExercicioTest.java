package br.com;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static br.com.Util.*;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class D02ExercicioTest {

    @Test
    @DisplayName("Checkpoint[04] - metodosClass")
    public void metodosClass() {

        try {
            Class<?> aClass = Class.forName("br.com.desafio02.Metodos");

            if (!aClass.getName().isEmpty()) {
                imprimir("[12]Parabens, a classe Metodos foi instanciada com sucesso. ");
            }

        } catch (ClassNotFoundException e) {
            imprimir("[10] - Crie um pacote, desafio02.");
            fail("[11] - A classe 'Metodos' precisa ser implementada antes de executar os testes.");
        }
        checkPoint("Checkpoint 04", false);
    }

    @Test
    @DisplayName("Checkpoint[05, 06] - metodos")
    public void metodoVoid() {

        Method metodoVoid = null;
        try {
            Class<?> aClass = Class.forName("br.com.desafio02.Metodos");
            metodoVoid = aClass.getMethod("metodoVoid");

        } catch (ClassNotFoundException e) {
            imprimir("[10] - Crie um pacote, desafio02.");
            fail("[11] - A classe 'Metodos' precisa ser implementada antes de executar os testes.");
        } catch (NoSuchMethodException e) {

            imprimir("[11] - declare um metodo chamado metodoVoid, dentro da classe criada.");
            imprimir("    [11.A] - Não Deve ter retorno.");
            fail("[12] - A metodo 'metodoVoid' precisa ser implementado.");
        }
        checkPoint("Checkpoint 05", false);
        String tipoRetorno = metodoVoid.getReturnType().getName();
        imprimir(tipoRetorno);
        if(tipoRetorno.equals("void")){
            imprimir("    [13] - Não sem retorno identificado.");
            checkPoint("Checkpoint 06", false);
        }
    }


}