package com.ricardosmithco.dao;

import java.sql.SQLException;
import java.util.List;

import com.ricardosmithco.beans.Friends;

public interface FriendsDao {
	
	public abstract void nameFriend(String firstName, String lastName) throws SQLException;
	
	public abstract List<Friends> getFriendsList() throws SQLException;

}
