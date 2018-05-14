/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vero
 */
public class MobileFactory {
    	public static Mobile createMobile(String type){
		if(type.equals(Mobile.IPHONE)){
			return new Iphone(2, "A9", "A9 GPu");
		}else if(type.equals(Mobile.SONY)){
			return new Sony(2,"ARM");
		}else if(type.equals(Mobile.SAMSUNG)){
			return new Samsung("Intel");
                }else if(type.equals(Mobile.NOKIA)){
			return new Nokia (3,"Qualcomm","Adreno 505");
                }else if(type.equals(Mobile.MOTOROLA)){
			return new Motorola("Snapdragon 430");
                }else if(type.equals(Mobile.LG)){
			return new LG(1,"Snapdragon 821");
		}else{
			return null;
		}
	}
    
}
