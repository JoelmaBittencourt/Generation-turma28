package com.joelma.os.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joelma.os.domain.Os;
@Repository
public interface OsRepository extends JpaRepository<Os, Integer>{

}
