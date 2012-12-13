package org.redhat.poc.camel.routes;

import org.apache.camel.builder.RouteBuilder;

public class RoutingToWS extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub

		from("jetty:http://0.0.0.0:9000/camel").to("log:request?showAll=true&multiline=true");
		
	}

	
}
