package intuition;

import java.io.FileReader;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class main {
	/*�����ܼ�*/
	private static HashMap<String, String> Character;
	/*�D�{��*/
	public static void main(String [] avgr)throws IOException {
		
		//�ϰ��ܼ�
		int a = 0;
		Character = new HashMap<String, String>();//�s�X������
		
		//�}��Ū���s�X�����
		File file = new File("src/test.txt");//Ū���ɮ�
		Scanner scfile = new Scanner(file);//�g�J�O����
		Scanner sc = new Scanner(System.in);//��J�ݤf�AŪ���ϥΪ̿�J���Ҧ�
		
		
		while(scfile.hasNext()){//Ū��S����Ƭ���
			String line = scfile.nextLine();//�H�欰���Ū��
			Scanner lineBreaker = new Scanner(line);//�v�ӱ��y����
			String domaincode = lineBreaker.next();
			String outprint = lineBreaker.next();
			String check="";
			if(!Character.isEmpty())
			{
				check = Character.get(domaincode);
				if(check.equals("null"))
					Character.put(domaincode, outprint);
			}

			System.out.print(domaincode);
			System.out.println(outprint);
		}
		
		//�����wŪ���s�X�����
		scfile.close();
		
		//main frame = new main();
		//frame.setVisible( true );//�}�ҵ���
		
		
		while(a>=0||sc.hasNextInt()){//�D�{���j��
			System.out.print(
					"/////////////////��ı��J�k/////////////////\n"
					+ "�п�J�Ʀr����Ҧ�:\n"
					+ "1.����Ҧ�\n"
					+ "2.�ϥμҦ�\n"
					+ "0.���}\n");
			a = sc.nextInt();
			switch(a){
				case 0:
					System.exit(0);
				case 1:
					System.out.println("Good");
					bijiao();
					break;
				case 2:
					System.out.println("Great");
					shiyong();
					break;
				default:
					System.out.println("error");
				System.out.println("�Ф��n��J����/�^��C");
			}
		}
	}
	
//	main(){/*�}�l�}�ҵ���*/
//        setSize(1024, 768);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        
//        // set the menubar
//        JMenuBar bar = new JMenuBar();
//        setJMenuBar(bar);
// 
//        // set a menu.
//        JMenu menuFile = new JMenu("�ɮ�");
//        bar.add(menuFile);
// 
//        // add sub menus.
//        menuFile.add(new JMenuItem("�ɮ׶}��"));
//        menuFile.add(new JMenuItem("�ɮ�����"));
//	}
	
	static void bijiao(){
		System.out.print(
				"/////////////////��ı��J�k/////////////////\n"
				+ "�z��ܤF����Ҧ�:\n");
	}
	static void shiyong(){
		System.out.print(
				"/////////////////��ı��J�k/////////////////\n"
				+ "��J'000'�Y�i���}"
				+ "�z��ܤF�ϥμҦ�:\n");
		Scanner user = new Scanner(System.in);//Ū���ϥΪ̪���r�s�X
		while(user.hasNext())
		{
			String temp = user.next();
			String output = Character.get(temp);
			System.out.print(output);
			if(temp.equals("000")) break;	
		}
		System.out.println("Good job,You got away!"); 
	}
}
