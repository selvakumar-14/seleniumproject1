package javaclass;

public class Strings {

	public static void main(String[] args) {
		String LoginId = "564783";
		String Username = " Gurulakshmi ";
		String Password = "VISHRUT";
		System.out.println(Username.length());
		System.out.println(Username.concat(LoginId));	
	    System.out.println(Username.trim());
        System.out.println(Password.charAt(4));
        System.out.println(LoginId.contains("783"));
        System.out.println(Password.equals(LoginId));
        System.out.println(Username.equalsIgnoreCase(" guruLAKSHMI "));
        System.out.println(Username.replace("Guru","Guna"));
        System.out.println(Password.toLowerCase());
        System.out.println(Username.toUpperCase());
        System.out.println(LoginId.substring(1, 4));
	}
}
