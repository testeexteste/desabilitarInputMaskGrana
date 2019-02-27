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
@Repository("Item_ProdutoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface Item_ProdutoDAO extends JpaRepository<Item_Produto, java.lang.String> {

  /**
   * Obtém a instância de Item_Produto utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Item_Produto entity WHERE entity.id = :id")
  public Item_Produto findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Item_Produto utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Item_Produto entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Produto entity WHERE entity.item_Produto.id = :id")
  public Page<Produto> findProduto(@Param(value="id") java.lang.String id, Pageable pageable);

}
