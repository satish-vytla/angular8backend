package com.example.demo.domain;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class UserInfo {

	@BsonProperty
	private String FullName;

	@BsonProperty
	private String Adress;

	@BsonProperty
	private String Email;

	@BsonProperty
	private String EnterMessage;

	@BsonProperty
	private String PhoneNumber;

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getEnterMessage() {
		return EnterMessage;
	}

	public void setEnterMessage(String enterMessage) {
		EnterMessage = enterMessage;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "UserInfo [FullName=" + FullName + ", Adress=" + Adress + ", Email=" + Email + ", EnterMessage="
				+ EnterMessage + ", PhoneNumber=" + PhoneNumber + "]";
	}

}
