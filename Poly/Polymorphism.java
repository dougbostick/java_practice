package Poly;

class Bird {
  public void sing(){
    System.out.println("tweet");
  }
}

class Robin extends Bird {
  public void sing(){
    System.out.println("robin tweet");
  }
}

class Pelican extends Bird {
  public void sing(){
    System.out.println("pelican tweet");
  }
}

public class Polymorphism {
  public static void main(String[] args){
    Bird b = new Bird();
    b.sing();
  }
}


//polymorphism is the concept of overwriting a class method with a subclass method