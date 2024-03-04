package com.angel.gestor.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angel.gestor.Models.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long>{

}
