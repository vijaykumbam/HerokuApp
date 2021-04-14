package com.thefinancecompany.nse.nifty.service;

import java.util.List;

import com.thefinancecompany.nse.model.CreateNiftyResponseRecord;

public interface GetRecordByCompanySymbolI {

	List<CreateNiftyResponseRecord> getRecordBySymbol(String companyName); 
}
