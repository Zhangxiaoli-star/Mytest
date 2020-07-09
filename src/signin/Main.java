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
		System.out.println("添加信息成功");
		Scanner sc = new Scanner(System.in);
		String s = new String(
				"------------员工打卡系統-------------\n" + "输入0----------------退出\n" + "输入1----------------签到 \n"
						+ "输入2----------------签退\n" + "输入3----------------查看签到信息\n" + "请输入想执行的操作：");
		System.out.println(s);
		while (sc.hasNext()) {
			int choice = sc.nextInt();
			if (choice == 0) {
				System.out.println("退出");
				break;
			} else if (choice == 1) {
				System.out.println("请输入签到员工ID：");
				int choice1 = sc.nextInt();
				if (com.searchMember(choice1) == true) {
					if (com.sign.containsKey(choice1) == false) {
						System.out.println("卡号：" + choice1 + "打卡成功");
						com.sign.put(choice1, new DakaInfo(choice1, new Date(), null));
					} else {
						System.out.println("今天已经打过卡了");
					}
					System.out.println(s);
				}
			} else if (choice == 2) {
				System.out.println("请输入签退员工ID：");
				int choice2 = sc.nextInt();
				if (com.searchMember(choice2) == true) {
					if (com.sign.containsKey(choice2) == true) {
						System.out.println("卡号：" + choice2 + "签退成功");
						com.sign.get(choice2).setExitdate(new Date());
						com.sign.put(choice2, com.sign.get(choice2));
					} else {
						System.out.println("卡号：" + choice2 + "今天还没有签到，无法签退");
					}
					System.out.println(s);
				}
			} else if (choice == 3) {
			    Set s2 = com.sign.keySet();
				Iterator<Integer> it2=s2.iterator();
				System.out.println("签到信息如下：");
				while(it2.hasNext()) {
					int choice3= it2.next();
				System.out.println("[name="+com.staff.get(choice3)+com.sign.get(choice3).toString());
				}
				System.out.println(s);
			}
		}
	}

}
