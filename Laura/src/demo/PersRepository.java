package demo;


import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


 
@Stateless
public class PersRepository {
  @PersistenceContext(unitName = "Laura")
  
  EntityManager em;
 
  public PersRepository() {
  }
 
  public void save(PersEntity user) {
    em.persist(user);
    em.flush();
  }
  public List<PersEntity> findAllOrderedByName() {
      CriteriaBuilder cb = em.getCriteriaBuilder();
      CriteriaQuery<PersEntity> criteria = cb.createQuery(PersEntity.class);
      Root<PersEntity> member = criteria.from(PersEntity.class);
      
      criteria.select(member).orderBy(cb.asc(member.get("nachname")));
      return em.createQuery(criteria).getResultList();
  }
  public PersEntity findById(Integer id) {
      return em.find(PersEntity.class, id);
  }
}