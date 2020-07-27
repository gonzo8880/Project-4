import java.io.File;
import java.io.IOException;

public class CreateFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}

MyClass.java public class MyClass {
  int x = 6;
  public static void main(String[] args) {
    Level myVar = Level.MEDUIM;
    System.out.println(myVar);
  }

  public static void main(String[] args) {
    MyClass  myObj = new MyClass();
    System.out.println(myObj.x);
  }
}

public class MyClass {
  int x = 7;

  public static void main(String[] args) {
    MyClass myObj1 = new MyClass(History);
    MyClass myObj2 = new MyClass(English);
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}

class Fruit {
  private String brand = "Watermelon";
  public void taste() {
    System.out.println("Sweet,Juicy!);
  }
}

class Flavor extends Fruit {
  private String Fruit name = "Orange";
  public static void main(String[] args) {
    Flavor mySweetFlavor = new Flavor();
    mySweetFlavor.taste();
    System.out.println(mySweetFlavor.brand + ""+mySweetFlavor.modelName);
  }
}

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Tiger extends Animal {
  public void animalSound() {
    System.out.println("The Tiger says: Roar");
  }
}

class Wolf extends Animal {
  public void animalSound() {
    System.out.println("The Wolf says: Howl");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myTiger = new Tiger();
    Animal myWolf = new Wolf();

    myAnimal.animalSound();
    myTiger.animalSound();
    myWolf.animalSound();
  }
}

