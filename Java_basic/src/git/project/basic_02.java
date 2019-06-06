package git.project;

public class basic_02 {

	public static void main(String[] args) {
		
		// Basic operation.
		int aNum = 20;
		int bNum = 10;
		char aLetter = 'A';
		char bLetter = 'B';
		char cLetter = 'C';
		String aText = "AB";
		String bText = "CD";
		
		int addResult = aNum + bNum;
		int uniResult = aLetter + bLetter;
		int subResult = aNum - bNum;
		int divResult = aNum / bNum;
		int mulResult = aNum * bNum;
		int restResult = aNum % bNum;
		
		
		System.out.println(addResult);
		System.out.println(uniResult);
		System.out.println(""+aLetter+bLetter);
		System.out.println(subResult);
		System.out.println(divResult);
		System.out.println(mulResult);
		System.out.println(restResult);
		System.out.println(aText+bText);
		System.out.println(aText+cLetter);
		System.out.println(aText+aNum);
		System.out.println(aNum+bNum+bText);

	}

}
