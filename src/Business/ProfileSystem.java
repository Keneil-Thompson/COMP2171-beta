package Business;

import Presentation.*; 


public class ProfileSystem{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
        IDandPasswords idandPasswords = new IDandPasswords();        
		LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
    }
}

