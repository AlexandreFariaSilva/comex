package br.com.comex.main;

import javax.xml.ws.Endpoint;

import br.com.comex.ws.ComexWS;


public class MainComexWS {

	public static void main(String[] args) {
		
		String url = "http://0.0.0.0:8080/ComexWS?wsdl";
		System.out.println("Categoria no ar");
		Endpoint.publish(url, new ComexWS());
		
		
	}

}
