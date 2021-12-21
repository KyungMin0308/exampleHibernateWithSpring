package com.kyungmin.exampleHibernateWithSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyungmin.exampleHibernateWithSpring.dao.OfferDao;
import com.kyungmin.exampleHibernateWithSpring.model.Offer;

@Service
public class OfferService {
	
	@Autowired
	private OfferDao offerDao;
	
	//전체 offer 조회
	public List<Offer> getCurrent() {
		return offerDao.getAllOffer();
	}
	
	//새로운 offer 추가
	public void insert(Offer offer) {
		offerDao.insert(offer);
	}

}
