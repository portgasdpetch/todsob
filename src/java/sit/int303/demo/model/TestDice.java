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
public class TestDice {
    public static void main(String[] args) {
        Dice d1 = new Dice();
        System.out.println(d1.getFace());
        d1.roll();
        System.out.println(d1.getFace());
        for (int i = 0; i < 10; i++) {
            d1.roll();
            System.out.println(i+1+". "+d1.getFace());
        }
    }
}
