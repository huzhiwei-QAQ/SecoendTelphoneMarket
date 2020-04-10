package 写文件;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
public static void main(String[] args) throws IOException {
	String string="计费计费打发打发士大夫点了 ";
	File file=new File("F:\\新建文本文档.txt");
	FileOutputStream fileOutputStream=new FileOutputStream(file);
	byte [] bs=string.getBytes();
	fileOutputStream.write(bs, 0, bs.length);
	fileOutputStream.close();
}
}
