class PESEL{
	public static String pesel_;
	public PESEL(String pesel){
		pesel_ = pesel;
	}
	public static boolean check(){
		//int intPesel = Integer.parseInt(PESEL.pesel_);
		char[] char_pesel = PESEL.pesel_.toCharArray();
		int [] int_pesel = new int [11];
		int month, day;
		int last;
		for(int i=0; i<11; ++i){
			int_pesel[i] = char_pesel[i] - '0';
		}
		month = int_pesel[2]*10 + int_pesel[3];
		day = int_pesel[4]*10 + int_pesel[5];
		last = int_pesel[10];
		
		
		if(!((0 < month && month < 13) || (20 < month && month < 33)
			|| (40 < month && month < 53) || (60 < month && month < 73)
			|| (80 < month && month < 93)) || !(0 < day && day < 32)) return false;

		int checkValue = 9*int_pesel[0] + 7*int_pesel[1] + 3*int_pesel[2] +
						1*int_pesel[3] + 9*int_pesel[4] + 7*int_pesel[5] +
						3*int_pesel[6] + 1*int_pesel[7] + 9*int_pesel[8] + 7*int_pesel[9];
		if(checkValue%10 != last) return false;
		System.out.println("OK");
		return true;
		
	}
}