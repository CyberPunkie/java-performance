package Numa;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.Random;

public class SerializableObject implements Serializable {

	private static final long serialVersionUID = 5664602743743914303L;
	private static final String alphabets = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
	private static final int stringSize = 10;

	private final String strings1;
	private final String strings2;
	private final String strings3;
	private final String strings4;
	private final String strings5;

	private final char chars1;
	private final char chars2;
	private final char chars3;
	private final char chars4;
	private final char chars5;
	private final char chars6;
	private final char chars7;
	private final char chars8;
	private final char chars9;
	private final char chars10;
	private final char chars11;
	private final char chars12;
	private final char chars13;
	private final char chars14;
	private final char chars15;
	private final char chars16;
	private final char chars17;
	private final char chars18;
	private final char chars19;
	private final char chars20;
	private final char chars21;
	private final char chars22;
	private final char chars23;
	private final char chars24;
	private final char chars25;
	private final char chars26;
	private final char chars27;
	private final char chars28;
	private final char chars29;
	private final char chars30;
	private final char chars31;
	private final char chars32;
	private final char chars33;
	private final char chars34;
	private final char chars35;
	private final char chars36;
	private final char chars37;
	private final char chars38;
	private final char chars39;
	private final char chars40;

	private final Random rnd = new Random();

	private final BigInteger bigintegers1;
	private final BigInteger bigintegers2;
	private final BigInteger bigintegers3;

	private final int ints1;
	private final int ints2;
	private final int ints3;
	private final int ints4;
	private final int ints5;
	private final int ints6;

	private final Date dates1;
	private final Date dates2;
	private final Date dates3;

	public SerializableObject() {
		strings1 = randomString(stringSize);
		strings2 = randomString(stringSize);
		strings3 = randomString(stringSize);
		strings4 = randomString(stringSize);
		strings5 = randomString(stringSize);

		chars1 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars2 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars3 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars4 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars5= alphabets.charAt(rnd.nextInt(alphabets.length()));

		chars6 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars7 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars8 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars9 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars10 = alphabets.charAt(rnd.nextInt(alphabets.length()));

		chars11 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars12 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars13 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars14 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars15 = alphabets.charAt(rnd.nextInt(alphabets.length()));

		chars16 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars17 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars18 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars19 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars20 = alphabets.charAt(rnd.nextInt(alphabets.length()));

		chars21 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars22 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars23 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars24 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars25 = alphabets.charAt(rnd.nextInt(alphabets.length()));

		chars26 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars27 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars28 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars29 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars30 = alphabets.charAt(rnd.nextInt(alphabets.length()));

		chars31 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars32 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars33 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars34 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars35 = alphabets.charAt(rnd.nextInt(alphabets.length()));

		chars36 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars37 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars38 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars39 = alphabets.charAt(rnd.nextInt(alphabets.length()));
		chars40 = alphabets.charAt(rnd.nextInt(alphabets.length()));


		bigintegers1 = BigInteger.valueOf(rnd.nextLong());
		bigintegers2 = BigInteger.valueOf(rnd.nextLong());
		bigintegers3 = BigInteger.valueOf(rnd.nextLong());

		ints1 = rnd.nextInt();
		ints2 = rnd.nextInt();
		ints3 = rnd.nextInt();
		ints4 = rnd.nextInt();
		ints5 = rnd.nextInt();
		ints6 = rnd.nextInt();

		dates1 = new Date();
		dates2 = new Date();
		dates3 = new Date();
	}

	private String randomString(int size) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < size; i++) {
			sb.append(alphabets.charAt(rnd.nextInt(alphabets.length())));
		}
		return sb.toString();
	}

	public static int getStringsize() {
		return stringSize;
	}

	public String getStrings1() {
		return strings1;
	}

	public String getStrings2() {
		return strings2;
	}

	public String getStrings3() {
		return strings3;
	}

	public String getStrings4() {
		return strings4;
	}

	public String getStrings5() {
		return strings5;
	}

	public char getChars1() {
		return chars1;
	}

	public char getChars2() {
		return chars2;
	}

	public char getChars3() {
		return chars3;
	}

	public char getChars4() {
		return chars4;
	}

	public char getChars5() {
		return chars5;
	}

	public char getChars6() {
		return chars6;
	}

	public char getChars7() {
		return chars7;
	}

	public char getChars8() {
		return chars8;
	}

	public char getChars9() {
		return chars9;
	}

	public char getChars10() {
		return chars10;
	}

	public char getChars11() {
		return chars11;
	}

	public char getChars12() {
		return chars12;
	}

	public char getChars13() {
		return chars13;
	}

	public char getChars14() {
		return chars14;
	}

	public char getChars15() {
		return chars15;
	}

	public char getChars16() {
		return chars16;
	}

	public char getChars17() {
		return chars17;
	}

	public char getChars18() {
		return chars18;
	}

	public char getChars19() {
		return chars19;
	}

	public char getChars20() {
		return chars20;
	}

	public char getChars21() {
		return chars21;
	}

	public char getChars22() {
		return chars22;
	}

	public char getChars23() {
		return chars23;
	}

	public char getChars24() {
		return chars24;
	}

	public char getChars25() {
		return chars25;
	}

	public char getChars26() {
		return chars26;
	}

	public char getChars27() {
		return chars27;
	}

	public char getChars28() {
		return chars28;
	}

	public char getChars29() {
		return chars29;
	}

	public char getChars30() {
		return chars30;
	}

	public char getChars31() {
		return chars31;
	}

	public char getChars32() {
		return chars32;
	}

	public char getChars33() {
		return chars33;
	}

	public char getChars34() {
		return chars34;
	}

	public char getChars35() {
		return chars35;
	}

	public char getChars36() {
		return chars36;
	}

	public char getChars37() {
		return chars37;
	}

	public char getChars38() {
		return chars38;
	}

	public char getChars39() {
		return chars39;
	}

	public char getChars40() {
		return chars40;
	}

	public Random getRnd() {
		return rnd;
	}

	public BigInteger getBigintegers1() {
		return bigintegers1;
	}

	public BigInteger getBigintegers2() {
		return bigintegers2;
	}

	public BigInteger getBigintegers3() {
		return bigintegers3;
	}

	public int getInts1() {
		return ints1;
	}

	public int getInts2() {
		return ints2;
	}

	public int getInts3() {
		return ints3;
	}

	public int getInts4() {
		return ints4;
	}

	public int getInts5() {
		return ints5;
	}

	public int getInts6() {
		return ints6;
	}

	public Date getDates1() {
		return dates1;
	}

	public Date getDates2() {
		return dates2;
	}

	public Date getDates3() {
		return dates3;
	}

}

