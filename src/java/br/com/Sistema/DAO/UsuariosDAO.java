package br.com.Sistema.DAO;

/**
 * @author Cidimar
 * @author Gustavo Rodrigues (gugaaroodrigues@gmail.com)
 */
import br.com.Sistema.Bean.UsuariosBean;
import br.com.Sistema.Database.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Cidmar
 */
public class UsuariosDAO {

    public List<UsuariosBean> obterTodos() {
        List<UsuariosBean> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";

        try {
            Statement st = Conexao.abrirConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();

            while (resultSet.next()) {
                UsuariosBean usuario = new UsuariosBean();

                usuario.setId(resultSet.getInt("id"));
                usuario.setNome(resultSet.getString("nome"));
                usuario.setEstado_civil(resultSet.getString("estado_civil"));
                usuario.setIdade(resultSet.getByte("idade"));
                usuario.setSexo(resultSet.getString("sexo").charAt(0));
                usuario.setLogin(resultSet.getString("login"));
                usuario.setSenha(resultSet.getString("senha"));
                usuario.setCpf(resultSet.getString("cpf"));
                usuario.setRg(resultSet.getString("rg"));
                usuario.setTelefone(resultSet.getString("telefone"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setEndereco(resultSet.getString("endereco"));
                usuario.setComplemento(resultSet.getString("complemento"));
                usuario.setUf(resultSet.getString("uf"));
                usuario.setCidade(resultSet.getString("cidade"));
                usuario.setNaturalidade(resultSet.getString("naturalidade"));
                usuario.setData_nascimento(resultSet.getDate("data_nascimento"));
                usuario.setNome_fic(resultSet.getString("nome_fic"));
                usuario.setTipo_sanguineo(resultSet.getString("tipo_sanguineo"));
                usuario.setContato_emergencia(resultSet.getString("contato_emergencia"));
                usuario.setConvenio(resultSet.getString("convenio"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.abrirConexao();
        }

        return usuarios;
    }

    public int adicionar(UsuariosBean usuario) {
        String sql = "INSERT INTO usuarios(nome, estado_civil, idade, sexo, login, senha, "
                + "cpf, rg, telefone, email, endereco, complemento, uf, cidade, naturalidade, data_nascimento, nome_fic, tipo_sanguineo, contato_emergencia, convenio)"
                + "\nVALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?)";

        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            int quantidade = 1;
            ps.setString(quantidade++, usuario.getNome());
            ps.setString(quantidade++, usuario.getEstado_civil());
            ps.setByte(quantidade++, usuario.getIdade());
            ps.setString(quantidade++, String.valueOf(usuario.getSexo()));
            ps.setString(quantidade++, usuario.getLogin());
            ps.setString(quantidade++, usuario.getSenha());
            ps.setString(quantidade++, usuario.getCpf());
            ps.setString(quantidade++, usuario.getRg());
            ps.setString(quantidade++, usuario.getTelefone());
            ps.setString(quantidade++, usuario.getEmail());
            ps.setString(quantidade++, usuario.getEndereco());
            ps.setString(quantidade++, usuario.getComplemento());
            ps.setString(quantidade++, usuario.getUf());
            ps.setString(quantidade++, usuario.getCidade());
            ps.setString(quantidade++, usuario.getNaturalidade());
            ps.setDate(quantidade++, usuario.getData_nascimento());
            ps.setString(quantidade++, usuario.getNome_fic());
            ps.setString(quantidade++, usuario.getTipo_sanguineo());
            ps.setString(quantidade++, usuario.getContato_emergencia());
            ps.setString(quantidade++, usuario.getConvenio());
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

    public boolean excluir(int id) {
        String sql = "DELETE FROM usuarios WHERE id =?";
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

    public boolean alterar(UsuariosBean usuario) {
        String sql = "UPDATE usuarios SET nome = ?, estado_civil = ?, idade = ?, "
                + "sexo = ?, login = ?, senha = ?, cpf = ?, rg = ?, telefone = ?, "
                + "email = ?, endereco = ?, complemento = ?, uf = ?, cidade = ?, naturalidade = ?, data_nascimento = ?, nome_fic = ?, tipo_sanguineo = ?, contato_emergencia = ?, convenio = ? WHERE id = ?";

        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            int quantidade = 1;

            ps.setString(quantidade++, usuario.getNome());
            ps.setString(quantidade++, usuario.getEstado_civil());
            ps.setByte(quantidade++, (byte) usuario.getIdade());
            ps.setString(quantidade++, String.valueOf(usuario.getSexo()));
            ps.setString(quantidade++, usuario.getLogin());
            ps.setString(quantidade++, usuario.getSenha());
            ps.setString(quantidade++, usuario.getCpf());
            ps.setString(quantidade++, usuario.getRg());
            ps.setString(quantidade++, usuario.getTelefone());
            ps.setString(quantidade++, usuario.getEmail());
            ps.setString(quantidade++, usuario.getEndereco());
            ps.setString(quantidade++, usuario.getComplemento());
            ps.setString(quantidade++, usuario.getUf());
            ps.setString(quantidade++, usuario.getCidade());
            ps.setString(quantidade++, usuario.getNaturalidade());
            ps.setDate(quantidade++, usuario.getData_nascimento());
            ps.setString(quantidade++, usuario.getNome_fic());
            ps.setString(quantidade++, usuario.getTipo_sanguineo());
            ps.setString(quantidade++, usuario.getContato_emergencia());
            ps.setString(quantidade++, usuario.getConvenio());
            ps.setInt(quantidade++, usuario.getId());

            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.abrirConexao();
        }
        return false;
    }

    public UsuariosBean obterPeloId(int id) {
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            if (resultSet.next()) {
                UsuariosBean usuario = new UsuariosBean();

                usuario.setId(resultSet.getInt("id"));
                usuario.setNome(resultSet.getString("nome"));
                usuario.setEstado_civil(resultSet.getString("estado_civil"));
                usuario.setIdade(resultSet.getByte("idade"));
                usuario.setSexo(resultSet.getString("sexo").charAt(0));
                usuario.setLogin(resultSet.getString("login"));
                usuario.setSenha(resultSet.getString("senha"));
                usuario.setCpf(resultSet.getString("cpf"));
                usuario.setRg(resultSet.getString("rg"));
                usuario.setTelefone(resultSet.getString("telefone"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setEndereco(resultSet.getString("endereco"));
                usuario.setComplemento(resultSet.getString("complemento"));
                usuario.setUf(resultSet.getString("uf"));
                usuario.setCidade(resultSet.getString("cidade"));
                usuario.setNaturalidade(resultSet.getString("naturalidade"));
                usuario.setData_nascimento(resultSet.getDate("data_nascimento"));
                usuario.setNome_fic(resultSet.getString("nome_fic"));
                usuario.setTipo_sanguineo(resultSet.getString("tipo_sanguineo"));
                usuario.setContato_emergencia(resultSet.getString("contato_emergencia"));
                usuario.setConvenio(resultSet.getString("convenio"));
                return usuario;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.abrirConexao();
        }
        return null;
    }
    
    public UsuariosBean autenticar(String login, String senha) {
        String sql = "SELECT * FROM usuarios WHERE login = ? AND senha = ?";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            if (resultSet.next()) {
                UsuariosBean usuario = new UsuariosBean();
                usuario.setId(resultSet.getInt("id"));
                usuario.setNome(resultSet.getString("nome"));
                usuario.setEstado_civil(resultSet.getString("estado_civil"));
                usuario.setIdade(resultSet.getByte("idade"));
                usuario.setSexo(resultSet.getString("sexo").charAt(0));
                usuario.setLogin(resultSet.getString("login"));
                usuario.setSenha(resultSet.getString("senha"));
                usuario.setCpf(resultSet.getString("cpf"));
                usuario.setRg(resultSet.getString("rg"));
                usuario.setTelefone(resultSet.getString("telefone"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setEndereco(resultSet.getString("endereco"));
                usuario.setComplemento(resultSet.getString("complemento"));
                usuario.setUf(resultSet.getString("uf"));
                usuario.setCidade(resultSet.getString("cidade"));
                usuario.setNaturalidade(resultSet.getString("naturalidade"));
                usuario.setData_nascimento(resultSet.getDate("data_nascimento"));
                usuario.setNome_fic(resultSet.getString("nome_fic"));
                usuario.setTipo_sanguineo(resultSet.getString("tipo_sanguineo"));
                usuario.setContato_emergencia(resultSet.getString("contato_emergencia"));
                usuario.setConvenio(resultSet.getString("convenio"));
                return usuario;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.abrirConexao();
        }
        return null;
    }

    int obterTodos(UsuariosBean usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
