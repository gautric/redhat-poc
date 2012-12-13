package org.redhat.poc.camel.routes;

import org.apache.camel.builder.RouteBuilder;

public class RoutingToWS extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub

		from("jetty:http://0.0.0.0:9000/camel").to("log:request?showAll=true&multiline=true")
		.choice()
			.when(xpath("//*[local-name() = 'register']")).log("SOAP Service is invoked").to("cxf://http://localhost:8080/backend-ws/Administration?dataFormat=MESSAGE")
			.otherwise().log("B was invoked");
		
	}

	
}
