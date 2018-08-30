
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="PriyaKalam";
     char[] charfrom= {'H','A','P','P','Y','B','I','R','T','H','D','A','Y'};
     char[] charto=new char[7];
     System.out.println(s.length());
     System.out.println(s.substring(0, 5));
     System.out.println(s.charAt(7));
     System.arraycopy(charfrom, 5, charto, 0, 6);
     System.out.println(new String(charto));
	}

}
