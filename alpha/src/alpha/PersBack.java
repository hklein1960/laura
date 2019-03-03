package alpha;

import java.io.Serializable;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.inject.Produces;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import alpha.PersEntity;



 
@ManagedBean
@SessionScoped

public class PersBack implements Serializable {
 
  
  
 
  private final static Logger LOGGER = Logger.getLogger(PersBack.class.getSimpleName());
  
  @NotNull
  
  private static String nachname="PAPI";
  private String vorname;
  private String plz;
  private String ort;
  private String strasse;
 
  public String getNachname() {
	return "PAPI";
}

public void setNachname(String nachname) {
	this.nachname = nachname;
}

public String getVorname() {
	return vorname;
}

public void setVorname(String vorname) {
	this.vorname = vorname;
}

public String getPlz() {
	return plz;
}

public void setPlz(String plz) {
	this.plz = plz;
}

public String getStrasse() {
	return strasse;
}

public void setStrasse(String strasse) {
	this.strasse = strasse;
}


public PersBack() {
  }
      
   
    
  }

