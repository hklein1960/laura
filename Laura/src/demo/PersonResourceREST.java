package demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import javax.validation.Validator;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import demo.PersRepository;
import demo.PersEntity;




@Path("/person")
@RequestScoped
public class PersonResourceREST {
	

	@Inject
    private PersBack persback;

    @Inject
    private PersRepository persrepository;

    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<PersEntity> listAllMembers() {
        return persrepository.findAllOrderedByName();
    }

    @GET
    @Path("/{id:[0-9][0-9]*}")
    @Produces(MediaType.APPLICATION_JSON)
    public PersEntity lookupMemberById(@PathParam("id") Integer id) {
        PersEntity person = persrepository.findById(id);
        if (person == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return person;
    }

    
    

    
}
