package signin;

import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Company com = new Company();
		com.addMember(new Employee(001, "Andy"));
		com.addMember(new Employee(002, "Mike"));
		com.addMember(new Employee(003, "Lily"));
		System.out.println("�����Ϣ�ɹ�");
		Scanner sc = new Scanner(System.in);
		String s = new String(
				"------------Ա����ϵ�y-------------\n" + "����0----------------�˳�\n" + "����1----------------ǩ�� \n"
						+ "����2----------------ǩ��\n" + "����3----------------�鿴ǩ����Ϣ\n" + "��������ִ�еĲ�����");
		System.out.println(s);
		while (sc.hasNext()) {
			int choice = sc.nextInt();
			if (choice == 0) {
				System.out.println("�˳�");
				break;
			} else if (choice == 1) {
				System.out.println("������ǩ��Ա��ID��");
				int choice1 = sc.nextInt();
				if (com.searchMember(choice1) == true) {
					if (com.sign.containsKey(choice1) == false) {
						System.out.println("���ţ�" + choice1 + "�򿨳ɹ�");
						com.sign.put(choice1, new DakaInfo(choice1, new Date(), null));
					} else {
						System.out.println("�����Ѿ��������");
					}
					System.out.println(s);
				}
			} else if (choice == 2) {
				System.out.println("������ǩ��Ա��ID��");
				int choice2 = sc.nextInt();
				if (com.searchMember(choice2) == true) {
					if (com.sign.containsKey(choice2) == true) {
						System.out.println("���ţ�" + choice2 + "ǩ�˳ɹ�");
						com.sign.get(choice2).setExitdate(new Date());
						com.sign.put(choice2, com.sign.get(choice2));
					} else {
						System.out.println("���ţ�" + choice2 + "���컹û��ǩ�����޷�ǩ��");
					}
					System.out.println(s);
				}
			} else if (choice == 3) {
			    Set s2 = com.sign.keySet();
				Iterator<Integer> it2=s2.iterator();
				System.out.println("ǩ����Ϣ���£�");
				while(it2.hasNext()) {
					int choice3= it2.next();
				System.out.println("[name="+com.staff.get(choice3)+com.sign.get(choice3).toString());
				}
				System.out.println(s);
			}
		}
	}

}
