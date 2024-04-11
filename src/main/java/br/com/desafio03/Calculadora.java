package br.com.desafio03;

import br.com.desafio03.tipos.Multiplicador;
import br.com.desafio03.tipos.Multiplicando;
import br.com.desafio03.tipos.Resultado;
import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    public void soma (Integer a, Integer b) {
        Integer soma = a + b;
        System.out.println(soma);
    }

    public  void subtracao (String a, Integer b) {

    }

    public Resultado multiplicacao (Multiplicador multiplicador, Multiplicando multiplicando) {
        Resultado resultado  = new Resultado();
        resultado.setResultado(multiplicador.getMultiplicador() * multiplicando.getMultiplicando());
        return resultado;
    }
    public List<Resultado> multiplicacao (Multiplicando multiplicando, Multiplicador multiplicador) {
        Resultado resultado  = new Resultado();
        List<Resultado> resultados  = new ArrayList<Resultado>();
        resultado.setResultado(multiplicador.getMultiplicador() * multiplicando.getMultiplicando());
        resultados.add(resultado);
        return resultados;
    }

}
