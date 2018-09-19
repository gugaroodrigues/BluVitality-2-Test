package br.com.Sistema.DAO;

import br.com.Sistema.Bean.CustosBean;
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
public class CustosDAO {
    public List<CustosBean> obterTodos() {
        List<CustosBean> custos = new ArrayList<>();
        String sql = "SELECT * FROM custos";
        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();

            while (resultSet.next()) {
                CustosBean custo = new CustosBean();
                custo.setId(resultSet.getInt("id"));
                custo.setId_gastoFuncionario(resultSet.getInt("id_gastoFuncionario"));
                custo.setId_conta(resultSet.getInt("id_conta"));
                custo.setId_gastoGeral(resultSet.getInt("id_gastoGeral"));
                custo.setId_investimento(resultSet.getInt("id_investimento"));
                custo.setTotal(resultSet.getDouble("total"));
                custos.add(custo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return custos;
    }

    public CustosBean obterPeloId(int id) {
        CustosBean custo = null;
        String sql = "SELECT id, id_gastoFuncionario, id_conta, id_gastoGeral, id_investimento, total FROM custos WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.getResultSet();

            while (resultSet.next()) {
                custo = new CustosBean();
                custo.setId(resultSet.getInt("id"));
                custo.setId_gastoFuncionario(resultSet.getInt("id_gastoFuncionario"));
                custo.setId_conta(resultSet.getInt("id_conta"));
                custo.setId_gastoGeral(resultSet.getInt("id_gastoGeral"));
                custo.setId_investimento(resultSet.getInt("id_investimento"));
                custo.setTotal(resultSet.getDouble("total"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return custo;
    }

    public int adicionar(CustosBean custo) {
        String sql = "INSERT INTO custo(id_gastoFuncionario, id_conta, id_gastoGeral, id_investimento, total) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setDouble(1, custo.getId_gastoFuncionario());
            ps.setDouble(2, custo.getId_conta());
            ps.setDouble(3, custo.getId_gastoGeral());
            ps.setDouble(4, custo.getId_investimento());
            ps.setDouble(5, custo.getTotal());
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

    public boolean alterar(CustosBean custo) {
        try {
            String sql = "UPDATE custo SET id_gastoFuncionario = ?, id_conta = ?, id_gastoGeral = ?, id_investimento = ?, total = ? WHERE id = ?";
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setDouble(1, custo.getId_gastoFuncionario());
            ps.setDouble(2, custo.getId_conta());
            ps.setDouble(3, custo.getId_gastoGeral());
            ps.setDouble(4, custo.getId_investimento());
            ps.setDouble(5, custo.getTotal());
            ps.setInt(6, custo.getId());

            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

    public boolean excluir(int id) {
        String sql = "DELETE FROM custos WHERE id = ?";
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
