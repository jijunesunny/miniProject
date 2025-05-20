package miniProject;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {
		//SmartPhone기본생성자
		SmartPhone sp = new SmartPhone();	
		
		Scanner in = new Scanner(System.in);
		System.out.println("#데이터 2개를 입력합니다.");
		
		for(int i=1; i<3; i++) {
			sp.inputAddrData(); 
			System.out.println(">>>데이터가 저장되었습니다.["+i+"]");
		}
		printMenu();
	}
		public static void printMenu() {
			System.out.println("주소관리 메뉴-----------------");
			System.out.println(">>1. 연락처 등록\n"+">>2. 모든 연락처 출력\n"+">>3. 연락처 검색\n"+">>4. 연락처 삭제\n"+">>5. 연락처 수정\n"+">>6.프로그램 종료");
//			System.out.println(">>2. 모든 연락처 출력");
//			System.out.println(">>3. 연락처 검색");
//			System.out.println(">>4. 연락처 삭제");
//			System.out.println(">>5. 연락처 수정");
//			System.out.println(">>6.프로그램 종료");
			System.out.println("--------------------------");
    	Scanner in = new Scanner(System.in);
    	System.out.println("필요하신 번호를 선택하세요:");
    	int num = in.nextInt();
    	System.out.println("선택하신 메뉴번호는:"+num+"번입니다.");
		in.close();
}
}