package com.ista.springboot.app.models.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.app.models.entity.Cliente;

@Repository
public class ClienteDaoImp implements IClienteDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<Cliente> findAll() {
		return em.createQuery("from Cliente").getResultList();
	}

	@Transactional
	@Override
	public void save(Cliente cliente) {
		if(cliente.getId()!=null && cliente.getId()>0) {
			em.merge(cliente);
		}else {
			em.persist(cliente);
		}
		
	}

	@Override
	public Cliente findOne(Long id) {
		
		return em.find(Cliente.class, id);
	}

	@Override
	public void delete(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

}
