package br.com;

import org.junit.jupiter.api.*;

import java.lang.reflect.Field;

import static br.com.Util.*;
import static org.junit.jupiter.api.Assertions.fail;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class D01ExercicioTest {

    @Test
    @DisplayName("Checkpoint[03] - tiposPrimitivos")
    public void tiposPrimitivos() {

        try {
            Class<?> aClass = Class.forName("br.com.desafio01.Tipos");

            Field aByte = getField(aClass, "aByte");
            Field aShort = getField(aClass, "aShort");
            Field aInt = getField(aClass, "aInt");
            Field aLong = getField(aClass, "aLong");
            Field aFloat = getField(aClass, "aFloat");
            Field aDouble = getField(aClass, "aDouble");
            Field aBoolean = getField(aClass, "aBoolean");
            Field aChar = getField(aClass, "aChar");

            verificarTipos(aByte, aShort, aInt, aLong, aFloat, aDouble, aBoolean, aChar);
        } catch (ClassNotFoundException e) {
            imprimir("[06] - Crie um pacote, desafio01.");
            fail("[07] - A classe 'Tipos' precisa ser implementada antes de executar os testes.");
        } catch (NoSuchFieldException e) {
            imprimir("[08] - Declare propriedades dos tipos primitivos.");
            imprimir("    [08.A] - Use para o nome, tipo com prefixo 'a' e padrão camelCase, por exemplo, byte fica aByte.");
            fail("Declare todos os tipos primitivos.");
        }
        imprimir("[09] - Parabéns! Exercício 1 concluído, não esqueça de fazer o push.");
        checkPoint("Checkpoint 03", false);
    }
}