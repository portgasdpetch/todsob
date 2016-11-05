/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.demo.model;

/**
 *
 * @author int303
 */
public class Utility {
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static int isPrimeNumber(int n) {
        for (int i = 2; i < n/2+1; i++) {
            if(n%i == 0){
                return i;
            }
        }              
        return n<2? -1:1;
    }
    
    public static void main(String[] args) {
        int prime = 0;
        int notPrime = 0;
        for (int i = -1; i < 100; i++) {
            int x = isPrimeNumber(i);
            if(x<1){
                System.out.println("Invalid number: "+i+" is not prime number");
                notPrime++;
            }else if(x==1){
                System.out.println(ANSI_RED+i+" is Prime number"+ANSI_RESET);
                prime++;
            }else{
                System.out.println(ANSI_BLUE+i+" is not Prime number"+ANSI_RESET);
                notPrime++;
            }
        }
        
        System.out.println("Prime = "+prime+" ,, Not prime = "+notPrime);
    }
}
