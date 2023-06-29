package com.gnp.contactos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gnp.contactos.entity.Contacto;
import com.gnp.contactos.service.ContactoService;

@RestController
@RequestMapping(path="/api/v1")
public class ContactoController {
	
	@Autowired
	private ContactoService contactoService;
	
	@GetMapping("/contactos")
	public List<Contacto> getAll(){	
		
		return  contactoService.getContactos();
	}
	
	@GetMapping("/contacto/{contactoId}")
	public Contacto getContacto(@PathVariable("contactoId") Long contactoId ){
				
		return  contactoService.getContacto(contactoId);
	}
	
	@PostMapping("/contacto")
	public void getContacto(@RequestBody Contacto contacto ){
				
		  contactoService.guardarActualizarContacto(contacto);
	}
	
	@DeleteMapping("/contacto/{contactoId}")
	public void eliminarContacto(@PathVariable("contactoId") Long contactoId ){
				
		  contactoService.eliminarContacto(contactoId);
	}

}
