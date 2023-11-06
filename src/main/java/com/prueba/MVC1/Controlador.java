package com.prueba.MVC1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// indicamos que esta clase es nuestro controlador con @Controller
@Controller
public class Controlador {
	
//RequestMapping : Metodo encargado de especificar/mapear que vista queremos que nos proporcione el proyecto, en el return indicamos el nombre de la vista .jsp que queremos que se renderice

	@RequestMapping
	public String muestraPagina() {
		return "paginaEjemplo";
	}
	

}
