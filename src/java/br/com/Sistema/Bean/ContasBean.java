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
public class ContasBean {
    private int id;
    private double energia_eletrica;
    private double agua;
    private double gas;
    private double telefone_e_internet;
    private double aluguel;
    private double fornecedores;
    private double total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getEnergia_eletrica() {
        return energia_eletrica;
    }

    public void setEnergia_eletrica(double energia_eletrica) {
        this.energia_eletrica = energia_eletrica;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public double getTelefone_e_internet() {
        return telefone_e_internet;
    }

    public void setTelefone_e_internet(double telefone_e_internet) {
        this.telefone_e_internet = telefone_e_internet;
    }

    public double getAluguel() {
        return aluguel;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }

    public double getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(double fornecedores) {
        this.fornecedores = fornecedores;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
