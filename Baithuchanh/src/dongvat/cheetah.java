package dongvat;

public class cheetah implements Animals {
  public  void run(){
        System.out.println("cheetah chay rat nhanh ");
    }
   public void eat(){
        System.out.println("cheetah an rat khoe ");
    }
    public static void main(String[] args) {
        Animals animals = new cheetah();
        animals.run();
        animals.eat();

    }
}
