package com.sa.pidexercise2.model;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//import org.apache.commons.lang.builder.EqualsBuilder;
//import org.apache.commons.lang.builder.HashCodeBuilder;
//import org.apache.commons.lang.builder.ToStringBuilder;
import com.google.common.base.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "date", "members" })
public class Attendance {

	@JsonProperty("date")
	private String date;
	@JsonProperty("members")
	private List<Member> members = new ArrayList<Member>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Attendance() {
	}


	public Attendance(String date) {
		super();
		this.date = date;
	}

	
	public Attendance(String date, List<Member> members) {
		super();
		this.date = date;
		this.members = members;
	}

	@JsonProperty("date")
	public String getDate() {
		return date;
	}

	@JsonProperty("date")
	public void setDate(String date) {
		this.date = date;
	}

	public Attendance withDate(String date) {
		this.date = date;
		return this;
	}

	@JsonProperty("members")
	public List<Member> getMembers() {
		return members;
	}

	@JsonProperty("members")
	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public Attendance withMembers(List<Member> members) {
		this.members = members;
		return this;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(date);
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Attendance) == false) {
			return false;
		}
		Attendance rhs = ((Attendance) other);
		return Objects.equal(date, rhs.getDate());
}
}
