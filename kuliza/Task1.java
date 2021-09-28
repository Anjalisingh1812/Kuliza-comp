1.public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
    myMethod();
    myMethod();
  }
}

2.class Bicycle {

  // state or field
  private int gear = 5;

  // behavior or method
  public void braking() {
    System.out.println("Working of Braking");
  }
}
3.class Lamp {
  boolean isOn;


  void turnOn() {
    isOn = true;
    System.out.println("Light on? " + isOn);

  }


  void turnOff() {
    isOn = false;
    System.out.println("Light on? " + isOn);
  }
}

4.class Main {
  public static void main(String[] args) {

    Lamp led = new Lamp();
    Lamp halogen = new Lamp();


    led.turnOn();

    halogen.turnOff();
  }
}
