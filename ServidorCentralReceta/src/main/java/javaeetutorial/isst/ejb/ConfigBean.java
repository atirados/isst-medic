/**
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package javaeetutorial.isst.ejb;

import java.sql.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 * <p>Singleton bean that initializes the book database for the bookstore
 * example.</p>
 */
@Singleton
@Startup
public class ConfigBean {

	
	@EJB
	private RecetaRequestBean receta;

	@PostConstruct
	public void createData() {
		
		
		receta.crearReceta("100", "Marcos Torres", "1000212", "Medico de Marcos",
				"123456789", new Date(System.currentTimeMillis()), "Cetirizina",
				"Tomar cuando te de la realisima gana", "Tipo raro", "Coso para la alergia", false);
		receta.crearReceta("101", "Oscar Araque", "1000213", "Medico de Oscar",
				"123456123", new Date(System.currentTimeMillis()), "Bisolvon",
				"Tomar mucho, MUCHISIMO", "Tipo lucha", "Otro antitusivo", false);
		receta.crearReceta("107", "Marcos Torres", "1000212", "Medico de Marcos",
				"123456789", new Date(System.currentTimeMillis()), "Cetirizina2",
				"Tomar por la oreja", "Para la alergia", "Es para la alergia nano", false);
		receta.crearReceta("103", "Oscar Araque", "1000213", "Medico de Oscar",
				"123456123", new Date(System.currentTimeMillis()), "Bisolvon (x2)",
				"Tomar mucho, MUCHISISISISIMO", "Tipo lucha contra la tos", "Otro antitusivo mas, aun", false);
		
	}
}
