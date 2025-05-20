package miniProject;

import chapter06.Car;

public class Addr {
	//필드
	private String name;
	private String phone;
	private String email;
	private String address;
	private String group;
	//생성자
	public Addr(String name, String phone, String email, String address, String group){
	this.name=name;
	this.phone=phone;
	this.email=email;
	this.address=address;
	this.group=group;
	}
	//게터,세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		
	}	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone=phone;
		
	}
	public String getEmail() {
		return email;
	}
	public  void setEmail(String email) {
		this.email=email;
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
		
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group=group;
		
	}
	
	// 연락처 정보 출력
    public void printInfo() {
        System.out.println("이름:" + this.name);
        System.out.println("전화번호:" + this.phone);
        System.out.println("이메일:" + this.email);
        System.out.println("주소:" + this.address);
        System.out.println("그룹(친구/가족):" + this.group);
    }
}

