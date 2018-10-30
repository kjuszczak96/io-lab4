class Lamp {

  // instance variable
  private boolean isOn;

  // method
  public void turnOn() {
    isOn = true;
  }

  // method
  public void turnOff() {
  	isOn = false;
  }
  
  public boolean getStatus() {
	return isOn;
  }
}