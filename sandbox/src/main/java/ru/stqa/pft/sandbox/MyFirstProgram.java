package ru.stqa.pft.sandbox;

public class MyFirstProgram {


public static void main(String[] args) {

hello("World");
  hello("user");
  hello("Vasya");
  double l =25;
  double a =4;
  double b =6;
  System.out.println("Площадь квадрата = " + "со стороной " + l + " равна "+ area(l));

  System.out.println("Площадь прямоугольника = " + "со сторонами " + a + " и "+ b + " равна "+ area(a,b));
}

public static void hello(String somebody) {

  System.out.println("Hello "   + somebody +"!");
}

public static double area (double len){
 return len * len;
}

public static double area (double a, double b) {
  return a * b;
}
}