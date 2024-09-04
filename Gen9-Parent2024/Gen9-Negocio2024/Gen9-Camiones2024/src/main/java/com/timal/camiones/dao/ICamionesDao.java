package com.timal.camiones.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timal.camiones.models.Camion;

public interface ICamionesDao extends JpaRepository<Camion, Long> {

}
