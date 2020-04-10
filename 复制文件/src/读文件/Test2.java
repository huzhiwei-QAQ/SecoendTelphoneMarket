package 读文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {
		File file=new File("F:\\新建文本文档.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		int len=0;
		byte [] bs=new byte[1024];
		while((len=fileInputStream.read(bs))!=-1){
			System.out.println(new String(bs,0,len));
		}
		fileInputStream.close();
	}

}
