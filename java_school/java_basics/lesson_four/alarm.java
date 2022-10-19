/**
* makes a single beep sound
*/
public void beep()
  
  
/**
* @return true if alaram is on, false if off
*/
  public boolean checkAlarm()
  
 /**
* keep beeping until snoozed
*/
public void alarm() {
  boolean on = checkAlarm();
  while(on) {
    beep();
    on = checkAlarm();
  }
}

public void raiseAlarm(int numOfWarings) {

}
