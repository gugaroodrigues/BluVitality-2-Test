package br.com.Sistema.DAO;

import br.com.Sistema.Bean.ReceitaBean;
import br.com.Sistema.Database.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Cidmar
 */
public class ReceitaDAO {
    public List<ReceitaBean> obterTodos() {
        List<ReceitaBean> receitas = new ArrayList<>();
        String sql = "SELECT * FROM receitas";
        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();

            while (resultSet.next()) {
                ReceitaBean receita = new ReceitaBean();
                receita.setId(resultSet.getInt("id"));
                receita.setClientes_particulares(resultSet.getDouble("clientes_particulares"));
                receita.setConvenio_sus(resultSet.getDouble("convenio_sus"));
                receita.setOutros_convenios(resultSet.getDouble("outros_convenios"));
                receita.setServicos_a_faturar(resultSet.getDouble("servicos_a_faturar"));
                receita.setDiversos(resultSet.getDouble("diversos"));
                receita.setAdiantamentos_a_terceiros(resultSet.getDouble("adiantamentos_a_terceiros"));
                receita.setArrecadacoes(resultSet.getDouble("arrecadacoes"));
                receita.setBens_e_titulos_a_receber(resultSet.getDouble("bens_e_titulos_a_receber"));
                receita.setTotal(resultSet.getDouble("total"));
                receitas.add(receita);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return receitas;
    }

    public ReceitaBean obterPeloId(int id) {
        ReceitaBean receita = null;
        String sql = "SELECT clientes_particulares, convenio_sus, outros_convenios, servicos_a_faturar, diversos, adiantamentos_a_terceiros, arrecadacoes, bens_e_titulos_a_receber, total FROM receitas WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.getResultSet();

            while (resultSet.next()) {
                receita = new ReceitaBean();
                receita.setId(resultSet.getInt("id"));
                receita.setClientes_particulares(resultSet.getDouble("clientes_particulares"));
                receita.setConvenio_sus(resultSet.getDouble("convenio_sus"));
                receita.setOutros_convenios(resultSet.getDouble("outros_convenios"));
                receita.setServicos_a_faturar(resultSet.getDouble("servicos_a_faturar"));
                receita.setDiversos(resultSet.getDouble("diversos"));
                receita.setAdiantamentos_a_terceiros(resultSet.getDouble("adiantamentos_a_terceiros"));
                receita.setArrecadacoes(resultSet.getDouble("arrecadacoes"));
                receita.setBens_e_titulos_a_receber(resultSet.getDouble("bens_e_titulos_a_receber"));
                receita.setTotal(resultSet.getDouble("total"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return receita;
    }

    public int adicionar(ReceitaBean receita) {
        String sql = "INSERT INTO receita(clientes_particulares, convenio_sus, outros_convenios, servicos_a_faturar, diversos, adiantamentos_a_terceiros, arrecadacoes, bens_e_titulos_a_receber, total) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setDouble(1, receita.getClientes_particulares());
            ps.setDouble(2, receita.getConvenio_sus());
            ps.setDouble(3, receita.getOutros_convenios());
            ps.setDouble(4, receita.getServicos_a_faturar());
            ps.setDouble(5, receita.getDiversos());
            ps.setDouble(6, receita.getAdiantamentos_a_terceiros());
            ps.setDouble(7, receita.getArrecadacoes());
            ps.setDouble(8, receita.getBens_e_titulos_a_receber());
            ps.setDouble(9, receita.getTotal());
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

    public boolean alterar(ReceitaBean receita) {
        try {
            String sql = "UPDATE receita SET energia_eletrica = ?, agua = ?, gas = ?, telefone_e_internet = ?, aluguel = ?, fornecedores = ?, total = ? WHERE id = ?";
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setDouble(1, receita.getClientes_particulares());
            ps.setDouble(2, receita.getConvenio_sus());
            ps.setDouble(3, receita.getOutros_convenios());
            ps.setDouble(4, receita.getServicos_a_faturar());
            ps.setDouble(5, receita.getDiversos());
            ps.setDouble(6, receita.getAdiantamentos_a_terceiros());
            ps.setDouble(7, receita.getArrecadacoes());
            ps.setDouble(8, receita.getBens_e_titulos_a_receber());
            ps.setDouble(9, receita.getTotal());
            ps.setInt(10, receita.getId());

            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

    public boolean excluir(int id) {
        String sql = "DELETE FROM receitas WHERE id = ?";
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
