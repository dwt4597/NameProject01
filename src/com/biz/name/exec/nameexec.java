package com.biz.name.exec;

import com.biz.name.service.*;

public class nameexec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strname = "src/com/biz/name/이름리스트.txt";
		String strsung = "src/com/biz/name/한국인성씨.txt";
		String strsave = "src/com/biz/name/한국인이름리스트.txt";
		String[] files = {strname, strsung, strsave};
		nameService ns = new nameService(files);
		ns.sungssiread();
		ns.nameread();
		ns.view();
	}

}
