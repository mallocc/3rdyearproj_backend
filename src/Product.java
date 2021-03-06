import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Product
{
	String name;
	String description;
	NutritionTable nutrition;
	String barcode;
	String tpnc, gtin;

	Product(String name, String barcode, NutritionTable nutrition)
	{
		this.name = name;
		this.barcode = barcode;
		this.nutrition = nutrition;
	}
	Product(String name, String tpnc, String gtin, NutritionTable nutrition)
	{
		this.name = name;
		this.tpnc = tpnc;
		this.gtin = gtin;
		this.nutrition = nutrition;
	}

	public String getBarcode()
	{
		return barcode;
	}

	public String getName()
	{
		return name;
	}
	
	public void setNutrition(NutritionTable table)
	{
		this.nutrition = table;
	}
	public NutritionTable getNutrition()
	{
		return nutrition;
	}

	public static Product CSV2Product(String line)
	{
		BufferedReader br = null;
		String delim = ",";
		String[] record = line.split(delim);

		NutritionTable t = new NutritionTable(Integer.parseInt(record[2]), Float.parseFloat(record[3]),
				Float.parseFloat(record[4]), Float.parseFloat(record[5]), Float.parseFloat(record[6]),
				Float.parseFloat(record[7]), Float.parseFloat(record[8]));
		Product p = new Product(record[1], record[0], t);

		return p;
	}
	
	public String toString()
	{
		return    "-Product: "
				+ "\n -GTIN:    " + gtin
				+ "\n -TPNC:    " + tpnc
				+ "\n -name:    " + name
				+ (nutrition != null ? nutrition.toString() : "\nNo nutrition.");
	}
	
	public String toCSV()
	{
		char delim = ',';
		return barcode + delim + name + delim + nutrition.toCSV();
	}
}
