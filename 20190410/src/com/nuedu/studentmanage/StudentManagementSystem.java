package com.nuedu.studentmanage;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManagementSystem {

	public static void main(String[] args) {
		String[] student = new String[8];

		System.out.println("-----------��ӭ��½ѧ����Ϣ����ϵͳ--------------");
		System.out.println("           1. ��½                   2.�˳�                                ");
		System.out.println("-------------------------------------------");

		Scanner sca = new Scanner(System.in);
		System.out.print("��ѡ��");
		System.out.println();
		int select = sca.nextInt();

		if (select == 1) {

			System.out.println("��ӭ��½!");

			System.out.print("�������û���:");
			String username = sca.next();
			System.out.print("����������:");
			String password = sca.next();

			System.out.println("��¼�ɹ�");
			System.out.println("��ӭ��," + username);

			while (true) {
				System.out.println("***************��ѡ��Ҫ��������Ϣ��Ӧ����***************");
				System.out.println("*  1.�鿴ѧ����Ϣ   2.���ѧ����Ϣ   3.ɾ��ѧ����Ϣ   4.�޸�ѧ����Ϣ   5.�˳�");
				System.out.println("***************��ѡ��Ҫ��������Ϣ��Ӧ����***************");
				System.out.print("�����������Ӧ���:");
				int operationNum = sca.nextInt();

				// ��Ӧ������ŵ���Ϣ
				if (operationNum == 1) {
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println("+  1.�鿴����ѧ����Ϣ   2.����IDѧ����Ϣ   3.����ID��ѯѧ������   4.������һ��             +");
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					
					System.out.println("��ѡ��˵�:");
					int select02 = sca.nextInt();
					
					if(select02 == 2) {
						System.out.println("������Ҫ��ѯ��ID:");
						int select03 = sca.nextInt();
						System.out.println("-----------------------------------����ѧ����Ϣ-----------------------------------");
						System.out.println("|ѧ��\t|����\t|����\t|�Ա� \t|�꼶\t|�绰\t\t|��ϵ��ʽ\t|����");
						System.out.println("-------------------------------------------------------------------------------");
						System.out.println(student[0]+"\t"+student[1]+"\t"+student[2]+"\t"+
						student[3]+"\t"+student[4]+"\t"+student[5]+"\t"+student[6]+"\t"+student[7]);
						System.out.println("-------------------------------------------------------------------------------");
						System.out.println("���ݲ�ѯ�ɹ�,ϵͳ���Զ������ϲ�Ŀ¼");
						continue;
					}else {
						continue;
					}
				
				} else if (operationNum == 2) {
					// ���ѧ����Ϣ
					System.out.print("������ѧ��id:");
					String id = sca.next();
					student[0] = id;
					
					System.out.print("������ѧ������:");
					String sname = sca.next();
					student[1] = sname;
					
					System.out.print("������ѧ������:");
					String age = sca.next();
					student[2] = age;
					System.out.print("������ѧ���Ա�:");
					String sex = sca.next();
					student[3] = sex;
					System.out.print("������ѧ���꼶:");
					String grade = sca.next();
					student[4] = grade;
					System.out.print("������ѧ����ַ:");
					String adress = sca.next();
					student[5] = adress;
					System.out.print("������ѧ����ϵ��ʽ:");
					String phone = sca.next();
					student[6] = phone;
					System.out.print("������ѧ������:");
					String email = sca.next();
					student[7] = email;

					System.out.println("���ݱ���ɹ�,ϵͳ���Զ������ϲ�Ŀ¼");
					continue;

				} else if (operationNum == 3) {
					
					//ɾ������
					
					
				} else if (operationNum == 4) {

					//�޸Ĺ���
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println("+  1.����ID�޸�ѧ��ȫ����Ϣ   2.����ID�޸�ѧ��������Ϣ   3.�����ϼ�Ŀ¼   4.ϵͳ�Ƴ�   +");
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					
					System.out.println("��ѡ��˵�:");
					int select01 = sca.nextInt();
					
					if(select01 == 2) {
						System.out.println("������Ҫ�޸ĵ�ID:");
						int select02 = sca.nextInt();
						
						System.out.println("������Ҫ�޸ĵ�����:");
						String select03 = sca.next();
						System.out.println("�������޸ĺ������:");
						String select04 = sca.next();
						
						if(select03.equals("age")) {
							student[2] = select04;
							continue;
						}
						
					}else if(select01 == 4) {
						return;
					}else {
						continue;
					}
					
				} else if (operationNum == 5) {
					System.out.println("��ӭ�´�����!!");
					continue;
				} else {
					System.out.println("�����������Ƿ�,�˳�!!");
					continue;
				}
				
			}
		} else {
			System.out.println("��ӭ�´�����!!");
			return;
		}

	}
}
