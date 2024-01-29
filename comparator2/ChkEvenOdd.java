package in.ac.famt;

public class ChkEvenOdd {
	interface  chkEvenOdd {
		public boolean ChkEvenOdd(int a);
		
	}
	
	public boolean chkNum(int a, ChkEvenOdd chkOE) {
		return chkOE.ChkEvenOdd(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChkEvenOdd chkObj = new ChkEvenOdd();
		
		ChkEvenOdd chkN = (int n)-> n%2 != 0;
		System.out.println(chkObj.chkNum(45, chkN)?"Number is Odd.":"Number is Even.");
		

	}

}
