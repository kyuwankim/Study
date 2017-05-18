package com.mdy.mybbs.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {
	// Ŭ������ �Ӽ��� ����, ��ɸ� �� �ִ� �͵��� Util ��Ű���� ����.
	// Util�� ���� �޼ҵ���� ��κ� public���� ����ȴ�.
	// Util�� ���� �޼ҵ��(util�� �޼ҵ�)�� static���� ����Ѵ�.
	public static void makeDirectoryIfNotExist(String dirPath){
		File dir = new File(dirPath);
		if(!dir.exists()){
			dir.mkdirs(); // �˻��� ��λ��� ��� ���丮�� �������ش�.
		}
	}
	
	public static File getFile(String path){
		File database = new File(path);
		if(!database.exists()){
			makeFile(database);
			database = new File(path);
		}
		return database;
	}
	
	public static void makeFile(File database){
		try {
			database.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static String readFileForCount(File database){
		String number = "";
		try {
		FileReader fr = new FileReader(database); // 1. �б����� ���� ���� �ȱ�(������)
		BufferedReader br = new BufferedReader(fr); // 2. ���� ����
		number = br.readLine(); // 3. ���ٸ� �о����
		fr.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return number;
	}
	
	public static void writeFileForCount(File database, long result){
		try {
		FileWriter fw = new FileWriter(database); 
		fw.write(result+"");
		fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}





