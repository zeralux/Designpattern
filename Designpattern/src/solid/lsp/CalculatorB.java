package solid.lsp;

public class CalculatorB extends CalculatorA{
	
	/*	
	 * 	重購了add()邏輯  不符合LSP
	 * */
	public void add(int x,int y) {
		System.out.println(x+y+10);
	}
	
	public void minus(int x,int y) {
		System.out.println(x-y);
	}
}
