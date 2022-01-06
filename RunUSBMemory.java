package test.consructor1;

public class RunUSBMemory {

	public static void main(String[] args) {
		USBMemory usb1 = new USBMemory(64,"BLACK & SILVER");
		USBMemory usb2 = new USBMemory(64,"RED");
		
		usb1.writeUSBMemory();
		usb1.readUSBMemory();
		
		System.out.println("------------------------------");
		
		usb2.readUSBMemory();
		

	}

}
