package com.sping.rajan.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import ch.qos.logback.core.model.Model;

;

	@Repository
	public interface Repositorye extends JpaRepository <Model,Integer> {

	
}