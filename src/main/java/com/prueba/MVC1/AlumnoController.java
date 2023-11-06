package com.prueba.MVC1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@RequestMapping("/inscripcion")
	public String muestraFormulario(Model modelo) {
		Alumno elAlumno = new Alumno();
		modelo.addAttribute("inscripto", elAlumno);
		return "altaAlumno";
		
	}

}
