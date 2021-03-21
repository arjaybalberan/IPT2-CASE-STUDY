/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodies;

/**
 *
 * @author lenovoUNIT
 */
public class Foodies {

   public static void main(String[] args) {
        Tuna obj1 = new Tuna();
        obj1.Met1();
        Potpie obj2 = new Potpie();
        obj2.Met2();
        Apples obj3 = new Apples();
        obj3.Met3();
    }
}
class Tuna extends Foodies{
    public void Met1(){
        System.out.println("Tuna is Yummy");
    }
}
class Potpie extends Foodies{
    public void Met2(){
        System.out.println("Potpie is Amazing");
    }
}
class Apples extends Foodies{
    public void Met3(){
        System.out.println("Apple is Healthy");
    }
}