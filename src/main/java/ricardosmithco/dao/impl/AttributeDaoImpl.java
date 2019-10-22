package ricardosmithco.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ricardosmithco.beans.Attributes;
import com.ricardosmithco.dao.AttributeDao;
import com.ricardosmithco.util.FriendFactory;

public class AttributeDaoImpl implements AttributeDao {
	
	public static FriendFactory ff = FriendFactory.getInstance();

	public void createAttribute(String attribute) throws SQLException {
		Connection conn = ff.getConnection();
		String sql = "INSERT INTO ATTRIBUTES VALUES (ATTSEQ.NEXTVAL, ?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, attribute);
		ps.execute();
		
	}

	public List<Attributes> getAttributesList() throws SQLException {
		List<Attributes> attributeList = new ArrayList<Attributes>();
		Connection conn = ff.getConnection();
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM ATTRIBUTES");
		
		Attributes attribute = null;
		while(rs.next()) {
			attribute = new Attributes(rs.getInt(1), rs.getString(2));
			attributeList.add(attribute);
			
		}
		
		return attributeList;
	}

	

}

