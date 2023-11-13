package com.prueba.MVC1.validacionespersonalizadas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
//validatedBy: indica la futura clase que contendra la logica de la validacion
@Constraint(validatedBy=CPostalMadridValidacion.class )
// Target entre {} indicamos a que podemos aplicarle esta la validacion, ej tanto metodos como campos
@Target({ElementType.METHOD, ElementType.FIELD})
// Retention(RetentionPolicy.RUNTIME) : indicamos cuando chequeamos si la anotacion se cumple o no se cumple. Quweremos chequear esa validacion en tiempo de ejecucion (RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
public @interface CPostalMadrid {
// DEFINIR EL CODIGO POSTAL POR DEFECTO
	public String value() default "28";
	// DEFNIR EL MENSAJE DE ERROR
	public String message() default " El C. Postal debe comenzar por 28 ";
	// DEFINIOR LOS GRUPOS: Podemos ir validando los formularios a medida de que el usuario vaya completando el formulario
    Class<?>[] groups() default {};
	// DEFINIR LOS PAYLOADS: Contiene los datos que pueden ser almacenados o actualizados, se utiliza para metadatos
    Class<? extends Payload>[] payload() default {};
}
