package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PESSOA
 * @generated
 */
@Entity
@Table(name = "\"PESSOA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Pessoa")
public class Pessoa implements Serializable {

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
  @Column(name = "cargo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cargo;

  /**
  * @generated
  */
  @Column(name = "departamento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String departamento;

  /**
  * @generated
  */
  @Column(name = "status", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String status;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private User user;

  /**
   * Construtor
   * @generated
   */
  public Pessoa(){
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
  public Pessoa setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém cargo
   * return cargo
   * @generated
   */
  
  public java.lang.String getCargo(){
    return this.cargo;
  }

  /**
   * Define cargo
   * @param cargo cargo
   * @generated
   */
  public Pessoa setCargo(java.lang.String cargo){
    this.cargo = cargo;
    return this;
  }

  /**
   * Obtém departamento
   * return departamento
   * @generated
   */
  
  public java.lang.String getDepartamento(){
    return this.departamento;
  }

  /**
   * Define departamento
   * @param departamento departamento
   * @generated
   */
  public Pessoa setDepartamento(java.lang.String departamento){
    this.departamento = departamento;
    return this;
  }

  /**
   * Obtém status
   * return status
   * @generated
   */
  
  public java.lang.String getStatus(){
    return this.status;
  }

  /**
   * Define status
   * @param status status
   * @generated
   */
  public Pessoa setStatus(java.lang.String status){
    this.status = status;
    return this;
  }

  /**
   * Obtém user
   * return user
   * @generated
   */
  
  public User getUser(){
    return this.user;
  }

  /**
   * Define user
   * @param user user
   * @generated
   */
  public Pessoa setUser(User user){
    this.user = user;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pessoa object = (Pessoa)obj;
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
