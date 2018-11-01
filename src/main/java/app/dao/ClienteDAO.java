package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("ClienteDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ClienteDAO extends JpaRepository<Cliente, java.lang.String> {

  /**
   * Obtém a instância de Cliente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Cliente entity WHERE entity.id = :id")
  public Cliente findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Cliente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Cliente entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



    
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Cliente entity WHERE :search = :search")
  public Page<Cliente> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Cliente entity WHERE (:mes is null OR entity.mes = :mes) AND (:ano is null OR entity.ano = :ano) AND (:ativo is null OR entity.ativo = :ativo)")
  public Page<Cliente> specificSearch(@Param(value="mes") java.lang.Integer mes, @Param(value="ano") java.lang.Integer ano, @Param(value="ativo") java.lang.Boolean ativo, Pageable pageable);
  
}
