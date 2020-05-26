package com.sa.pidexercise2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "attendance" })
public class JsonModel {

	@JsonProperty("attendance")
	private List<Attendance> attendance = new ArrayList<Attendance>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public JsonModel() {
	}

	
	public JsonModel(List<Attendance> attendance) {
		super();
		this.attendance = attendance;
	}

	@JsonProperty("attendance")
	public List<Attendance> getAttendance() {
		return attendance;
	}

	@JsonProperty("attendance")
	public void setAttendance(List<Attendance> attendance) {
		this.attendance = attendance;
	}

	public JsonModel withAttendance(List<Attendance> attendance) {
		this.attendance = attendance;
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attendance == null) ? 0 : attendance.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JsonModel other = (JsonModel) obj;
		if (attendance == null) {
			if (other.attendance != null)
				return false;
		} else if (!attendance.equals(other.attendance))
			return false;
		return true;
	}



}