package solid.lsp;

import solid.dip.Hamburger;
import solid.dip.People;
import solid.dip.Stuffer;

public class Main {
	/*	
	 * 	里氏替換原則 (Liskov Substitution Principle - LSP)
	 * 
	 * 	在一個系統中，子類別應該可以替換掉父類別而不會影響程式架構
	 * 	子類別必須能夠替換父類別，並且行為正常 , 不建議 overide/overloadding父類別避免Bug , 或必須依照父類別行為方向
	 * 	其父類別為所有子類別之交集
	 * 	
	 * 	以設計角度IS-A的關係應該要從" 行為" 來判斷的，所以企鵝物件不是鳥類物件的行為，這才是軟體該關注的問題，也是開發人員所依賴的
	 * 	ex: 企鵝屬於鳥類，但在鳥類中的飛行行為因為企鵝無法實做導致違反LSP
	 *  
	 * */
    public static void main(String[] args) {
       
    }
}
