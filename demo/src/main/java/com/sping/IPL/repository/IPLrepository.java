package com.sping.IPL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sping.IPL.model.IPL;

@Repository
public interface IPLrepository extends JpaRepository<IPL, Integer> {

}
 