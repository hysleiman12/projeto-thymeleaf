package com.javainspires.demothymeleaf.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javainspires.demothymeleaf.model.Login;

@Repository
public class LoginDao {
	
	public List<Login>findAll(){
		List<Login> empList = new ArrayList<Login>();
		empList.add(new Login("01", "AIRON", "22"));
		empList.add(new Login("02", "HESLEYMAN", "25"));
		empList.add(new Login("03", "JOÃO", "35"));
		empList.add(new Login("04", "JOSÉ", "15"));
		empList.add(new Login("05", "JENNIFER", "50"));
		empList.add(new Login("06", "GABRIELA", "40"));
		
		return empList;
	}

}
