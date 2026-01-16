package model;

public class carrosModel {
    private String nomeveiculo;

    private String marca;

    private int ano;

    private String cor;

    public carrosModel(String nomeVeiculo, String marca, int ano, String cor) {
        this.nomeveiculo = nomeVeiculo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }

    public String getNomeveiculo() {
        return nomeveiculo;
    }

    public void setNomeveiculo(String nomeveiculo) {
        this.nomeveiculo = nomeveiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
