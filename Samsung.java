/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vero
 */
public class Samsung implements Mobile{
    	private int ramSize;
	private String processor;
	public String name = Mobile.SAMSUNG;
	public Samsung(int ramSize){
		this.ramSize = ramSize;
	}
	
	public Samsung(String processor){
		this.processor = processor;
		this.ramSize =2;
	}

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    
}
