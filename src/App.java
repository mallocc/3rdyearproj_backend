import java.io.IOException;
import java.util.Random;

public class App
{

	public static void main(String[] args) throws IOException
	{
		Controller con = new Controller("database.csv");
		con.scanProduct();
	}

}
