import java.util.Random;

public class Cloud
{
	public Product findProduct(String barcode)
	{
		Random r = new Random();
		return new Product(
				"product name" + r.nextInt(100), 
				barcode, 
				generateNutritionTable()
				);
	}
	
	private NutritionTable generateNutritionTable()
	{
		Random r = new Random();
		return new NutritionTable(
				r.nextInt(9999),
				r.nextFloat(),
				r.nextFloat(),
				r.nextFloat(),
				r.nextFloat(),
				r.nextFloat(),
				r.nextFloat()
				);
	}
}
