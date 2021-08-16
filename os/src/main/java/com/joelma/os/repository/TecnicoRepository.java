package com.joelma.os.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joelma.os.domain.Tecnico;
@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
