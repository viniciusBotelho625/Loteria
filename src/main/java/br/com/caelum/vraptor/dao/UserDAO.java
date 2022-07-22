package br.com.caelum.vraptor.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.User;

@RequestScoped
public class UserDAO extends DAO<User>{

	@Inject
	public UserDAO(EntityManager em) {
		super(em, User.class);
	}
	
	@Deprecated
	public UserDAO() {
		this(null);
	}

}
