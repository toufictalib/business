package com.propertyunderconstruction.user.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.propertyunderconstruction.user.dao.ClientDAO;
import com.propertyunderconstruction.user.model.Client;
import com.propertyunderconstruction.user.service.ClientInterface;

@Service
public class ClientImpl implements ClientInterface {

	@Autowired
	private ClientDAO clientDAO;
	
	public List<Client> getClients() {
		return clientDAO.getClients();
	}

}
