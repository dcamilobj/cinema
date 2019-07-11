package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entity.Parameter;

@Repository
public interface ParameterRepository extends JpaRepository<Parameter, Long>{

}
