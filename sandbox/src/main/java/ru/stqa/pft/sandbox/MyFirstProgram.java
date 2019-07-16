package ru.stqa.pft.sandbox;

public class MyFirstProgram {


public static void main(String[] args) {

hello("World");
  hello("user");
  hello("Vasya");
  Square s = new Square(5);
  Rectangle r = new Rectangle(8,4);

  Point p1 = new Point(2,4);
  Point p2 = new Point(4,6);

  System.out.println("Расстояние между точками = " + "p1 x(" + p1.x + ") y("+p1.y+ ") "+ " и "+ "p2 x(" + p2.x + ") y("+p2.y+ ") равно " + p1.distance(p2,p1) );

  System.out.println("Площадь квадрата = " + "со стороной " + s.l + " равна "+ s.area());

  System.out.println("Площадь прямоугольника = " + "со сторонами " + r.a + " и "+ r.b + " равна "+ r.area());
}

public static void hello(String somebody) {

  System.out.println("Hello "   + somebody +"!");
}



}