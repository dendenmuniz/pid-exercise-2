package com.sa.pidexercise2.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "id", "attended" })
public class Member {

	@JsonProperty("name")
	private String name;
	@JsonProperty("id")
	private String id;
	@JsonProperty("attended")
	private Boolean attended;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Member() {
		
	}

	public Member(String name, String id, Boolean attended) {
		this.name = name;
		this.id = id;
		this.attended = attended;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public Member withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	public Member withId(String id) {
		this.id = id;
		return this;
	}

	@JsonProperty("attended")
	public Boolean getAttended() {
		return attended;
	}

	@JsonProperty("attended")
	public void setAttended(Boolean attended) {
		this.attended = attended;
	}

	public Member withAttended(Boolean attended) {
		this.attended = attended;
		return this;
	}

	@Override
	public String toString() {
//		return new StringBuilder().append(name).append("\t\t\t").append(id).append("\t").append(attended).toString();
		return new StringBuilder().append("\tname: ").append(name).append("\tid: ").append( id).append("\tattended: ").append(attended).toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(attended, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(attended, other.attended) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}
	
	
}