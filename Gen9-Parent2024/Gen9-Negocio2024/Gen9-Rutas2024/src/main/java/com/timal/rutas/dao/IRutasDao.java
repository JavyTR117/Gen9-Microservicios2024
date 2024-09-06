package com.timal.rutas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timal.rutas.models.Ruta;

public interface IRutasDao extends JpaRepository<Ruta, Long> {

}
