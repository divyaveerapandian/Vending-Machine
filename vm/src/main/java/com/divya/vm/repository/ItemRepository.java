package com.divya.vm.repository;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.divya.vm.entity.Item;
@Repository
public class ItemRepository {
	@Autowired
	private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	public List<Item> getAll() {
		return sessionFactory.getCurrentSession().createCriteria(Item.class).list();
	}
	
	public int add(Item item) {
		return (Integer) sessionFactory.getCurrentSession().save(item);
	}

	public void update(Item item) {
		sessionFactory.getCurrentSession().update(item);;
	}

	public void delete(Item item) {
		sessionFactory.getCurrentSession().delete(item);
	}
}
