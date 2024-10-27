package Deserialization;

import java.util.List;

public class Getter_Setter {
	private String page;
	
	private String per_page;
	private String total;
	private String total_pages;
	private List<Getter_Setter_Data> data;
	private Getter_Setter_Support support;
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPer_page() {
		return per_page;
	}
	public void setPer_page(String per_page) {
		this.per_page = per_page;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(String total_pages) {
		this.total_pages = total_pages;
	}
	public List<Getter_Setter_Data> getData() {
		return data;
	}
	public void setData(List<Getter_Setter_Data> data) {
		this.data = data;
	}
	public Getter_Setter_Support getSupport() {
		return support;
	}
	public void setSupport(Getter_Setter_Support support) {
		this.support = support;
	}
	
}
