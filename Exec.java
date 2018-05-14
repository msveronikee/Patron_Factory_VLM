/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vero
 */
public class Exec {
    public static void main(String[] args) {
		Mobile mobile = MobileFactory.createMobile(Mobile.SAMSUNG);
                Mobile mobile2= MobileFactory.createMobile(Mobile.IPHONE);
                Mobile mobile3= MobileFactory.createMobile(Mobile.SONY);
                Mobile mobile4= MobileFactory.createMobile(Mobile.NOKIA);
                Mobile mobile5= MobileFactory.createMobile(Mobile.MOTOROLA);
                Mobile mobile6= MobileFactory.createMobile(Mobile.LG);
                
                System.out.println(mobile);
                System.out.println(mobile2);
                System.out.println(mobile3);
                System.out.println(mobile4);
                System.out.println(mobile5);
                System.out.println(mobile6);

	}
}
