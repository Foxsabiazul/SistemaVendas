/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.ferramentas.BancoDeDadosMySql;
import java.util.Set;

/**
 *
 * @author rosa.3950
 */
public class DaoCidade extends BancoDeDadosMySql{
  private String sql;
  
  public Boolean inserir(int id, int idEstado, String descricao){
      try{
          sql = "INSERIR INTO CIDADE (ID, ID_ESTADO, NOME) VALUES (?,?,?)";
          
          setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, idEstado);
            getStatement().setString(3, descricao);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
        
            return false;
        }
    }
}
    
    
 
