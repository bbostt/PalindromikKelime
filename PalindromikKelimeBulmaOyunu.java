
public class PalindromikKelimeBulmaOyunu {
	
	/*static boolean isPalindrome(String str) {
	 // ilk yöntem.
	
		
		int i = 0; // ilk indis numarasý
		int j = str.length() - 1; // son indis numarasý
		
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
				
		}
		
		return true;
	}*/
	
	static boolean isPalindrome2(String str) {
		
		// ikinci yöntem.
		
		String reverse ="";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println("Girilen kelime : " +str);
		System.out.println("Kelimenin tersten yazýmý : "+reverse);
		return str.equals(reverse);
		
	}

	public static void main(String[] args) {
		// kelimenin tersten okunuþu ayný olmalý.
		// örnek : kavak, kabak.
		
		System.out.println(isPalindrome2("kayak"));

	}

}
