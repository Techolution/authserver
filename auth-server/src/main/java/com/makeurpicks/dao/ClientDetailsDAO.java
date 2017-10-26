package com.makeurpicks.dao;

import org.springframework.stereotype.Repository;

import com.makeurpicks.domain.OAuthClientDetails;

@Repository
public interface ClientDetailsDAO {
//		CrudRepository<OAuthClientDetails, String> {
	public OAuthClientDetails findByClientId(String client_id);
}
