package miniProject;

import java.util.Scanner;

//Addr클래스의 인스턴스 10개를 저장할 수 있는 배열을 정의합니다
//배열에 인스턴스를 저장하고,수정하고, 삭제,저장된 데이터의 리스트를 출력하는 메서드를 정의합니다.
//배열 2개입력인풋
public class SmartPhone {
	// 클래스타입의 배열 10개 배열정의
	Addr[] addrs = new Addr[10];
	int add = 0;	
	Scanner in = new Scanner(System.in);
	//1.연락처 등록//추가
	public void inputAddrData() {
		System.out.println("이름: ");
		String name = in.nextLine();
		System.out.println("전화번호");
		String phone = in.nextLine();
		System.out.println("이메일");
		String email = in.nextLine();
		System.out.println("주소");
		String address = in.nextLine();
		System.out.println("그룹(친구/가족");
		String group = in.nextLine();
	}
	 // 연락처 객체 배열에 저장
    public void addAddr(Addr addr) {
        addrs[add] = addr;
        add++;
    }	
	//5.배열의 요소 연락처수정
	public void editAddr(String name, Addr newAddr) {
		for(int i=0; i<add; i++) {
			if(addrs[i].getName().equals(name)) 
                addrs[i]=newAddr;
                System.out.println(">>> 연락처가 수정되었습니다.");
                return;	
			}
		}
	
	//4.배열의 요소 연락처삭제
	public void deleteAddr(String name) {
		for(int i=0; i<add; i++) {
			if(addrs[i].getName().equals(name)){
				add--;
				System.out.println(">>연락처가 삭제되었습니다.");
				return;
			}
		}
	}
	//2.배열의 모든요소를 연락처출력되게하기
	public void printAllAddr() {
		if (add==0) {
			System.out.println("저장된 연락처가 없습니다.");
			return;
		}
		for(int i=0; i<add; i++) {
			System.out.println("연락처["+(i+1)+"]");
			addrs[i].printInfo();			
		}
	 }
	//3.배열의 모든 요소를 연락처검색하기
	public void searchAddr(String name) {
		boolean isfound = false;
		for(int i=0; i<add;i++) {
			if(addrs[i].getName().equals(name)) {
				addrs[i].printInfo();
				isfound=true;
				break;
			}
		}
		if(!isfound) {
			System.out.println("해당 이름의 연락처가 없습니다.");
		}
		}
	public void menu(int choice) {
		String name="";
		switch (choice) {
		case 1:
			System.out.println(">>연락처 등록 하세요:");
			inputAddrData();
			break;
		case 2:
			System.out.println(">>모든 연락처 출력합니다.");
			printAllAddr();
			break;
		case 3:
			System.out.println(">>연락처 검색을 입력하세요");
			name = in.nextLine();
			searchAddr(name);
			break;
		case 4:
			System.out.println(">>삭제할 연락처를 입력하세요");
			name = in.nextLine();
			deleteAddr(name);
			break;
		case 5:
			System.out.println(">>수정할 연락처를 입력하세요");
			name = in.nextLine();
			System.out.println("새 전화번호: ");
		    String phone = in.nextLine();
		    System.out.println("새 이메일: ");
		    String email = in.nextLine();
		    System.out.println("새 주소: ");
		    String address = in.nextLine();
		    System.out.println("새 그룹: ");
		    String group = in.nextLine();

		    // 새 객체 생성해서 전달
		    Addr newAddr = new Addr(name, phone, email, address, group);
		    editAddr(name, newAddr);
			break;
		case 6:
			System.out.println(">>프로그램을 종료합니다.");
			System.exit(0);
			break;
		default:
			System.out.println("잘못입력된 번호입니다.");
		}
		}
}
