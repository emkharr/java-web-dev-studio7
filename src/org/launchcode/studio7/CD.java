package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    public CD() {
        super(700 , 500);
    }

    @Override
    public Boolean isFull() {
        if (this.readData().length()>= this.getStorageCapacity()) return true;
        else return false;
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at " + this.getSpinSpeed() + "rpm.");
    }

    @Override
    public void storeData(String data) {
        this.writeData(data);
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
