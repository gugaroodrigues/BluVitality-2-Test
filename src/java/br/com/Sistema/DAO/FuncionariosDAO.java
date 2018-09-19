package br.com.Sistema.DAO;

import br.com.Sistema.Bean.CargosBean;
import br.com.Sistema.Bean.FuncionariosBean;
import br.com.Sistema.Bean.UsuariosBean;
import br.com.Sistema.Database.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Cidmar
 * @author Gustavo Rodrigues (gugaaroodrigues@gmail.com)
 */
public class FuncionariosDAO {

    public List<FuncionariosBean> obterTodos() {
        List<FuncionariosBean> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionarios fn JOIN cargos cr ON cr.id = fn.id_cargo JOIN usuarios us ON us.id = fn.id_usuario";
        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();

            while (resultSet.next()) {
                FuncionariosBean funcionario = new FuncionariosBean();
                funcionario.setId(resultSet.getInt("fn.id"));
                funcionario.setId_cargo(resultSet.getInt("fn.id_cargo"));
                funcionario.setId_usuario(resultSet.getInt("fn.id_usuario"));
                funcionario.setTipo(resultSet.getString("fn.tipo"));

                UsuariosBean usuario = new UsuariosDAO().obterPeloId(Integer.parseInt("us.id"));
                funcionario.setUsuario(usuario);

                CargosBean cargo = new CargosDAO().obterPeloId(Integer.parseInt("cr.id"));
                funcionario.setCargo(cargo);

                funcionarios.add(funcionario);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return funcionarios;
    }

    public List<FuncionariosBean> obterCargos() {
        List<FuncionariosBean> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionarios fn JOIN cargos cr ON cr.id = fn.id_cargo JOIN usuarios us ON us.id = fn.id_usuario";
        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();

            while (resultSet.next()) {
                FuncionariosBean funcionario = new FuncionariosBean();
                funcionario.setId(resultSet.getInt("fn.id"));
                funcionario.setId_cargo(resultSet.getInt("fn.id_cargo"));
                funcionario.setId_usuario(resultSet.getInt("fn.id_usuario"));
                funcionario.setTipo(resultSet.getString("fn.tipo"));
                funcionario.setAtivo(resultSet.getBoolean("fn.ativo"));

                CargosBean cargo = new CargosBean();
                cargo.setNome(resultSet.getString("cr.nome"));
                funcionario.setCargo(cargo);

                funcionarios.add(funcionario);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return funcionarios;
    }

    public FuncionariosBean obterPeloId(int id) {
        FuncionariosBean funcionario = null;
        String sql = "SELECT * FROM funcionarios fn JOIN cargos cr ON cr.id = fn.id_cargo JOIN usuarios us ON us.id = fn.id_usuario WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                funcionario = new FuncionariosBean();
                funcionario.setId(resultSet.getInt("fn.id"));
                funcionario.setId_cargo(resultSet.getInt("fn.id_cargo"));
                funcionario.setId_usuario(resultSet.getInt("fn.id_usuario"));
                funcionario.setTipo(resultSet.getString("fn.tipo"));
                funcionario.setAtivo(resultSet.getBoolean("fn.ativo"));

                UsuariosBean usuario = new UsuariosDAO().obterPeloId(id);
                funcionario.setUsuario(usuario);

                CargosBean cargo = new CargosDAO().obterPeloId(resultSet.getInt("id_cargo"));
                funcionario.setCargo(cargo);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }return funcionario;
    }
    
    public FuncionariosBean obterPeloIdUsuario(int id){
        FuncionariosBean funcionario = null;
        String sql = "SELECT * FROM funcionarios WHERE id_usuario = ?";
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while(resultSet.next()){
                funcionario = new FuncionariosBean();
                funcionario.setId(resultSet.getInt("id"));
                funcionario.setId_cargo(resultSet.getInt("id_cargo"));
                funcionario.setId_usuario(resultSet.getInt("id_usuario"));
                funcionario.setTipo(resultSet.getString("tipo"));
                funcionario.setAtivo(resultSet.getBoolean("ativo"));

                UsuariosBean usuario = new UsuariosDAO().obterPeloId(id);
                funcionario.setUsuario(usuario);

                CargosBean cargo = new CargosDAO().obterPeloId(resultSet.getInt("id_cargo"));
                funcionario.setCargo(cargo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return funcionario;
    }

    public int adicionar(FuncionariosBean funcionario) {
        String sql = "INSERT INTO funcionarios(id_cargo, id_usuario, tipo, ativo) VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setInt(1, funcionario.getId_cargo());
            ps.setInt(2, funcionario.getId_usuario());
            ps.setString(3, funcionario.getTipo());
            ps.setBoolean(4, funcionario.isAtivo());
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

    public boolean alterar(FuncionariosBean funcionario) {
        try {
            String sql = "UPDATE funcionarios SET id_cargo = ?, id_usuario = ?, tipo = ?, ativo = ? WHERE id = ?";
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, funcionario.getId_cargo());
            ps.setInt(2, funcionario.getId_usuario());
            ps.setString(3, funcionario.getTipo());
            ps.setBoolean(4, funcionario.isAtivo());
            ps.setInt(5, funcionario.getId());

            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

    public boolean apagar(int id) {
        String sql = "DELETE FROM funcionarios WHERE id = ?";
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

    public List<HashMap<String, Object>> obterTodosParaDataTable() {
        List<HashMap<String, Object>> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionarios fn "
                + "\nJOIN cargos cr ON cr.id = fn.id_cargo "
                + "\nJOIN usuarios us ON us.id = fn.id_usuario";
        
        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            
            while (resultSet.next()) {
                
                HashMap<String, Object> funcionario = new HashMap<>();
                funcionario.put("id", resultSet.getInt("fn.id"));
                funcionario.put("cargo", resultSet.getString("cr.nome"));
                funcionario.put("id_usuario", resultSet.getInt("fn.id_usuario"));
                funcionario.put("tipo",resultSet.getString("fn.tipo"));
                funcionario.put("ativo",resultSet.getBoolean("fn.ativo"));
                //HashMap<String, Object> cargo = new HashMap<>();
                //cargo.put("cr.nome", resultSet.getString("cr.nome"));
                
                
                //funcionario.putAll(cargo);
                funcionarios.add(funcionario);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }return funcionarios;
    }
}
