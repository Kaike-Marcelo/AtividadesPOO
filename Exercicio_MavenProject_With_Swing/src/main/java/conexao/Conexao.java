package conexao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author cleberlira
 */
public class Conexao {

    private static final String DRIVE_MYSQL = "com.mysql.cj.jdbc.Driver";
    private static String ENDERECO;
    private static String USUARIO;
    private static String SENHA;
    
    static {
        carregarConfiguracoes();
    }
    
    private static void carregarConfiguracoes() {
        try (InputStream input = Conexao.class.getClassLoader().getResourceAsStream("config.properties")) 
        {
            Properties propriedades = new Properties();
            propriedades.load(input);

            ENDERECO = propriedades.getProperty("database.url");
            USUARIO = propriedades.getProperty("database.user");
            SENHA = propriedades.getProperty("database.password");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao carregar configurações do banco de dados");
        }
    }
    
    public static Connection getConexao() {

        try {
            Class.forName(DRIVE_MYSQL);
            Connection conn
                    = DriverManager.getConnection(ENDERECO, USUARIO, SENHA);
            return conn;

        } catch (ClassNotFoundException | SQLException ex) {
           
            throw new RuntimeException("Erro ao estabelecer uma conexao com o banco");
        }
    }
    
    public static void fecharConexao(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar uma conexao com o banco");
        }

    }

    public static void fecharConexao(Connection con, PreparedStatement stmt) {
        fecharConexao(con);

        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar uma conexao com o banco");
        }

    }

    public static void fecharConexao(Connection con, PreparedStatement stmt, ResultSet rs) {
        fecharConexao(con, stmt);

        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar uma conexao com o banco");
        }
    }
}
