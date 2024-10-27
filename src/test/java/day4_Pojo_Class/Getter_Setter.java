package day4_Pojo_Class;

import java.util.List;

public class Getter_Setter{

	private String name;
	private String job;
	
	private List<String> Skill;
	public String getName() {
		return name;
	}
	public List<String> getSkill() {
		return Skill;
	}
	public void setSkill(List<String> list) {
		Skill = list;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	

}


