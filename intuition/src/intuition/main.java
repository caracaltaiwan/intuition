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
	/*全域變數*/
	private static HashMap<String, String> Character;
	/*主程式*/
	public static void main(String [] avgr)throws IOException {
		
		//區域變數
		int a = 0;
		Character = new HashMap<String, String>();//編碼對應表
		
		//開啟讀取編碼的文件
		File file = new File("src/test.txt");//讀取檔案
		Scanner scfile = new Scanner(file);//寫入記憶體
		Scanner sc = new Scanner(System.in);//輸入端口，讀取使用者輸入的模式
		
		
		while(scfile.hasNext()){//讀到沒有資料為止
			String line = scfile.nextLine();//以行為單位讀取
			Scanner lineBreaker = new Scanner(line);//逐個掃描項目
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
		
		//關閉已讀取編碼的文件
		scfile.close();
		
		//main frame = new main();
		//frame.setVisible( true );//開啟視窗
		
		
		while(a>=0||sc.hasNextInt()){//主程式迴圈
			System.out.print(
					"/////////////////直覺輸入法/////////////////\n"
					+ "請輸入數字選取模式:\n"
					+ "1.比較模式\n"
					+ "2.使用模式\n"
					+ "0.離開\n");
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
				System.out.println("請不要輸入中文/英文。");
			}
		}
	}
	
//	main(){/*開始開啟視窗*/
//        setSize(1024, 768);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        
//        // set the menubar
//        JMenuBar bar = new JMenuBar();
//        setJMenuBar(bar);
// 
//        // set a menu.
//        JMenu menuFile = new JMenu("檔案");
//        bar.add(menuFile);
// 
//        // add sub menus.
//        menuFile.add(new JMenuItem("檔案開啟"));
//        menuFile.add(new JMenuItem("檔案關閉"));
//	}
	
	static void bijiao(){
		System.out.print(
				"/////////////////直覺輸入法/////////////////\n"
				+ "您選擇了比較模式:\n");
	}
	static void shiyong(){
		System.out.print(
				"/////////////////直覺輸入法/////////////////\n"
				+ "輸入'000'即可離開"
				+ "您選擇了使用模式:\n");
		Scanner user = new Scanner(System.in);//讀取使用者的選字編碼
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
