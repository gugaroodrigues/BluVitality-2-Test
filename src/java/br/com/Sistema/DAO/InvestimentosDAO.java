/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.DAO;

import br.com.Sistema.Bean.InvestimentosBean;
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
public class InvestimentosDAO {
    public List<InvestimentosBean> obterTodos() {
        List<InvestimentosBean> investimentos = new ArrayList<>();
        String sql = "SELECT * FROM investimentos";
        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();

            while (resultSet.next()) {
                InvestimentosBean investimento = new InvestimentosBean();
                investimento.setId(resultSet.getInt("id"));
                investimento.setTipo(resultSet.getString("tipo"));
                investimento.setDescricao(resultSet.getString("descricao"));
                investimento.setValor(resultSet.getDouble("Valor"));
                investimentos.add(investimento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return investimentos;
    }

    public InvestimentosBean obterPeloId(int id) {
        InvestimentosBean investimento = null;
        String sql = "SELECT id, tipo, descricao, valor FROM investimentos WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.getResultSet();

            while (resultSet.next()) {
                investimento = new InvestimentosBean();
                investimento.setId(resultSet.getInt("id"));
                investimento.setTipo(resultSet.getString("tipo"));
                investimento.setDescricao(resultSet.getString("descricao"));
                investimento.setValor(resultSet.getDouble("Valor"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return investimento;
    }

    public int adicionar(InvestimentosBean investimento) {
        String sql = "INSERT INTO investimento(tipo, descricao, valor) VALUES(?,?,?)";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setString(1, investimento.getTipo());
            ps.setString(2, investimento.getDescricao());
            ps.setDouble(3, investimento.getValor());
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

    public boolean alterar(InvestimentosBean investimento) {
        try {
            String sql = "UPDATE investimento SET tipo = ?, descricao = ?, valor = ? WHERE id = ?";
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setString(1, investimento.getTipo());
            ps.setString(2, investimento.getDescricao());
            ps.setDouble(3, investimento.getValor());
            ps.setInt(4, investimento.getId());

            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

    public boolean excluir(int id) {
        String sql = "DELETE FROM investimentos WHERE id = ?";
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
