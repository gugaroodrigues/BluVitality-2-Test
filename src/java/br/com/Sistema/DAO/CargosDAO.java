package br.com.Sistema.DAO;

import br.com.Sistema.Bean.CargosBean;
import br.com.Sistema.Database.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static java.sql.Statement.RETURN_GENERATED_KEYS;

/**
 * @author Cidmar
 */
public class CargosDAO {

    public List<CargosBean> obterTodos() {
        List<CargosBean> cargos = new ArrayList<>();
        String sql = "SELECT id, nome, salario, carga_horaria FROM cargos";

        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                CargosBean cargo = new CargosBean();
                cargo.setId(resultSet.getInt("id"));
                cargo.setNome(resultSet.getString("nome"));
                cargo.setSalario(resultSet.getDouble("salario"));
                cargo.setCarga_horaria(resultSet.getDate("carga_horaria"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return cargos;
    }

    public CargosBean obterPeloId(int id) {
        CargosBean cargo = null;
        String sql = "SELECT id, nome, salario, carga_horaria FROM cargos WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                cargo = new CargosBean();
                cargo.setId(resultSet.getInt("id"));
                cargo.setNome(resultSet.getString("nome"));
                cargo.setSalario(resultSet.getDouble("salario"));
                cargo.setCarga_horaria(resultSet.getDate("carga_horaria"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return cargo;
    }

    public int adicionar(CargosBean cargo) {
        String sql = "INSERT INTO cargos (id, nome, salario, carga_horaria) "
                + "VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setString(1, cargo.getNome());
            ps.setDouble(2, cargo.getSalario());
            ps.setDate(3, cargo.getCarga_horaria());

            ps.execute();
            ResultSet resultSet = ps.getGeneratedKeys();
            if (resultSet.last()) {
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return -1;
    }

    public boolean alterar(CargosBean cargo) {
        try {
            String sql = "UPDATE cargos SET nome = ?, salario = ?, carga_horaria = ? WHERE id = ?";
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setString(1, cargo.getNome());
            ps.setDouble(2, cargo.getSalario());
            ps.setDate(3, cargo.getCarga_horaria());
            ps.setInt(4, cargo.getId());

            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

    public boolean apagar(int id) {
        String sql = "DELETE FROM cargos WHERE id = ?";
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
