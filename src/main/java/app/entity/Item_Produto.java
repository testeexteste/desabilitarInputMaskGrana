package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ITEM_PRODUTO
 * @generated
 */
@Entity
@Table(name = "\"ITEM_PRODUTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Item_Produto")
public class Item_Produto implements Serializable {

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
  @Column(name = "cod_produto", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cod_produto;

  /**
   * Construtor
   * @generated
   */
  public Item_Produto(){
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
  public Item_Produto setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém cod_produto
   * return cod_produto
   * @generated
   */
  
  public java.lang.String getCod_produto(){
    return this.cod_produto;
  }

  /**
   * Define cod_produto
   * @param cod_produto cod_produto
   * @generated
   */
  public Item_Produto setCod_produto(java.lang.String cod_produto){
    this.cod_produto = cod_produto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Item_Produto object = (Item_Produto)obj;
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
