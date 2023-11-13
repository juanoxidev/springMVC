package com.prueba.MVC1.validacionespersonalizadas;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalMadridValidacion implements ConstraintValidator<CPostalMadrid, String>{

	private String prefijoCodigoMadrid;
	
	
	@Override
	public void initialize(CPostalMadrid elCodigo) {
	// seteamos el prefijo 28 a la validacion de cpostalmadrid elcodigo.value(); 
		this.prefijoCodigoMadrid= elCodigo.value();
		
	}
 // hay que indicarle a este metodo tanto si el usuario deja en blanco el campo = null o si lo rellena
	@Override
	public boolean isValid(String inputUsuario, ConstraintValidatorContext arg1) {
		// si el inputUsuario empieza por 28 el resultado es true, si no es asi, el resultado es false
		
		boolean valCodigo = false;
		if (inputUsuario != null) { valCodigo = inputUsuario.startsWith(prefijoCodigoMadrid);}
		
		return valCodigo;
	}

}
