package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{


    public DVD(String title) {
        super(4000, 1600, title);
    }

    @Override
    public Boolean isFull() {
        if (this.readData().length()>= this.getStorageCapacity()) return true;
        else return false;
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at " + this.getSpinSpeed() + "rpm.");
    }

    @Override
    public void storeData(String data) {
        this.writeData(data);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
