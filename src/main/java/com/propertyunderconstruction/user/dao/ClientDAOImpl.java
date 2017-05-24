package com.propertyunderconstruction.user.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.propertyunderconstruction.user.model.Client;

@Repository
public class ClientDAOImpl implements ClientDAO {

	public List<Client> getClients() {

		List<Client> clients = new ArrayList<Client>();
		for (int i = 1; i <= 5; i++) {
			Client client = new Client();
			client.setId("id " + i);
			client.setName("Name " + i);
			client.setLastName("LastName " + i);

			clients.add(client);
		}
		return clients;
	}

}
