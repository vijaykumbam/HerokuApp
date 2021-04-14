package com.thefinancecompany.nse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thefinancecompany.nse.entity.NiftyNext50Records;
import com.thefinancecompany.nse.niftynext.service.InsertNiftyNext50RecordsImpl;
import com.thefinancecompany.nse.repository.NiftyNextRecords;

@RestController
@RequestMapping("/niftynext")
public class NiftyNext50Controller {

	@Autowired private InsertNiftyNext50RecordsImpl insert;
	@Autowired private NiftyNextRecords repo;
	
	@GetMapping("/save")
	public String saveRecords() {
		return insert.recordsSaved();
	}
	
	
	@GetMapping
	public List<NiftyNext50Records> getAll(){
		return repo.findAll();
	}
}
