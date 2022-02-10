package com.demo.restroute.service.error;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * @author Chittaranjan
 *
 */
public class ErrorProcessor implements Processor {

	public ErrorProcessor() {
	}

	@Override
	public void process(Exchange exchange) throws Exception {

		Exception cause = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);

		if (cause == null) { // no error
			return;
			
		} else { // error
			Error error = new Error();
			error.setStatus("Error");
			error.setErrorCode(500);
			error.setErrorMessage(cause.getMessage());

			exchange.getOut().setHeader(Exchange.HTTP_RESPONSE_CODE, 500);
			exchange.getOut().setBody(error);
		}
	}

}
