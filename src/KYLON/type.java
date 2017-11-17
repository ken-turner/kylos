package KYLON;

public class type {
	private int type;
	public type(int charge){
		type = charge;
	}
	public String show_type(){
		switch(type){
		case 0:
			return "NON-VALUE WORD";
		case 1:
			return "VALUED";
		case 2:
			return "RELATOR";
		case 3:
			return "SKIP";
		case 4: 
			return "";
		case 5:
			return "";
		default:
			return "NULL";
		}
	}
}
