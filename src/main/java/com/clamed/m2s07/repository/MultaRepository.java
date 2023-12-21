package com.clamed.m2s07.repository;

import com.clamed.m2s07.model.Multa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MultaRepository extends JpaRepository<Multa, Integer> {
}