package firstPage;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Account extends UserView{
	
	JLabel account = new JLabel("Account");

	private Account(){
		frame.add(account);
	}


	public static void main(String[]args){
	Account show = new Account();
}
	}