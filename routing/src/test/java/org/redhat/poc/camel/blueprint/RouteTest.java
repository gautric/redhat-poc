package org.redhat.poc.camel.blueprint;

import org.apache.camel.Endpoint;
import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.apache.camel.test.junit4.CamelTestSupport;

import org.junit.Test;
import org.redhat.poc.camel.routes.RoutingToWS;

public class RouteTest extends CamelTestSupport {
	
   
	@Produce(uri = "jetty:http://0.0.0.0:9000/camel/test")
    ProducerTemplate jettyEndpoint;
	
	

    @Override
	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RoutingToWS();
	}



	@Test
    public void testRoute() throws Exception {
    	jettyEndpoint.sendBodyAndHeader("Sample Body", "service", "A");
    	
    	assertTrue(true);
    }

}
