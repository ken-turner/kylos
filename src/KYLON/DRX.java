package KYLON;

public class DRX {
	private String face;
	private value value;
	private tense tense;
	private type type;
	public DRX(String front){
		face = front.toUpperCase();
		value = new value();
	}
	
	public String show(int type){
		switch( type){
		case 0:
			return face;
		case 1:
			return ""+value.show_value();
		case 2:
			return ""+tense.show_tense();
		default:
			return "NULL";
			
		}
		
	}
	public void set(int charge, int setter){
		switch(charge){
		case 0:
			tense = new tense(setter);
				
		case 1:
			type = new type(setter);
		case 2:
		
		case 3:
			
		case 4: 
			
		case 5:
			
		default:
			
		}
	}
}
