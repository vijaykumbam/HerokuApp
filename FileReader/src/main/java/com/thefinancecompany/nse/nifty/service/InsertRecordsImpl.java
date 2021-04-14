package com.thefinancecompany.nse.nifty.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDateTime;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thefinancecompany.nse.entity.NiftyFiftyRecords;
import com.thefinancecompany.nse.model.CreateNiftyRequestRecord;
import com.thefinancecompany.nse.repository.NiftyRecordsRepository;

@Service
@Transactional
public class InsertRecordsImpl implements InsertRecordsI {

	@Autowired	private NiftyRecordsRepository repo;
	@Autowired private ModelMapper mapper;

	LocalDateTime ldt = LocalDateTime.now();

	@Override
	public String recordsSaved() {
		String systemPath = System.getProperty("user.dir");
		String path =systemPath+"\\src\\main\\resources\\MW-NIFTY-50-14-Apr-2021.csv";
		try {
			File csvFile = new File(path); // Select the file
			FileReader fr = new FileReader(csvFile); // To read the File
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			int totalNoOfRows =0;
			while ((line = br.readLine()) != null) {
				totalNoOfRows++;
				CreateNiftyRequestRecord obj = new CreateNiftyRequestRecord();
				String[] records = line.split(",");
				  obj.setSymbol(records[0]); 
				  obj.setOpen(Double.parseDouble(records[1]));
				  obj.setHigh(Double.parseDouble(records[2]));
				  obj.setLow(Double.parseDouble(records[3]));
				  obj.setPrevious(Double.parseDouble(records[4]));
				  obj.setLastTradingPoint(Double.parseDouble(records[5]));
				  obj.setChange(Double.parseDouble(records[6]));
				  obj.setChangePercentage(Double.parseDouble(records[7]));
				  obj.setVolume(Long.parseLong(records[8]));
				  obj.set_52WeekHigh(Double.parseDouble(records[9]));
				  obj.set_52WeekLow(Double.parseDouble(records[10]));
				  obj.setYearlyChange(Double.parseDouble(records[11]));
				  obj.setMonthlyChange(Double.parseDouble(records[12]));
				  obj.setInsertedDateTime(ldt);
				  mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
				  NiftyFiftyRecords nseRecordsObj = mapper.map(obj, NiftyFiftyRecords.class);
				  repo.save(nseRecordsObj);
			}
			System.out.println("Total no of rows were :"+totalNoOfRows);
			br.close();
			return "Records were saved";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
