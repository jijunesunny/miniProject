package miniProject;

import java.util.Scanner;

//Addr클래스의 인스턴스 10개를 저장할 수 있는 배열을 정의합니다
//배열에 인스턴스를 저장하고,수정하고, 삭제,저장된 데이터의 리스트를 출력하는 메서드를 정의합니다.
//배열 2개입력인풋
public class SmartPhone {
	// 클래스타입의 배열 10개 배열정의
	Addr[] addrs = new Addr[10];
	Scanner in = new Scanner(System.in);

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

	public void addAddr(Addr addr) {

	}

	public void editAddr(String name, Addr addr) {

	}

	public void deleteAddr(String name) {

	}

	public void printAllAddr() {
		//배열출력
//		for (int i=0; i<addrs.length; i++) {
//			System.out.println("addrs[" + i +"]=" +addrs[i]);
	 }

	public void searchAddr(String name) {

	}

}
