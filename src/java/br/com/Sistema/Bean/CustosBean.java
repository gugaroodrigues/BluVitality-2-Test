package br.com.Sistema.Bean;

/**
 * @author Cidmar
 */
public class CustosBean {
   private int id;
   private int id_gastoFuncionario;
   private int id_conta;
   private int id_gastoGeral;
   private int id_investimento;
   private double total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_gastoFuncionario() {
        return id_gastoFuncionario;
    }

    public void setId_gastoFuncionario(int id_gastoFuncionario) {
        this.id_gastoFuncionario = id_gastoFuncionario;
    }

    public int getId_conta() {
        return id_conta;
    }

    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    public int getId_gastoGeral() {
        return id_gastoGeral;
    }

    public void setId_gastoGeral(int id_gastoGeral) {
        this.id_gastoGeral = id_gastoGeral;
    }

    public int getId_investimento() {
        return id_investimento;
    }

    public void setId_investimento(int id_investimento) {
        this.id_investimento = id_investimento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
