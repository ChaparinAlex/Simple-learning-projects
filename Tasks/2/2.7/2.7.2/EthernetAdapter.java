package lab_2_7_1;

public class EthernetAdapter extends Device{
	private int speed;
	private String mac;
	
	public EthernetAdapter(String manufacturer, float price, 
			String serialNumber, int speed, String mac) {
		super(manufacturer, price, serialNumber);
		this.speed = speed;
		this.mac = mac;
	}
	
	public EthernetAdapter() {
		super();
		this.speed = 0;
		this.mac = "00:00";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	 @Override
	public String toString(){
	  return String.format("%s:%n manufacturer = %s%n price = %.1f%n "
	  + "serial number = %s%n speed = %d%n MAC = %s%n", getClass().getSimpleName(), 
	  getManufacturer(), getPrice(), getSerialNumber(), getSpeed(), getMac());
    }
	 
	 @Override
	   public boolean equals(Object o){
		   if (this == o) return true;
		   if (o == null || getClass()!=o.getClass())
			   return false;
		   EthernetAdapter eA = (EthernetAdapter)o;
		   if (getManufacturer()!=eA.getManufacturer()) return false;
		   if (getPrice()!=eA.getPrice()) return false;
		   if (getSerialNumber()!=eA.getSerialNumber()) return false;
		   if (speed!=eA.speed) return false;
		   if (mac!=eA.mac) return false;
		   return true;
	   }
	 
	 @Override
	   public int hashCode(){
		   int result = 1;
		   result = 31*result + (getManufacturer() == null ? 0 : 
			   getManufacturer().hashCode());
		   result = 31*result + (int)(getPrice()*100);
		   result = 31*result + (getSerialNumber() == null ? 0 : 
			   getSerialNumber().hashCode());
		   result = 31*result + speed;
		   result = 31*result + (mac == null ? 0 : mac.hashCode());
		   return result;
	   }
}
