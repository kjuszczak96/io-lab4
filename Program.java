//Default Lamp Class
class Lamp {

  // instance variable
  private boolean isTurnedOn;

  // method
  public void turnOn() {
    isTurnedOn = true;
  }

  // method
  public void turnOff() {
  	isTurnedOn = false;
  }
  
  public boolean getStatus() {
	return isTurnedOn;
  }
}