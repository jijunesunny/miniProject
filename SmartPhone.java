package miniProject;

import java.util.Scanner;

//AddrŬ������ �ν��Ͻ� 10���� ������ �� �ִ� �迭�� �����մϴ�
//�迭�� �ν��Ͻ��� �����ϰ�,�����ϰ�, ����,����� �������� ����Ʈ�� ����ϴ� �޼��带 �����մϴ�.
//�迭 2���Է���ǲ
public class SmartPhone {
	// Ŭ����Ÿ���� �迭 10�� �迭����
	Addr[] addrs = new Addr[10];
	Scanner in = new Scanner(System.in);

	public void inputAddrData() {
		System.out.println("�̸�: ");
		String name = in.nextLine();
		System.out.println("��ȭ��ȣ");
		String phone = in.nextLine();
		System.out.println("�̸���");
		String email = in.nextLine();
		System.out.println("�ּ�");
		String address = in.nextLine();
		System.out.println("�׷�(ģ��/����");
		String group = in.nextLine();
	}

	public void addAddr(Addr addr) {

	}

	public void editAddr(String name, Addr addr) {

	}

	public void deleteAddr(String name) {

	}

	public void printAllAddr() {
		//�迭���
//		for (int i=0; i<addrs.length; i++) {
//			System.out.println("addrs[" + i +"]=" +addrs[i]);
	 }

	public void searchAddr(String name) {

	}

}
