package com.kyungmin.exampleHibernateWithSpring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kyungmin.exampleHibernateWithSpring.model.Offer;

@Repository
@Transactional
public class OfferDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	//Read(id와 일치하는 offer 조회)
	public Offer getOfferById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Offer offer = (Offer) session.get(Offer.class, id);
		
		return offer;
	}
	
	//Read(전체 offer 조회)
	public List<Offer> getAllOffer() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Offer";
		
		Query<Offer> query = session.createQuery(hql, Offer.class);
		List<Offer> offers = query.getResultList();
		
		return offers;
	}
	
	//Create(새로운 offer 생성)
	public void insert(Offer offer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(offer);
		session.flush(); //넣지 않아도 commit시에 flush됨
	}
	
	//Update(offer 업데이트)
	public void update(Offer offer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(offer);
		session.flush(); //넣지 않아도 commit시에 flush됨
	}
	
	//Delete(offer 삭제)
	public void delete(Offer offer) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(offer);
		session.flush(); //넣지 않아도 commit시에 flush됨
	}
}
