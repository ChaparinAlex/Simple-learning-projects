package lab_2_7_1;

public class Device {
   private String manufacturer;
   private float price;
   private String serialNumber;
      
   public Device(String manufacturer, float price, String serialNumber) {
	this.manufacturer = manufacturer;
	this.price = price;
	this.serialNumber = serialNumber;
   }
   
   public Device(){
	 this.manufacturer = "HP";
	 this.price = 1000.0f;
	 this.serialNumber = "000000";
   }
   
   public String getManufacturer() {
	return manufacturer;
   }
   public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
   }
   public float getPrice() {
	return price;
   }
   public void setPrice(float price) {
	this.price = price;
   }
   public String getSerialNumber() {
	return serialNumber;
   }
   public void setSerialNumber(String serialNumber) {
	this.serialNumber = serialNumber;
   }
   
   @Override
   public String toString(){
	   return String.format("%s:%n manufacturer = %s%n price = %.1f%n "
	   		+ "serial number = %s%n", getClass().getSimpleName(), 
	   		getManufacturer(), getPrice(), getSerialNumber());
   }
   
   @Override
   public boolean equals(Object o){
	   if (this == o) return true;
	   if (o == null || getClass()!=o.getClass())
		   return false;
	   Device device = (Device)o;
	   if (manufacturer!=device.manufacturer) return false;
	   if (price!=device.price) return false;
	   if (serialNumber!=device.serialNumber) return false;
	   return true;
   }
   
   @Override
   public int hashCode(){
	   int result = 1;
	   result = 31*result + (manufacturer == null ? 0 : 
		   manufacturer.hashCode());
	   result = 31*result + (int)(price*100);
	   result = 31*result + (serialNumber == null ? 0 : 
		   serialNumber.hashCode());
	   return result;
   }
}
