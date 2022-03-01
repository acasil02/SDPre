public class Objective3Lab2 {
  public static void main(String[] args){
    double side1, side2, hypotenuse;

    side1 = 3;
    side2 = 6;

    hypotenuse = ((side1 * side1) + (side2 * side2));
    double result = Math.sqrt(hypotenuse);

    System.out.println("The hypotenuse of a triangle with sides" + " 3.0 and 6.0 is " + result);


  }
}
