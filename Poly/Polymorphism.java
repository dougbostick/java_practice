package Poly;

class Bird {
  public void sing(){
    System.out.println("tweet");
  }
  // public void sing(int num){
  //   for(int i = 0; i < num; i++){
  //     System.out.println(i + " robin tweet");
  //   }
  // }
}

class Robin extends Bird {
  public void sing(int num){
    for(int i = 0; i < num; i++){
      System.out.println(i + " robin tweet");
    }
  }
  public void sing(){
    System.out.println("robin tweet");
  }
}

class Pelican extends Bird {
  public void sing(){
    System.out.println("pelican tweet");
  }
  public void sing(int num){
    for(int i = 0; i < num; i++){
      System.out.println(i + " pelican tweet");
    }
  }
}

public class Polymorphism {
  public static void main(String[] args){
    Pelican b = new Pelican();
    b.sing(3);
  }
}


//polymorphism
//overloading: same method name, but different parameters 
//overwriting: is the concept of overwriting a class method with a subclass method