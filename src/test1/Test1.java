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
        
    }
    public static long factorial(int n){
        long result=1;
        for(int i=n; i>0; i--){
            result*=i;
        }
        return result;
    }
}
