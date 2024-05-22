package bean;

import java.util.List;

public class ContactCastomer {
	private String name;
	private String company;
	private String address;
	private String inquiry;
	private List<String> merumaga_type;
	private String document_request;
	
	// ========セッターメソッド=========
	public void setName(String name) {
		this.name=name;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setInquiry(String inquiry) {
		this.inquiry=inquiry;
	}
	
	public void setMerumaga_type(List<String> merumaga_type) {
		this.merumaga_type = merumaga_type;
	}
	
	public void setDocument_request(String document_request) {
		this.document_request = document_request;
	}
	
	//=========ゲッターメソッド============
	public String getName() {
		return this.name;
	}
	
	public String getCompany() {
		return this.company;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getInquiry() {
		return this.inquiry;
	}
	
	public List<String> getMerumaga_type(){
		return this.merumaga_type;
	}
	
	public String getDocument_request() {
		return this.document_request;
	}
}
