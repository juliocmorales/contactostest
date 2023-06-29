package com.gnp.contactos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gnp.contactos.entity.Contacto;
import com.gnp.contactos.repository.ContactoRepository;

@Service
public class ContactoService {
	
	@Autowired
	ContactoRepository contactoRepository;
	
	
	public List<Contacto> getContactos(){		
		return contactoRepository.findAll();	
	}
	
	public Contacto getContacto(Long id) {
		return contactoRepository.getReferenceById(id);
	}
	
	public void guardarActualizarContacto(Contacto contacto) {
		 contactoRepository.save(contacto);
	}
	
	public void eliminarContacto(Long id) {
		contactoRepository.deleteById(id);
	}

}
