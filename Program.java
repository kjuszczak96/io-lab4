//Default Lamp Class
class Lamp {

  // instance variable
  private boolean isOn;

  // method
  public void turnOn() {
    isOn = true;
  }

  // method
  public void turnOff() {
  	isTurnedOn = false;
  }
  
  public boolean getStatus() {
	return isTurnedOn;
  }
}