package com.biz.name.service;

import java.io.*;
import java.util.*;

import com.biz.name.vo.*;

public class nameService {
	List<nameVO> nameList;
	List<nameVO> sungList;

	String strname;
	String strsung;
	String save;

	public nameService(String[] a) {
		nameList = new ArrayList();
		sungList = new ArrayList();

		strname = a[0];
		strsung = a[1];
		save = a[2];
	}

	public void view() {
		FileWriter fw;
		PrintWriter pw;
		try {

			pw = new PrintWriter(save);
			nameVO vo = new nameVO();

			for(int i = 0; i < nameList.size(); i++) {
				int a = (int) (Math.random() * (100));
				pw.print(sungList.get(a).getSung()+nameList.get(a).getName()+"\n");
			}
			
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void nameread() {
		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(strname);
			buffer = new BufferedReader(fr);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break;
			
				nameVO vo = new nameVO();
				vo.setName(reader);
				nameList.add(vo);

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void sungssiread() {
		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(strsung);
			buffer = new BufferedReader(fr);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break;
				String[] sung = reader.split(":");
				nameVO vo = new nameVO();
				vo.setSung(sung[1]);
				sungList.add(vo);

			}
			buffer.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
