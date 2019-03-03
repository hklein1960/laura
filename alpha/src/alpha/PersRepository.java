package alpha;

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
  @PersistenceContext(unitName = "alpha")
  
  EntityManager em;
 
  public PersRepository() {
  }
 
}
