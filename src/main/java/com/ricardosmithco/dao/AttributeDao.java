package com.ricardosmithco.dao;

import java.sql.SQLException;
import java.util.List;

import com.ricardosmithco.beans.Attributes;

public interface AttributeDao {
	
	public abstract void createAttribute(String attribute) throws SQLException;
	
	public abstract List<Attributes> getAttributesList() throws SQLException;

}
