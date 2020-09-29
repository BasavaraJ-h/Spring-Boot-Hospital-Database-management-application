package com.example.webappcontact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.ConnectableFlux;



@Repository
public class DatabaseWorker {

	@Autowired
	JdbcTemplate jdbctemplet;
	public List <demo> getusers(){
		List<demo> userlist = new ArrayList<>();
		String sqlquery = "SELECT * FROM  hospital;";
		Collection <Map<String,Object>> rows = jdbctemplet.queryForList(sqlquery);
		rows.stream().map((row) -> {
			demo user = new demo();
			user.setName((String)row.get("uname"));
			user.setEmail((String)row.get("Emailid"));
			user.setPnum((String)row.get("Pnum"));
			user.setDisease((String)row.get("disease"));
			user.setWnum((String)row.get("wnum"));
			user.setDoctor((String)row.get("doctor"));
			user.setDdate((String)row.get("ddate"));
			user.setMdetail((String)row.get("mdetail"));
			user.setFees((String)row.get("fees"));
			return user;
		}).forEach((user)->{
			userlist.add(user);
					
		});
		return userlist;
	}
	public void AddtoDataBase(String name, String pnum, String email
			,String disease, String wnum, String doctor,String ddate, String mdetail, String fees) {
		
		jdbctemplet.update((Connection connection) -> {
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO hospital (uname,Pnum,Emailid,disease ,wnum, doctor,ddate,mdetail,fees) VALUES(?,?,?,?,?,?,?,?,?)");
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, pnum);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, disease);
			preparedStatement.setString(5, wnum);
			preparedStatement.setString(6, doctor);
			preparedStatement.setString(7, ddate);
			preparedStatement.setString(8, mdetail);
			preparedStatement.setString(9, fees);
			return preparedStatement;
		});
		
	}
	public void RemoveFromDataBase(String name, String pnum, String email) {
		// TODO Auto-generated method stub
		
		jdbctemplet.update((Connection connection) -> {
			PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM hospital WHERE Pnum = "+ pnum);
			return preparedStatement;
		});
		
	}
}
