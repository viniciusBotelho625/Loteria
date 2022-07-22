package br.com.loteria.controller;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.model.User;

@Path("dashboard")
@Controller
public class DashboardController {
	
	@Inject EntityManager em;
	@Inject Result rs;

	@Get("")
	public void dashboard() {
		
	}
	
	@Post("salvausuario")
	public void saveUser(User user) {
		em.persist(user);
		rs.redirectTo(DashboardController.class).dashboard();
		
	}
	
}
