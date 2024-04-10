package br.com.desafio03.tipos;

public class Multiplicador {
    private Integer multiplicador;

    public Integer getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(Integer multiplicador) {
        this.multiplicador = multiplicador;
    }

    @Override
    public String toString() {
        return "Multiplicador{" +
                "multiplicador=" + multiplicador +
                '}';
    }
}
