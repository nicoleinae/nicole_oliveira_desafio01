package br.com.desafio03.tipos;

public class Resultado {

    private Integer resultado;

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "resultado=" + resultado +
                '}';
    }
}
