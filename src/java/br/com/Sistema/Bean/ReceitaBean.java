package br.com.Sistema.Bean;

/**
 * @author Cidmar
 */
public class ReceitaBean {
    private int id;
    private double clientes_particulares;
    private double convenio_sus;
    private double outros_convenios;
    private double servicos_a_faturar;
    private double diversos;
    private double adiantamentos_a_terceiros;
    private double arrecadacoes;
    private double bens_e_titulos_a_receber;
    private double total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getClientes_particulares() {
        return clientes_particulares;
    }

    public void setClientes_particulares(double clientes_particulares) {
        this.clientes_particulares = clientes_particulares;
    }

    public double getConvenio_sus() {
        return convenio_sus;
    }

    public void setConvenio_sus(double convenio_sus) {
        this.convenio_sus = convenio_sus;
    }

    public double getOutros_convenios() {
        return outros_convenios;
    }

    public void setOutros_convenios(double outros_convenios) {
        this.outros_convenios = outros_convenios;
    }

    public double getServicos_a_faturar() {
        return servicos_a_faturar;
    }

    public void setServicos_a_faturar(double servicos_a_faturar) {
        this.servicos_a_faturar = servicos_a_faturar;
    }

    public double getDiversos() {
        return diversos;
    }

    public void setDiversos(double diversos) {
        this.diversos = diversos;
    }

    public double getAdiantamentos_a_terceiros() {
        return adiantamentos_a_terceiros;
    }

    public void setAdiantamentos_a_terceiros(double adiantamentos_a_terceiros) {
        this.adiantamentos_a_terceiros = adiantamentos_a_terceiros;
    }

    public double getArrecadacoes() {
        return arrecadacoes;
    }

    public void setArrecadacoes(double arrecadacoes) {
        this.arrecadacoes = arrecadacoes;
    }

    public double getBens_e_titulos_a_receber() {
        return bens_e_titulos_a_receber;
    }

    public void setBens_e_titulos_a_receber(double bens_e_titulos_a_receber) {
        this.bens_e_titulos_a_receber = bens_e_titulos_a_receber;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
