/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.first.test;

import sit.int303.first.model.PrimeNumber;

/**
 *
 * @author INT303
 */
public class TestPrime {
    public static void main(String[] args) {
         PrimeNumber pn1 = new PrimeNumber(19);
        System.out.printf("%d is Prime Number ? %b\n",pn1.getNumber(),pn1.isPrimeNumber());
        pn1.setNumber(27);
        System.out.printf("%d is Prime Number ? %b\n",pn1.getNumber(),pn1.isPrimeNumber());
        pn1.setNumber(29);
        System.out.printf("%d is Prime Number ? %b\n",pn1.getNumber(),pn1.isPrimeNumber());
        pn1.setNumber(51);
        System.out.printf("%d is Prime Number ? %b\n",pn1.getNumber(),pn1.isPrimeNumber());
    }
    
   
}
