package miniProject;
import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {
		//SmartPhone�⺻������
		SmartPhone sp = new SmartPhone();	
		
		Scanner in = new Scanner(System.in);
		System.out.println("#������ 2���� �Է��մϴ�.");
		for(int i=0; i<2; i++) {
		sp.inputAddrData();
		}
	}
	public static void printMenu() {
		System.out.println("�ּҰ��� �޴�-----------------");
		System.out.println(">>1. ����ó ���");
		System.out.println(">>2. ��� ����ó ���");
		System.out.println(">>3. ����ó �˻�");
		System.out.println(">>4. ����ó ����");
		System.out.println(">>5. ����ó ����");
		System.out.println(">>6.���α׷� ����");
		System.out.println("--------------------------");
			
	}
}

