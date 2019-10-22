package com.ricardosmithco.driver;

import java.sql.SQLException;

import ricardosmithco.dao.impl.AttributeDaoImpl;
import ricardosmithco.dao.impl.FriendsDaoImpl;

public class Driver {
	
	public static void main(String[] args) {
		FriendsDaoImpl fdi = new FriendsDaoImpl();
		AttributeDaoImpl adi = new AttributeDaoImpl();
		
		try {
			fdi.nameFriend("Mustafa", "Nofal");
		}catch (SQLException exception) {
			exception.printStackTrace();
		}
		
//		try {
//			fdi.getFriendsList();
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
	}

}
