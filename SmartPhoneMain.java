package miniProject;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {
		//SmartPhone�⺻������
		SmartPhone sp = new SmartPhone();	
		
		Scanner in = new Scanner(System.in);
		System.out.println("#������ 2���� �Է��մϴ�.");
		
		for(int i=1; i<3; i++) {
			sp.inputAddrData(); 
			System.out.println(">>>�����Ͱ� ����Ǿ����ϴ�.["+i+"]");
		}
		printMenu();
	}
		public static void printMenu() {
			System.out.println("�ּҰ��� �޴�-----------------");
			System.out.println(">>1. ����ó ���\n"+">>2. ��� ����ó ���\n"+">>3. ����ó �˻�\n"+">>4. ����ó ����\n"+">>5. ����ó ����\n"+">>6.���α׷� ����");
//			System.out.println(">>2. ��� ����ó ���");
//			System.out.println(">>3. ����ó �˻�");
//			System.out.println(">>4. ����ó ����");
//			System.out.println(">>5. ����ó ����");
//			System.out.println(">>6.���α׷� ����");
			System.out.println("--------------------------");
    	Scanner in = new Scanner(System.in);
    	System.out.println("�ʿ��Ͻ� ��ȣ�� �����ϼ���:");
    	int num = in.nextInt();
    	System.out.println("�����Ͻ� �޴���ȣ��:"+num+"���Դϴ�.");
		in.close();
}
}