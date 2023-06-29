package com.gnp.contactos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gnp.contactos.entity.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Long>{

}
