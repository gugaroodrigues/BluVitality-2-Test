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
public class OrcamentoBean {
    private int id;
    private double orcamento;
    private double reserva_imprevistos;
    private double orcamento_investimentos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public double getReserva_imprevistos() {
        return reserva_imprevistos;
    }

    public void setReserva_imprevistos(double reserva_imprevistos) {
        this.reserva_imprevistos = reserva_imprevistos;
    }

    public double getOrcamento_investimentos() {
        return orcamento_investimentos;
    }

    public void setOrcamento_investimentos(double orcamento_investimentos) {
        this.orcamento_investimentos = orcamento_investimentos;
    }
}
