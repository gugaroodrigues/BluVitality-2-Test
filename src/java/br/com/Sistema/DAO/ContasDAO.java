/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.DAO;

import br.com.Sistema.Bean.ContasBean;
import br.com.Sistema.Database.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edemar
 */
public class ContasDAO {
    public List<ContasBean> obterTodos() {
        List<ContasBean> contas = new ArrayList<>();
        String sql = "SELECT * FROM contas";
        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();

            while (resultSet.next()) {
                ContasBean conta = new ContasBean();
                conta.setId(resultSet.getInt("id"));
                conta.setEnergia_eletrica(resultSet.getDouble("energia_eletrica"));
                conta.setAgua(resultSet.getDouble("agua"));
                conta.setGas(resultSet.getDouble("gas"));
                conta.setTelefone_e_internet(resultSet.getDouble("telefone_e_internet"));
                conta.setAluguel(resultSet.getDouble("aluguel"));
                conta.setFornecedores(resultSet.getDouble("fornecedores"));
                conta.setTotal(resultSet.getDouble("total"));
                contas.add(conta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return contas;
    }

    public ContasBean obterPeloId(int id) {
        ContasBean conta = null;
        String sql = "SELECT id, energia_eletrica, agua, gas, telefone_e_internet, aluguel, fornecedores, total FROM contas WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.getResultSet();

            while (resultSet.next()) {
                conta = new ContasBean();
                conta.setId(resultSet.getInt("id"));
                conta.setEnergia_eletrica(resultSet.getDouble("energia_eletrica"));
                conta.setAgua(resultSet.getDouble("agua"));
                conta.setGas(resultSet.getDouble("gas"));
                conta.setTelefone_e_internet(resultSet.getDouble("telefone_e_internet"));
                conta.setAluguel(resultSet.getDouble("aluguel"));
                conta.setFornecedores(resultSet.getDouble("fornecedores"));
                conta.setTotal(resultSet.getDouble("total"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return conta;
    }

    public int adicionar(ContasBean conta) {
        String sql = "INSERT INTO conta(energia_eletrica, agua, gas, telefone_e_internet, aluguel, fornecedores, total) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setDouble(1, conta.getEnergia_eletrica());
            ps.setDouble(2, conta.getAgua());
            ps.setDouble(3, conta.getGas());
            ps.setDouble(4, conta.getTelefone_e_internet());
            ps.setDouble(5, conta.getAluguel());
            ps.setDouble(6, conta.getFornecedores());
            ps.setDouble(7, conta.getTotal());
            ps.execute();
            ResultSet resultSet = ps.getGeneratedKeys();
            if (resultSet.next()) {
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return -1;
    }

    public boolean alterar(ContasBean conta) {
        try {
            String sql = "UPDATE conta SET energia_eletrica = ?, agua = ?, gas = ?, telefone_e_internet = ?, aluguel = ?, fornecedores = ?, total = ? WHERE id = ?";
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setDouble(1, conta.getEnergia_eletrica());
            ps.setDouble(2, conta.getAgua());
            ps.setDouble(3, conta.getGas());
            ps.setDouble(4, conta.getTelefone_e_internet());
            ps.setDouble(5, conta.getAluguel());
            ps.setDouble(6, conta.getFornecedores());
            ps.setDouble(7, conta.getTotal());
            ps.setInt(8, conta.getId());

            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

    public boolean excluir(int id) {
        String sql = "DELETE FROM contas WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }
}
