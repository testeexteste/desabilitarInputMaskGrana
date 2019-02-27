package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PRODUTO
 * @generated
 */
@Entity
@Table(name = "\"PRODUTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Produto")
public class Produto implements Serializable {

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
  @Column(name = "nome", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "fornecedor", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String fornecedor;

  /**
  * @generated
  */
  @Column(name = "fabricanrte", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String fabricanrte;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_item_Produto", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Item_Produto item_Produto;

  /**
   * Construtor
   * @generated
   */
  public Produto(){
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
  public Produto setId(java.lang.String id){
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
  public Produto setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém fornecedor
   * return fornecedor
   * @generated
   */
  
  public java.lang.String getFornecedor(){
    return this.fornecedor;
  }

  /**
   * Define fornecedor
   * @param fornecedor fornecedor
   * @generated
   */
  public Produto setFornecedor(java.lang.String fornecedor){
    this.fornecedor = fornecedor;
    return this;
  }

  /**
   * Obtém fabricanrte
   * return fabricanrte
   * @generated
   */
  
  public java.lang.String getFabricanrte(){
    return this.fabricanrte;
  }

  /**
   * Define fabricanrte
   * @param fabricanrte fabricanrte
   * @generated
   */
  public Produto setFabricanrte(java.lang.String fabricanrte){
    this.fabricanrte = fabricanrte;
    return this;
  }

  /**
   * Obtém item_Produto
   * return item_Produto
   * @generated
   */
  
  public Item_Produto getItem_Produto(){
    return this.item_Produto;
  }

  /**
   * Define item_Produto
   * @param item_Produto item_Produto
   * @generated
   */
  public Produto setItem_Produto(Item_Produto item_Produto){
    this.item_Produto = item_Produto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Produto object = (Produto)obj;
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
