package com.prueba.MVC1;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno") // URL
public class AlumnoController {
	
	@InitBinder
	public void miBinder(WebDataBinder binder) {
		StringTrimmerEditor recortaEspaciosBlancos= new StringTrimmerEditor(true);	
		binder.registerCustomEditor(String.class, recortaEspaciosBlancos);
	}

	/*
	 * El metodo muestraFormulario no procesa la informacion, le da el form al usuario, captura la info y la
	 * envia para que pueda ser procesada
	 */
	@RequestMapping("/muestraFormulario") // URL
	public String muestraFormulario(Model modelo) {
		/*
		 * Pretendo q me muestre un formulario de registro con casilla nombre y
		 * apellido, va a registrar objetos de tipo Alumno, necesito que el controlador
		 * guarde la info que el usuario ha introducido en el form en un objeto tipo
		 * alumno para que envie a traves del modelo esa informacion a la vista de
		 * confirmacion metodo addAtribute del modelo, primer parametro es un String que
		 * almacena un nombre identificativo de la informacion, segundo es el objeto
		 */
		Alumno elAlumno = new Alumno();
		modelo.addAttribute("inscripto", elAlumno);
		/*
		 * Formulario al cual redirecciona
		 */
		return "iniciaAltaAlumno"; // JSP
	}

	/*
	 * (@ModelAttribute("nombreIdentificativoDelAtributo") Alumno elAlumno) recibe
	 * el parametro del modelo que viajo hasta ese controller, debemos guardar esa
	 * informacion en una variable en este caso un Alumno. Luego a la hora de llamar
	 * a ese objeto se debe usar la descripcion indicada entre los parametros Ej
	 * inscripto.nombre, inscripto.apellido para que la .jsp pueda renderizarlo.
	 */
	@RequestMapping("/procesarFormulario") // URL
	public String procesarFormulario(@Valid @ModelAttribute("inscripto") Alumno elAlumno,
			BindingResult resultadoValidacion) {
		/*
		 * Debemos detectar cual es el metodo del controlador que procesa el formulario.
		 * Una vez alli, debemos especificar la validacion que estamos queriendo hacer.
		 * Cuando utilizamos validacion, el resultado de la misma ya sea positiva o
		 * negativa se almacena en un objeto de tipo BindingResult, debemos contrurir un
		 * objeto de ese tipo dentro de los argumentos del metodo que procesa el
		 * formulario. Antes de los argumentos debemos agregar la annotation @Valid 6:23
		 */

		/*
		 * Si hay errores en la validacion devuelve al formulario de registro
		 */
		if (resultadoValidacion.hasErrors()) {
			return "iniciaAltaAlumno"; // JSP
		} else {
			/*
			 * Si no hay errores en la validacion devuelve al formulario de confirmacion de
			 * registro
			 */
			return "confirmacionRegistroAlumno";// JSP
		}

	}

}
