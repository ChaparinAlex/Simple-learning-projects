package lab_2_7_1;

public class Monitor extends Device{
    private int resolutionX;
    private int resolutionY;
	
    public Monitor(String manufacturer, float price, String serialNumber,
    		int resolutionX, int resolutionY) {
    	super(manufacturer, price, serialNumber);
		this.resolutionX = resolutionX;
		this.resolutionY = resolutionY;
	}
    
    public Monitor() {
    	super();
		this.resolutionX = 0;
		this.resolutionY = 0;
	}
    
	public int getResolutionX() {
		return resolutionX;
	}
	public void setResolutionX(int resolutionX) {
		this.resolutionX = resolutionX;
	}
	public int getResolutionY() {
		return resolutionY;
	}
	public void setResolutionY(int resolutionY) {
		this.resolutionY = resolutionY;
	}
    
	 @Override
	public String toString(){
	return String.format("%s:%n manufacturer = %s%n price = %.1f%n "
		 + "serial number = %s%n X = %d%n Y = %d%n", getClass().getSimpleName(), 
		 getManufacturer(), getPrice(), getSerialNumber(), getResolutionX(), 
		 getResolutionY());
	   }
    
	 @Override
	   public boolean equals(Object o){
		   if (this == o) return true;
		   if (o == null || getClass()!=o.getClass())
			   return false;
		   Monitor m = (Monitor)o;
		   if (getManufacturer()!=m.getManufacturer()) return false;
		   if (getPrice()!=m.getPrice()) return false;
		   if (getSerialNumber()!=m.getSerialNumber()) return false;
		   if (resolutionX!=m.resolutionX) return false;
		   if (resolutionY!=m.resolutionY) return false;
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
		   result = 31*result + resolutionX;
		   result = 31*result + resolutionY;
		   return result;
	   }
}
