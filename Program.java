class Lamp {

  // instance variable
  private boolean isTurnedOn;

  // method
  public void turnOn() {
    isTurnedOn = true;
  }

  // method
  public void turnOff() {
  	isOn = false;
  }
  
  public boolean getStatus() {
	return isOn;
  }
}