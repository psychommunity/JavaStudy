/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.Scanner;

/**
 *
 * @author DAHLIA
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the number : ");
        n=sc.nextInt();
        System.out.print(n+"! = ");
        System.out.println(Test1.factorial(n));
        
        System.out.println("======================");
        Card c1=new Card();
        Card c2=new Card();
        c1.width=500;
        c1.number=10;
        System.out.println(c1.width);
        System.out.println(c2.width);
        System.out.println(c1.number);
        System.out.println(c2.number);
        
        
    }
    public static long factorial(int n){
        long result=1;
        for(int i=n; i>0; i--){
            result*=i;
        }
        return result;
    }    
}

class Card{
    String kind;
    int number;
    static int width=100;
    static int height=250;
}