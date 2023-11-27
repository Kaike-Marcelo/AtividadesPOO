/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package migracao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import conexao.Conexao;

/**
 *
 * @author Kaike Marcelo
 */

public class TabelasDB {

    public static void criarTabelas() {
        criarTabelaPessoa();
    }

    private static void criarTabelaPessoa() {
        criarTabela("pessoa_model", 
                "id INT PRIMARY KEY AUTO_INCREMENT, "
                + "nome VARCHAR(255), "
                + "email VARCHAR(255), "
                + "senha VARCHAR(255)");
    }

    private static void criarTabela(String nomeTabela, String colunas) {
        try {
            
            Connection con = Conexao.getConexao();
            Statement stmt = con.createStatement();

            // SQL para criar a tabela
            String sql = "CREATE TABLE IF NOT EXISTS " + nomeTabela + " (" + colunas + ")";

            // Executa o SQL
            stmt.executeUpdate(sql);

            //System.out.println("Tabela '" + nomeTabela + "' criada com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
