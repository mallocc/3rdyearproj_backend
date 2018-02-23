
public class NutritionTable
{
	float energy, fat, sats, sugars, fibre, protein, salt, carbs;

	public NutritionTable()
	{
		
	}
	
	public NutritionTable(float energy, float fat, float sats, float sugars, float fibre, float protein, float salt)
	{
		this.energy = energy;
		this.fat = fat;
		this.sats = sats;
		this.sugars = sugars;
		this.fibre = fibre;
		this.protein = protein;
		this.salt = salt;
	}

	public float getCarbs()
	{
		return carbs;
	}

	public void setCarbs(float carbs)
	{
		this.carbs = carbs;
	}

	public void setEnergy(int energy)
	{
		this.energy = energy;
	}

	public void setFat(float fat)
	{
		this.fat = fat;
	}

	public void setSats(float sats)
	{
		this.sats = sats;
	}

	public void setSugars(float sugars)
	{
		this.sugars = sugars;
	}

	public void setFibre(float fibre)
	{
		this.fibre = fibre;
	}

	public void setProtein(float protein)
	{
		this.protein = protein;
	}

	public void setSalt(float salt)
	{
		this.salt = salt;
	}

	public float getEnergy()
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
		return "\n --Nutrition (per 100g): " + "\n   -Energy  = " + energy + " kcal" + "\n   -Fat     = " + fat + " g"
				+ "\n   -Sats    = " + sats + " g" + "\n   -Sugars  = " + sugars + " g" + "\n   -Fibre   = " + fibre
				+ " g" + "\n   -Protein = " + protein + " g" + "\n   -Salt    = " + salt + " g" + "\n   -Carbs   = " + carbs + " g";
	}

	public String toCSV()
	{
		char delim = ',';
		return "" + energy + delim + fat + delim + sats + delim + sugars + delim + fibre + delim + protein + delim
				+ salt;
	}

}
