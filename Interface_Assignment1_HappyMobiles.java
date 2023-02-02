package dxc;

interface Testable
{
	public boolean testCompatibility();
	
}
class Mobile
{
	private String name;
	private String brand;
	static private String OperatingSystemName;
	private String OperatingSystemBrand;
	public Mobile(String name, String brand, String operatingSystemName,
			String operatingSystemBrand) 
	{
		super();
		this.name = name;
		this.brand = brand;
		OperatingSystemName = operatingSystemName;
		OperatingSystemBrand = operatingSystemBrand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOperatingSystemName() {
		return OperatingSystemName;
	}
	public void setOperatingSystemName(String operatingSystemName) {
		OperatingSystemName = operatingSystemName;
	}
	public String getOperatingSystemBrand() {
		return OperatingSystemBrand;
	}
	public void setOperatingSystemBrand(String operatingSystemBrand) {
		OperatingSystemBrand = operatingSystemBrand;
	}
	
	
}
class SmartPhone extends Mobile implements Testable
{
	private String networkGeneration;
	
	public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemBrand,
			String networkGeneration)
	{
		super(name, brand, operatingSystemName, operatingSystemBrand);
		this.networkGeneration = networkGeneration;
	}

	public String getNetworkGeneration() {
		return networkGeneration;
	}

	public void setNetworkGeneration(String networkGeneration) {
		this.networkGeneration = networkGeneration;
	}
	public boolean testCompatibility()
	
	{
		if(super.getOperatingSystemName().equalsIgnoreCase("Saturn"))
		{
				if(getNetworkGeneration().equalsIgnoreCase("3G"))
				{
					if(super.getOperatingSystemBrand()=="1.1" ||
							(super.getOperatingSystemBrand()=="1.2") ||
									(super.getOperatingSystemBrand()=="1.3"))
					{
						return true;
					}
				}
				else if(getNetworkGeneration().equalsIgnoreCase("4G"))
				{
					if(super.getOperatingSystemBrand()=="1.2" ||
									(super.getOperatingSystemBrand()=="1.3"))
					{
						return true;
					}
				}
				else if(getNetworkGeneration().equalsIgnoreCase("5G"))
				{
					if(super.getOperatingSystemBrand()=="1.3")
					{
						return true;
					}
				}
				
		}
		else if(super.getOperatingSystemName().equalsIgnoreCase("Gora"))
		{
			if(getNetworkGeneration().equalsIgnoreCase("3G"))
			{
				if(super.getOperatingSystemBrand()=="EXRT.1" ||
						(super.getOperatingSystemBrand()=="EXRT.2") ||
								(super.getOperatingSystemBrand()=="EXRU.1"))
				{
					return true;
				}
			}
			else if(getNetworkGeneration().equalsIgnoreCase("4G"))
			{
				if(super.getOperatingSystemBrand()=="EXRT.2" ||
								(super.getOperatingSystemBrand()=="EXRU.1"))
				{
					return true;
				}
			}
			else if(getNetworkGeneration().equalsIgnoreCase("5G"))
			{
				if(super.getOperatingSystemBrand()=="EXRU.1")
				{
					return true;
				}
			}
		}
		else 
			return false;
		return false;
	}
	
}
public class Interface_Assignment1_HappyMobiles
{

	public static void main(String[] args) 
	{
		SmartPhone smartPhone = new SmartPhone
				("KrillinM20", "Nebula", "Saturn", "1.3","5G");
		if(smartPhone.testCompatibility())
			System.out.println("The mobile OS is compatible with the network generation!");
		else
			System.out.println("The mobile OS is not compatible with the network generation!");
		
		
		SmartPhone smartPhone1 = new SmartPhone
				("FriezaA8", "Quasar", "Gara", "EXRT.1","4G");
		if(smartPhone1.testCompatibility())
			System.out.println("The mobile OS is compatible with the network generation!");
		else
			System.out.println("The mobile OS is not compatible with the network generation!");

		
	}

}
