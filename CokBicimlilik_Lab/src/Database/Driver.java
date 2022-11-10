package Database;
import java.util.*;

public class Driver {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	 
	 DataBaseConnection db = null;
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Lütfen Veri Tabanı Tipini Seçin : [1-(MsSQL) -- 2-(MySQL) -- 3-(Oracle)] :");
	 int dBtype = scanner.nextInt();
	 System.out.println(dBtype);
	 
	switch (dBtype) {
	case 1: {
		db = new MsSQLConnection();
		break;
			
	}
	case 2: {
		db = new MySQLConnection();
		break;
	}
	case 3: {
		db = new Oracle();
		break;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + dBtype);
	}
	if(db != null) {
		db.DbOpen();
		db.executeQuery("Delete  from product");
		db.DbClose();  
	}
	
}
}
