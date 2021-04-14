package com.thefinancecompany.nse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thefinancecompany.nse.entity.NiftyFiftyRecords;
import com.thefinancecompany.nse.model.CreateNiftyResponseRecord;

@Repository
public interface NiftyRecordsRepository extends JpaRepository<NiftyFiftyRecords, Long>{

	List<NiftyFiftyRecords> findBySymbol(String companyName);

}
