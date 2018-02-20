
public class NutritionTable {

	int energy;
	float fat, sats, sugars, fibre, protein, salt;
	
	public NutritionTable(int energy, float fat, float sats, float sugars, float fibre, float protein, float salt)
	{
		this.energy = energy;
		this.fat = fat;
		this.sats = sats;
		this.sugars = sugars;
		this.fibre = fibre;
		this.protein = protein;
		this.salt = salt;
	}
	
	public int getEnergy()
	{
		return energy;
	}
	public float getFat()
	{
		return fat;
	}
	public float getSats()
	{
		return sats;
	}
	public float getSugars()
	{
		return sugars;
	}
	public float getFibre()
	{
		return fibre;
	}
	public float getProtein()
	{
		return protein;
	}
	public float getSalt()
	{
		return salt;
	}
	
	public String toString()
	{
		return    "\n --Nutrition (per 100g): " 
				+ "\n   -Energy  = " + energy + " kcal"
				+ "\n   -Fat     = " + fat + " g"
				+ "\n   -Sats    = " + sats + " g"
				+ "\n   -Sugars  = " + sugars + " g"
				+ "\n   -Fibre   = " + fibre + " g"
				+ "\n   -Protein = " + protein + " g"
				+ "\n   -Salt    = " + salt + " g";
	}
	
	public String toCSV()
	{
		char delim = ',';
		return "" + energy + delim + fat + delim + sats + delim + sugars + delim + fibre + delim + protein + delim + salt;
	}
	
}
