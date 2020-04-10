package 复制文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) throws IOException {
File file=new File("C:\\Users\\Administrator\\Desktop\\胡志伟 简历.doc");
FileInputStream fileInputStream=new FileInputStream(file);
File file2=new File("F:\\简历.doc");
FileOutputStream fileOutputStream=new FileOutputStream(file2);
byte [] b=new byte[1024];
int len=0;

while((len=fileInputStream.read(b))!=-1){
	fileOutputStream.write(b, 0, len);
}
fileOutputStream.close();
fileInputStream.close();
	}

}
