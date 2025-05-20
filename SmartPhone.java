package miniProject;

import java.util.Scanner;

//AddrŬ������ �ν��Ͻ� 10���� ������ �� �ִ� �迭�� �����մϴ�
//�迭�� �ν��Ͻ��� �����ϰ�,�����ϰ�, ����,����� �������� ����Ʈ�� ����ϴ� �޼��带 �����մϴ�.
//�迭 2���Է���ǲ
public class SmartPhone {
	// Ŭ����Ÿ���� �迭 10�� �迭����
	Addr[] addrs = new Addr[10];
	int add = 0;	
	Scanner in = new Scanner(System.in);
	//1.����ó ���//�߰�
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
	 // ����ó ��ü �迭�� ����
    public void addAddr(Addr addr) {
        addrs[add] = addr;
        add++;
    }	
	//5.�迭�� ��� ����ó����
	public void editAddr(String name, Addr newAddr) {
		for(int i=0; i<add; i++) {
			if(addrs[i].getName().equals(name)) 
                addrs[i]=newAddr;
                System.out.println(">>> ����ó�� �����Ǿ����ϴ�.");
                return;	
			}
		}
	
	//4.�迭�� ��� ����ó����
	public void deleteAddr(String name) {
		for(int i=0; i<add; i++) {
			if(addrs[i].getName().equals(name)){
				add--;
				System.out.println(">>����ó�� �����Ǿ����ϴ�.");
				return;
			}
		}
	}
	//2.�迭�� ����Ҹ� ����ó��µǰ��ϱ�
	public void printAllAddr() {
		if (add==0) {
			System.out.println("����� ����ó�� �����ϴ�.");
			return;
		}
		for(int i=0; i<add; i++) {
			System.out.println("����ó["+(i+1)+"]");
			addrs[i].printInfo();			
		}
	 }
	//3.�迭�� ��� ��Ҹ� ����ó�˻��ϱ�
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
			System.out.println("�ش� �̸��� ����ó�� �����ϴ�.");
		}
		}
	public void menu(int choice) {
		String name="";
		switch (choice) {
		case 1:
			System.out.println(">>����ó ��� �ϼ���:");
			inputAddrData();
			break;
		case 2:
			System.out.println(">>��� ����ó ����մϴ�.");
			printAllAddr();
			break;
		case 3:
			System.out.println(">>����ó �˻��� �Է��ϼ���");
			name = in.nextLine();
			searchAddr(name);
			break;
		case 4:
			System.out.println(">>������ ����ó�� �Է��ϼ���");
			name = in.nextLine();
			deleteAddr(name);
			break;
		case 5:
			System.out.println(">>������ ����ó�� �Է��ϼ���");
			name = in.nextLine();
			System.out.println("�� ��ȭ��ȣ: ");
		    String phone = in.nextLine();
		    System.out.println("�� �̸���: ");
		    String email = in.nextLine();
		    System.out.println("�� �ּ�: ");
		    String address = in.nextLine();
		    System.out.println("�� �׷�: ");
		    String group = in.nextLine();

		    // �� ��ü �����ؼ� ����
		    Addr newAddr = new Addr(name, phone, email, address, group);
		    editAddr(name, newAddr);
			break;
		case 6:
			System.out.println(">>���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default:
			System.out.println("�߸��Էµ� ��ȣ�Դϴ�.");
		}
		}
}
