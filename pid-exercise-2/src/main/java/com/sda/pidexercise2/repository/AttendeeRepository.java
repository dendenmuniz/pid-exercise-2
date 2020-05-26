package com.sda.pidexercise2.repository;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sa.pidexercise2.model.JsonModel;

public class AttendeeRepository {

	private String fileName;
	private ObjectMapper mapper = new ObjectMapper();

	public AttendeeRepository(String jsonFileName) {
		this.fileName=jsonFileName;
	}

	public JsonModel readJsonFile() {

		try {

			// JSON file to Java object
			JsonModel jsonMembers = mapper.readValue(getClass().getClassLoader().getResourceAsStream(fileName), JsonModel.class);
			return jsonMembers;

		} catch (IOException e) {
		  throw new RuntimeException(e) ;
		} 
	}
	
	public  void writeJson(JsonModel jsonMembers) {

		try {

			// Java objects to JSON file
			mapper.writeValue(new File(fileName), jsonMembers);


		} catch (IOException e) {
			  throw new RuntimeException(e) ;
		}

	}

}
