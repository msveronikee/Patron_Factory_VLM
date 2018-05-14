/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vero
 */
public class Sony implements Mobile{
    	private int ramSize;
	private String processor;
	
	public Sony(int ramSize, String processor){
		this.ramSize = ramSize;
		this.processor = processor;
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
        
}
