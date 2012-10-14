package com.springinpractice.ch13.helpdesk.integration.gateway;

import java.util.Collection;

import com.springinpractice.ch13.helpdesk.integration.resource.CustomerResource;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public interface PortalGateway {
	
	CustomerResource findCustomerByUsername(String username);
	
	Collection<CustomerResource> findCustomersByUsernameIn(Collection<String> usernames);
}
