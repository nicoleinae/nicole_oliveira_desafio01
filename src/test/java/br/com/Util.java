package br.com;

import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.fail;

public abstract class Util {

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static Field getField(Class<?> aClass, String aTipo) throws NoSuchFieldException {
        return aClass.getDeclaredField(aTipo);
    }

    public static String getTypeName(Field field1) {
        return field1.getGenericType().getTypeName();
    }

    public static void verificarTipos(Field aByte, Field aShort, Field aInt, Field aLong, Field aFloat, Field aDouble, Field aBoolean, Field aChar) {
        if (!getTypeName(aByte).equals("byte")) {
            fail("aByte, deve ser do tipo byte");
        }
        if (!getTypeName(aShort).equals("short")) {
            fail("aShort, deve ser do tipo short");
        }
        if (!getTypeName(aInt).equals("int")) {
            fail("aInt, deve ser do tipo int");
        }
        if (!getTypeName(aLong).equals("long")) {
            fail("aLong, deve ser do tipo long");
        }

        if (!getTypeName(aFloat).equals("float")) {
            fail("aFloat, deve ser do tipo float");
        }

        if (!getTypeName(aLong).equals("long")) {
            fail("aLong, deve ser do tipo long");
        }

        if (!getTypeName(aDouble).equals("double")) {
            fail("aDouble, deve ser do tipo double");
        }

        if (!getTypeName(aBoolean).equals("boolean")) {
            fail("aBoolean, deve ser do tipo boolean");
        }

        if (!getTypeName(aChar).equals("char")) {
            fail("aChar, deve ser do tipo char");
        }

        if (!getTypeName(aDouble).equals("double")) {
            fail("aDouble, deve ser do tipo double");
        }
    }

    public static void checkPoint(String msg, boolean bool){
        Assertions.assertTrue(bool, msg);
    }
}
