package br.com.loteria.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.model.User;

@Path("dashboard")
@Controller
public class DashboardController {

	@Get("")
	public void dashboard() {
		
	}
	
	@Post("salvausuario")
	public void saveUser(User user) {
		System.out.print(user.getName());
	}
	
}
