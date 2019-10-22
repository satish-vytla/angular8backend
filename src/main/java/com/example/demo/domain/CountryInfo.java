package com.example.demo.domain;
import java.util.*;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "countries")
public class CountryInfo {

	
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public String getLocation() {
		return Location;
		
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getSeason() {
		return Season;
	}
	public void setSeason(String season) {
		Season = season;
	}
	public String getEnterMessage() {
		return EnterMessage;
	}
	public void setEnterMessage(String enterMessage) {
		EnterMessage = enterMessage;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	@BsonProperty
	private String CountryName;
	@BsonProperty
	private String Location;
	@BsonProperty
	private String Season;
	@BsonProperty
	private String EnterMessage;
	@BsonProperty
	private String ZipCode;
	@BsonProperty
	private Date Date;
	
}
