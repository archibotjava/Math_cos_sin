package ex1;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Ex1  {
int a;
int b;
//создаем метод Ex1, который вычисляет сумму и проверяет условие равности к одному. 
//если условие выполняется, то результат сохраняется в переменную sum и выводится SOPом
 void Ex1(double a,double b){
// В метод передаем два аргумента (фактически параметра).       
    if((Math.pow(Math.sin(a),2))+(Math.pow(Math.cos(b),2))==1){
//возведение в квадрат cos^2+sin^2    
    double sum = (Math.pow(Math.sin(a),2))+(Math.pow(Math.cos(b),2));
    System.out.println("Result = "+sum);
    }
 }
 public static void main(String[] args){ 
//в главном методе создаем экземпляры классов. В нашем случае
//объект Ex1 и Объект Scanner. Для считываня из консоли
    Ex1 res = new Ex1();    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a");
    double k = in.nextDouble();
    System.out.println("Enter b");
    double l = in.nextDouble();
// ну и собственно здесь подставляем данные в в метод для вычисления    
    res.Ex1(k,l);
    }   
}
