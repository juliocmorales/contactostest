package com.gnp.contactos.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Contacto implements Serializable{
	
	private static final long serialVersionUID = 134634687L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO	)
	private Long id;
	
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;	
	private String telefono;
	private String email;

}
