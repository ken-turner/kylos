package KYLON;

public class value {
	private int insta = 0;
	private int value = 0;
	private int lim = 10;
	private boolean stable = false;
	public value(){
		insta++;
		value = ((int)(Math.random()*100)-50);
	}
	public int show_value(){
		return value;
	}
}
