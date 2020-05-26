package com.sda.pidexercise2.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sa.pidexercise2.model.JsonModel;
import com.sa.pidexercise2.model.Member;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WriterJson {

	private String fileName;

	public WriterJson(String jsonFileName) {
		this.fileName=jsonFileName;
	}

	public  void writeJson(JsonModel jsonMembers) {

		ObjectMapper mapper = new ObjectMapper();

//		JsonModel jsonMembers = new JsonModel();

		try {

			// Java objects to JSON file
			mapper.writeValue(new File(fileName), jsonMembers);

//			// Java objects to JSON string - compact-print
//			String jsonString = mapper.writeValueAsString(members);

//			System.out.println(jsonString);
//
//			// Java objects to JSON string - pretty-print
//			String jsonInString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(members);
//
//			System.out.println(jsonInString2);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
