package com.prueba.MVC1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/tirar")
public class TirarControlador {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {
		return "HolaAlumnosFormulario";
	}
	
	//Procesa la informacion del formulario para agregarlo al modelo y mostrarlo en la vista.
	@RequestMapping("/procesarFormulario2")
	/* con @RequestParam podemos agarrar la informacion del campo "nombreALumno" y a contiunacion indicamos eltipo dedato y la variable donde se va a guardar - BindingRequest*/
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {
		// agarramos el valor del campo nombreAlumno del form y lo almacenamos en una variable
		nombre+=" es el peor alumno";
		String mensajeFinal ="¿Quien es el peor alumno? " + nombre;
		// agregando informacion al modelo
		modelo.addAttribute("mensaje", mensajeFinal);
		return "HolaAlumnosSpring";
	}
}
