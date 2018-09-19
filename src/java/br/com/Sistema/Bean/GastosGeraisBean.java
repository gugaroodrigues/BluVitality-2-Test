/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.Bean;

/**
 *
 * @author Edemar
 */
public class GastosGeraisBean {
    private int id;
    private double manutencao_equipamentos;
    private double limpeza;
    private double manutencao_estrutura;
    private double alimentacao;
    private double materiais_de_consumo;
    private double medicamentos;
    private double imprevistos;
    private double total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getManutencao_equipamentos() {
        return manutencao_equipamentos;
    }

    public void setManutencao_equipamentos(double manutencao_equipamentos) {
        this.manutencao_equipamentos = manutencao_equipamentos;
    }

    public double getLimpeza() {
        return limpeza;
    }

    public void setLimpeza(double limpeza) {
        this.limpeza = limpeza;
    }

    public double getManutencao_estrutura() {
        return manutencao_estrutura;
    }

    public void setManutencao_estrutura(double manutencao_estrutura) {
        this.manutencao_estrutura = manutencao_estrutura;
    }

    public double getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(double alimentacao) {
        this.alimentacao = alimentacao;
    }

    public double getMateriais_de_consumo() {
        return materiais_de_consumo;
    }

    public void setMateriais_de_consumo(double materiais_de_consumo) {
        this.materiais_de_consumo = materiais_de_consumo;
    }

    public double getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(double medicamentos) {
        this.medicamentos = medicamentos;
    }

    public double getImprevistos() {
        return imprevistos;
    }

    public void setImprevistos(double imprevistos) {
        this.imprevistos = imprevistos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
