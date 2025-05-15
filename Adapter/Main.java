package Adapter;

public class Main {
    public static void main(String[] args) {
        MicroUSBDevice microUSBDevice = new MicroUSBDevice();
        USB usbConnection = new MicroUSBToUSBAdapter(microUSBDevice);

        usbConnection.connectWithUSB();
    }
}

interface  USB{
    void connectWithUSB();
}

class MicroUSBDevice {
    void connectWithMicroUSB() {
        System.out.println("Connected via MicroUSB");
    }
}

class MicroUSBToUSBAdapter implements USB {
    MicroUSBDevice device;

    MicroUSBToUSBAdapter(MicroUSBDevice device) {
        this.device = device;
    }

    public void connectWithUSB() {
        device.connectWithMicroUSB();
    }
}
