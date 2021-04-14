package com.thefinancecompany.nse.nifty.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thefinancecompany.nse.entity.NiftyFiftyRecords;
import com.thefinancecompany.nse.model.CreateNiftyResponseRecord;
import com.thefinancecompany.nse.repository.NiftyRecordsRepository;


@Service
@Transactional
public class GetRecordsByCompanySymbolImpl implements GetRecordByCompanySymbolI{

	@Autowired	private NiftyRecordsRepository repo;
	@Autowired private ModelMapper mapper;
	
	@Override
	public List<CreateNiftyResponseRecord> getRecordBySymbol(String companyName) {
		List<NiftyFiftyRecords>list =repo.findBySymbol(companyName);
		List<CreateNiftyResponseRecord> list1 = new ArrayList<>();
		Iterator<NiftyFiftyRecords> itr =list.iterator();
		while(itr.hasNext()) {
			NiftyFiftyRecords obj =itr.next();
			CreateNiftyResponseRecord obj1 = mapper.map(obj, CreateNiftyResponseRecord.class);
			list1.add(obj1);
		}
		return list1;
	}

	
}
