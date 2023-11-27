/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.model.dao;

import com.ifba.model.entity.PessoaModel;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Kaike Marcelo
 */

public class PessoaDAO {
    public void incluir(PessoaModel pessoaM) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO PESSOA_MODEL (nome, email, senha) VALUES (?,?,?)");
           
            stmt.setString(1, pessoaM.getNome());
            stmt.setString(2, pessoaM.getEmail());
            stmt.setString(3, pessoaM.getSenha());

            stmt.executeUpdate();
            
            System.out.println("Pessoa com o código " + pessoaM.getId() + " inserido com sucesso!");

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Erro ao inserir informação no banco de dados");
        
        } finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    
    public void alterar(PessoaModel pessoaM) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE PESSOA_MODEL SET nome = ?, email = ? where id = ? ");
           
            stmt.setString(1, pessoaM.getNome());
            stmt.setString(2, pessoaM.getEmail());
            stmt.setInt(3, pessoaM.getId());
            
            stmt.executeUpdate();
            
            System.out.println("Pessoa com o código " + pessoaM.getId()+ " alterado com sucesso");


        } catch (SQLException ex) {
            ex.printStackTrace();

             throw new RuntimeException("Erro ao atualizar a informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    
    
    
    public void excluir(PessoaModel pessoaM) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE from PESSOA_MODEL WHERE id = ?");
           
            stmt.setInt(1, pessoaM.getId());
            
            
            stmt.executeUpdate();
            
            System.out.println("Pessoa com o código " + pessoaM.getId()+ " excluído com sucesso");


        } catch (SQLException ex) {
            ex.printStackTrace();

            throw new RuntimeException("Erro ao excluir a informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    
    
    public List<PessoaModel> consulta(List<PessoaModel> listaPessoas) {
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        try {
            stmt = con.prepareStatement("SELECT id, nome, email FROM PESSOA_MODEL");
            rs = stmt.executeQuery();

            while (rs.next()) {
                PessoaModel pessoa = new PessoaModel();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setEmail(rs.getString("email"));
                listaPessoas.add(pessoa);
            }

        } catch (SQLException s) {
            s.printStackTrace();
            
        } finally {
            Conexao.fecharConexao(con, stmt, rs);
        }

        return listaPessoas;
    }

}
