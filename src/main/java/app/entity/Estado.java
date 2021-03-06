package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ESTADO
 * @generated
 */
@Entity
@Table(name = "\"ESTADO\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"id" ,"nome" ,"uf" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Estado")
public class Estado implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY, generator="") 
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
  @Column(name = "uf", nullable = true, unique = true, insertable=true, updatable=true)
  
  private java.lang.String uf;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_pais", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Pais pais;

  /**
   * Construtor
   * @generated
   */
  public Estado(){
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
  public Estado setId(java.lang.Integer id){
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
  public Estado setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém uf
   * return uf
   * @generated
   */
  
  public java.lang.String getUf(){
    return this.uf;
  }

  /**
   * Define uf
   * @param uf uf
   * @generated
   */
  public Estado setUf(java.lang.String uf){
    this.uf = uf;
    return this;
  }

  /**
   * Obtém pais
   * return pais
   * @generated
   */
  
  public Pais getPais(){
    return this.pais;
  }

  /**
   * Define pais
   * @param pais pais
   * @generated
   */
  public Estado setPais(Pais pais){
    this.pais = pais;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Estado object = (Estado)obj;
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
