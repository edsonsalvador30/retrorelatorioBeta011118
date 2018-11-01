package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CLIENTE
 * @generated
 */
@Entity
@Table(name = "\"CLIENTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Cliente")
public class Cliente implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "NomeCliente", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nomeCliente;

  /**
  * @generated
  */
  @Column(name = "Mes", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.Integer mes;

  /**
  * @generated
  */
  @Column(name = "Ano", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer ano;

  /**
  * @generated
  */
  @Column(name = "Ativo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean ativo;

  /**
   * Construtor
   * @generated
   */
  public Cliente(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Cliente setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nomeCliente
   * return nomeCliente
   * @generated
   */
  
  public java.lang.String getNomeCliente(){
    return this.nomeCliente;
  }

  /**
   * Define nomeCliente
   * @param nomeCliente nomeCliente
   * @generated
   */
  public Cliente setNomeCliente(java.lang.String nomeCliente){
    this.nomeCliente = nomeCliente;
    return this;
  }

  /**
   * Obtém mes
   * return mes
   * @generated
   */
  
  public java.lang.Integer getMes(){
    return this.mes;
  }

  /**
   * Define mes
   * @param mes mes
   * @generated
   */
  public Cliente setMes(java.lang.Integer mes){
    this.mes = mes;
    return this;
  }

  /**
   * Obtém ano
   * return ano
   * @generated
   */
  
  public java.lang.Integer getAno(){
    return this.ano;
  }

  /**
   * Define ano
   * @param ano ano
   * @generated
   */
  public Cliente setAno(java.lang.Integer ano){
    this.ano = ano;
    return this;
  }

  /**
   * Obtém ativo
   * return ativo
   * @generated
   */
  
  public java.lang.Boolean getAtivo(){
    return this.ativo;
  }

  /**
   * Define ativo
   * @param ativo ativo
   * @generated
   */
  public Cliente setAtivo(java.lang.Boolean ativo){
    this.ativo = ativo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Cliente object = (Cliente)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
