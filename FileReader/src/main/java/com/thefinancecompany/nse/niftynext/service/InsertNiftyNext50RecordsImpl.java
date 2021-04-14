package com.thefinancecompany.nse.niftynext.service;

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
import com.thefinancecompany.nse.entity.NiftyNext50Records;
import com.thefinancecompany.nse.model.CreateNiftyNextRequestRecord;
import com.thefinancecompany.nse.repository.NiftyNextRecords;

@Service
@Transactional
public class InsertNiftyNext50RecordsImpl implements InsertNiftyNext50RecordsI{

	@Autowired private NiftyNextRecords repo;
	@Autowired private ModelMapper mapper;
	
	LocalDateTime ldt = LocalDateTime.now();
	
	@Override
	public String recordsSaved() {
		String systemPath = System.getProperty("user.dir");
		String path =systemPath+"src/main/resources/MW-NIFTY-NEXT-50-14-Apr-2021.csv";
		try {
			File csvFile = new File(path); // Select the file
			FileReader fr = new FileReader(csvFile); // To read the File
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			int totalNoOfRows = 0;
			while ((line = br.readLine()) != null) {
				totalNoOfRows++;
				CreateNiftyNextRequestRecord obj = new CreateNiftyNextRequestRecord();
				String[] records = line.split(",");
				for(int i=0;i<records.length;i++) {
					System.out.println("values of "+records[i] +" :"+ i);
				}
				
				  obj.setSymbol(records[0]);  //String
				  obj.setOpen(Double.parseDouble(records[1])); //Double
				  obj.setHigh(Double.parseDouble(records[2])); //Double
				  obj.setLow(Double.parseDouble(records[3]));  //Double
				  obj.setPrevious(Double.parseDouble(records[4]));  //Double
				  obj.setLastTradingPoint(Double.parseDouble(records[5]));
				  obj.setChange(Double.parseDouble(records[6]));
				  obj.setChangePercentage(Double.parseDouble(records[7]));
				  obj.setVolume(Double.parseDouble(records[8]));
				  obj.setValue(Double.parseDouble(records[9]));
				  obj.set_52WeekHigh(Double.parseDouble(records[10]));
				  obj.set_52WeekLow(Double.parseDouble(records[11]));
				  obj.setYearlyChange(Double.parseDouble(records[12]));
				  obj.setMonthlyChange(Double.parseDouble(records[13]));
				  obj.setInsertedDateTime(ldt);
				  mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
				  NiftyNext50Records nseRecordsObj = mapper.map(obj, NiftyNext50Records.class);
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
