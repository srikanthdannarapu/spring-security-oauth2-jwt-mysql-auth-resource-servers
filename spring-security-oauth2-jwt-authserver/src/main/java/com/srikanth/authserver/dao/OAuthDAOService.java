package com.srikanth.authserver.dao;


import com.srikanth.authserver.model.UserEntity;

public interface OAuthDAOService {

	public UserEntity getUserDetails(String emailId);
}
