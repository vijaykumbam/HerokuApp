package com.thefinancecompany.nse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thefinancecompany.nse.entity.NiftyFiftyRecords;
import com.thefinancecompany.nse.model.CreateNiftyResponseRecord;
import com.thefinancecompany.nse.nifty.service.GetRecordsByCompanySymbolImpl;
import com.thefinancecompany.nse.nifty.service.InsertRecordsImpl;
import com.thefinancecompany.nse.repository.NiftyRecordsRepository;

@RestController
@RequestMapping("/nse")
public class Nifty50Controller {

	@Autowired private InsertRecordsImpl insert;
	@Autowired private NiftyRecordsRepository repo;
	@Autowired private GetRecordsByCompanySymbolImpl getListOfRecordByCompanySymbol;
	
	
	@PostMapping
	public String saveRecords() {
		return insert.recordsSaved();
	}
	
	
	@GetMapping
	public List<NiftyFiftyRecords> getAll(){
		return repo.findAll();
	}
	
	
	@GetMapping("/{companyname}")
	public List<CreateNiftyResponseRecord> getByCompanysymbol(@PathVariable String companyname){
		return getListOfRecordByCompanySymbol.getRecordBySymbol(companyname);
}
}
