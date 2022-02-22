package com.almazan.Section9.Interface.Phone;

public class Phone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public Phone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("No action taken, Phone is powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) System.out.println("Now ringing " + phoneNumber + " on Phone");
        else System.out.println("Phone is switch off");
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
