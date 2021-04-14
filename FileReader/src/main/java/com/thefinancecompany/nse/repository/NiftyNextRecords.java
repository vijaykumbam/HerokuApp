package com.thefinancecompany.nse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thefinancecompany.nse.entity.NiftyFiftyRecords;
import com.thefinancecompany.nse.entity.NiftyNext50Records;

@Repository
public interface NiftyNextRecords extends JpaRepository<NiftyNext50Records, Long>{
	
	List<NiftyNextRecords> findBySymbol(String companyName);
}
