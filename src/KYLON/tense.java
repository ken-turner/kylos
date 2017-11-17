package KYLON;

public class tense {
	private int tense = 0;
	public tense(int type){
		tense = type;
	}
	public String show_tense(){
		switch(tense){
		case 0:
			return "NOUN";
		case 1:
			return "VERB";
		case 2:
			return "ADJECTIVE";
		case 3:
			return "CONJUNCTION";
		case 4: 
			return "DETERMINER";
		case 5:
			return "NUMERICAL";
		default:
			return "NULL";
		}
	}
}
