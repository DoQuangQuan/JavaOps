package dongvat;

public class cat extends animal {
    void run(){
        System.out.println("cat chay rat nhanh");
    }
    void eat(){
        System.out.println("cat an rat nhieu  ");
    }
 public static void main(String args[]){
    animal animal = new cat();
    animal.run();
    animal.eat();
 }
}