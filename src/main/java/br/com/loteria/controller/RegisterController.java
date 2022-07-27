package br.com.loteria.controller;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.UserDAO;
import br.com.caelum.vraptor.model.User;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;

@Path("register")
@Controller
public class RegisterController {
	
	@Inject EntityManager em;
	@Inject Result rs;
	@Inject UserDAO userDao;
	@Inject Validator validator;
	
	@Get("")
	public void register() {
		
	}
	
	@Post("salvausuario")
	public void saveUser(@Valid User user, String confirmPassword) {
		boolean asPassword = confirmPassword.equals(user.getPassword());
		validator.addIf(!asPassword, new SimpleMessage("confirmPassword", "A confirmação está diferente da senha"));
		validator.onErrorRedirectTo(this).register();
		userDao.insertOrUpdate(user);
		rs.redirectTo(DashboardController.class).dashboard();
		
	}
}
