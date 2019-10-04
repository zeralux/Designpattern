package solid.dip;

public class Main {
	
	/*	依賴倒置原則 (Dependency-Inversion Principle, DIP)
	 * 
	 * 	目的是為了 解除高階模組 (People) 與低階模組 (Hamburger) 的耦合關係
	 * 	People 不再依賴 Hamburger ，而是兩者都依賴 Stuffer 介面
	 * 	=> 高階模組不應該依賴於低階模組，兩者都該依賴抽象
	 *  => 抽象不應該依賴於具體實作方式
	 *  => 具體實作方式則應該依賴抽象
	 *  
	 * */
    public static void main(String[] args) {
        People me = new People();
        Stuffer stuffer = new Hamburger();
        me.setStuffer(stuffer);
        // 開吃囉
        me.eat();
    }
}