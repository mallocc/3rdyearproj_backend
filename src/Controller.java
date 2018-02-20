
public class Controller
{
	private Model model;
	private BarcodeReader reader;
	private Cloud cloud;
	private ScalesDevice scales;
	
	Controller(String databasePath)
	{
		model = new Model(databasePath);
		reader = new BarcodeReader();
		cloud = new Cloud();
		scales = new ScalesDevice();
	}
	
	void scanProduct()
	{
		String barcode = reader.scanBarcode();	
		Product p = null;
		if(!model.productExists(barcode))
			model.addProduct(p = cloud.findProduct(barcode));
		else
			p = model.getProductBarcode(barcode);
		if(p == null)
			throw new RuntimeException("Couldn't load product.");
		model.setCurrentProduct(p);
	}
	
	Product getProductBarcode(String barcode)
	{
		return model.getProductBarcode(barcode);
	}
	Product getProductName(String name)
	{
		return model.getProductName(name);
	}
	
	
	
	
	
	boolean resetWeight()
	{
		return scales.reset();
	}
	
	float getCurrentWeight()
	{
		return scales.getCurrentWeight();
	}
	
	boolean disconnectScales()
	{
		return scales.disconnect();
	}
	
	boolean powerOff()
	{
		return scales.powerOff();
	}
	
	
}
