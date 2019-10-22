package ricardosmithco.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ricardosmithco.beans.Friends;
import com.ricardosmithco.dao.FriendsDao;
import com.ricardosmithco.util.FriendFactory;

public class FriendsDaoImpl implements FriendsDao{
	public static FriendFactory ff = FriendFactory.getInstance();

	public void nameFriend(String firstName, String lastName) throws SQLException {
		Connection conn = ff.getConnection();
		String sql = "INSERT INTO FRIENDS VALUES(FRISEQ.NEXTVAL, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(sql); 
		ps.setString(1, firstName);
		ps.setString(2, lastName);
		ps.execute();
		
	}

	public List<Friends> getFriendsList() throws SQLException {
		Connection conn = ff.getConnection();
		List<Friends> myFriendList = new ArrayList<Friends>();
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM FRIENDS");
		Friends friend = null;
		
		while(rs.next()) {
			friend = new Friends(rs.getInt(1), rs.getString(2), rs.getString(3));
			myFriendList.add(friend);
		}
		
		return myFriendList;
	}
	
	

}
