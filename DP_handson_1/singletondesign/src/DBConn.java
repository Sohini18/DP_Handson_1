
public class DBConn {
	private static final DBConn instance = new DBConn();

	private DBConn() {
	}

	public static DBConn getInstance() {
		return instance;

	}
}
