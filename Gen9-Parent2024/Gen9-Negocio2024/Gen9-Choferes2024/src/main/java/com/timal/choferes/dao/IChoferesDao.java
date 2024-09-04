package com.timal.choferes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timal.choferes.models.Chofer;

public interface IChoferesDao extends JpaRepository<Chofer, Long> {

}
