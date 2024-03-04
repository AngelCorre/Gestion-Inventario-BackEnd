package com.angel.gestor.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angel.gestor.Models.Direccion;

@Repository
public interface IDireccionRepository extends JpaRepository<Direccion, Long>{

}
