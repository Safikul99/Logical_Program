package dSrime;

public class Student 
{
	private Integer sid;
	private String sName;
	private Double  sMarkes;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Double getsMarkes() {
		return sMarkes;
	}
	public void setsMarkes(Double sMarkes) {
		this.sMarkes = sMarkes;
	}
	public Student(Integer sid, String sName, Double sMarkes) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.sMarkes = sMarkes;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", sMarkes=" + sMarkes + "]";
	}
	
	

}
