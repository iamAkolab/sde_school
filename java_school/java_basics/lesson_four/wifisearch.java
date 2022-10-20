/**
* WiFi Search
*/

public void searchWifi() {
  for (int i = 1; i <= 10; i++) {
  boolean wifiAvailable = checkWifi();
  if (wifiAvailable){
    System.out.println("Wifi found");
    break;
    }
  }

}
