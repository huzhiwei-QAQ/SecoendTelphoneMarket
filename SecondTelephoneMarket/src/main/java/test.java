import org.apache.shiro.crypto.hash.SimpleHash;

public class test {
public static void main(String[] args) {
	Object hashedCredentials = new SimpleHash("MD5", "123456", "王八", 1024);
	System.out.println(hashedCredentials);
}
}
