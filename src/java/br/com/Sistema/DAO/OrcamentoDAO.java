/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.DAO;

import br.com.Sistema.Bean.OrcamentoBean;
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
public class OrcamentoDAO {
    public List<OrcamentoBean> obterTodos() {
        List<OrcamentoBean> orcamentos = new ArrayList<>();
        String sql = "SELECT * FROM orcamentos";
        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();

            while (resultSet.next()) {
                OrcamentoBean orcamento = new OrcamentoBean();
                orcamento.setId(resultSet.getInt("id"));
                orcamento.setOrcamento(resultSet.getDouble("orcamento"));
                orcamento.setReserva_imprevistos(resultSet.getDouble("reserva_imprevistos"));
                orcamento.setOrcamento_investimentos(resultSet.getDouble("orcamento_investimentos"));
                orcamentos.add(orcamento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return orcamentos;
    }

    public OrcamentoBean obterPeloId(int id) {
        OrcamentoBean orcamento = null;
        String sql = "SELECT id, orcamento, reserva_imprevistos, orcamento_investimentos FROM orcamentos WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.getResultSet();

            while (resultSet.next()) {
                orcamento = new OrcamentoBean();
                orcamento.setId(resultSet.getInt("id"));
                orcamento.setOrcamento(resultSet.getDouble("orcamento"));
                orcamento.setReserva_imprevistos(resultSet.getDouble("reserva_imprevistos"));
                orcamento.setOrcamento_investimentos(resultSet.getDouble("orcamento_investimentos"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return orcamento;
    }

    public int adicionar(OrcamentoBean orcamento) {
        String sql = "INSERT INTO orcamento(orcamento, reserva_imprevistos, orcamento_investimentos) VALUES(?,?,?)";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setDouble(1, orcamento.getOrcamento());
            ps.setDouble(2, orcamento.getReserva_imprevistos());
            ps.setDouble(3, orcamento.getOrcamento_investimentos());
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

    public boolean alterar(OrcamentoBean orcamento) {
        try {
            String sql = "UPDATE orcamento SET orcamento = ?, reserva_imprevistos = ?, orcamento_investimentos = ? WHERE id = ?";
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setDouble(1, orcamento.getOrcamento());
            ps.setDouble(2, orcamento.getReserva_imprevistos());
            ps.setDouble(3, orcamento.getOrcamento_investimentos());
            ps.setInt(4, orcamento.getId());

            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

    public boolean excluir(int id) {
        String sql = "DELETE FROM orcamentos WHERE id = ?";
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
