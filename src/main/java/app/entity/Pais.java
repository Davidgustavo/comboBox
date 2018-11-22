package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PAIS
 * @generated
 */
@Entity
@Table(name = "\"PAIS\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"id" ,"nome" ,"sigla" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Pais")
public class Pais implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer id;

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = true, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "sigla", nullable = true, unique = true, insertable=true, updatable=true)
  
  private java.lang.String sigla;

  /**
   * Construtor
   * @generated
   */
  public Pais(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.Integer getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Pais setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Pais setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém sigla
   * return sigla
   * @generated
   */
  
  public java.lang.String getSigla(){
    return this.sigla;
  }

  /**
   * Define sigla
   * @param sigla sigla
   * @generated
   */
  public Pais setSigla(java.lang.String sigla){
    this.sigla = sigla;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pais object = (Pais)obj;
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
