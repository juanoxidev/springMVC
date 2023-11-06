package com.prueba.MVC1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Pedir el primer formulario para llenarlo
// Una vez que se llene el formulario enviarlo al controlador para que se procese la informacion


@Controller
@RequestMapping("/alumnos")
public class HolaAlumnosController {

	//Proporciona el formulario
	/*Debemos indicarle a Spring que vamos a hacer un request de una URL jsp "HolaAlumnosFormulario", este metodo es el encargado de pedirle al servidor via url el formualrio, 
	entre parentesis debemos indicar que url es la que el usuario debe colocar para que el servidor le de el formulario ej "/muestraFormulario*/
	
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {
		return "HolaAlumnosFormulario";
	}
	
	//Procesa la informacion del formulario que le hemos enviado.
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
	}
	
	//Procesa la informacion del formulario para agregarlo al modelo y mostrarlo en la vista.
//	@RequestMapping("/procesarFormulario2")
//	
//	public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
//		// agarramos el valor del campo nombreAlumno del form y lo almacenamos en una variable
//		String nombre = request.getParameter("nombreAlumno");
//		nombre+=" es el mejor alumno";
//		String mensajeFinal ="¿Quien es el mejor alumno? " + nombre;
//		// agregando informacion al modelo
//		modelo.addAttribute("mensaje", mensajeFinal);
//		return "HolaAlumnosSpring";
//	}
	
	//Procesa la informacion del formulario para agregarlo al modelo y mostrarlo en la vista.
	@RequestMapping("/procesarFormulario2")
	/* con @RequestParam podemos agarrar la informacion del campo "nombreALumno" y a contiunacion indicamos eltipo dedato y la variable donde se va a guardar - BindingRequest*/
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {
		// agarramos el valor del campo nombreAlumno del form y lo almacenamos en una variable
		nombre+=" es el mejor alumno";
		String mensajeFinal ="¿Quien es el mejor alumno? " + nombre;
		// agregando informacion al modelo
		modelo.addAttribute("mensaje", mensajeFinal);
		return "HolaAlumnosSpring";
	}
}

