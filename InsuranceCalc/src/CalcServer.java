public class CalcServer {

	public static double insCalculation () {
		double 
			age1, age2, age3, age4, region, sport, lawyer, specialCase,
			foresight, bagage, summMod, ageMod1, ageMod2, ageMod3,
			ageMod4, summ, promo, result;
		int 
			extra1, extra2, extra3, extra4, extra5, k1, k2, k3, k4, days, multi;
		
		age1 = (region + sport * extra1 + lawyer * extra2 + specialCase * extra3 +
				foresight * extra4 + bagage * extra5) * summMod * ageMod1 * days * k1;
		age2 = (region + sport * extra1 + lawyer * extra2 + specialCase * extra3 +
				foresight * extra4 + bagage * extra5) * summMod * ageMod2 * days * k2;
		age3 = (region + sport * extra1 + lawyer * extra2 + specialCase * extra3 +
				foresight * extra4 + bagage * extra5) * summMod * ageMod3 * days * k2;
		age4 = (region + sport * extra1 + lawyer * extra2 + specialCase * extra3 +
				foresight * extra4 + bagage * extra5) * summMod * ageMod4 * days * k3;
		summ = age1 + age2 + age3 + age4;
		result = summ * multi - summ * promo;
		return result;
	}
	
}
