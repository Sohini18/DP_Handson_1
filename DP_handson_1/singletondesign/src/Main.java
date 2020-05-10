
public class Main {
	public static void main(String[] args) {
		DBConn dBConn1 = DBConn.getInstance();
		System.out.println(dBConn1);
		DBConn dBConn2 = DBConn.getInstance();
		System.out.println(dBConn2);
	}
}
