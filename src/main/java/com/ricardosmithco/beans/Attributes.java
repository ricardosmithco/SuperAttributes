package com.ricardosmithco.beans;

public class Attributes {
	
	private int attributeId;
	private String attribute;
	
	public Attributes() {
		super();
	}
	
	
	public Attributes(int attributeId, String attribute) {
		super();
		this.attributeId = attributeId;
		this.attribute = attribute;
	}
	
	
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	
	public String getAttribute() {
		return attribute;
	}
	
	


	public int getAttributeId() {
		return attributeId;
	}


	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}


	@Override
	public String toString() {
		return "Attributes [attributeId=" + attributeId + ", attribute=" + attribute + "]";
	}
	
	

}
