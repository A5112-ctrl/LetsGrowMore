
import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one from folowing options");
		System.out.println("1) USD to EURO");
		System.out.println("2) EURO to USD");
		System.out.println("3) POUNDS to USD ");
		int exchange = sc.nextInt();
		switch (exchange) {
		case 1: {
			System.out.println("Enter the no.of USD ");
			double usd = sc.nextDouble();
			if (usd >= 0) {
				System.out.println(usd + "USD is " + usd * 0.94 + " Euros. ");
			} else {
				System.out.println("Enter positive no.of USD");
			}
		}
			break;
		case 2: {
			System.out.println("Enter the no. of Euros ");
			double euro = sc.nextDouble();
			if (euro >= 0) {
				System.out.println(euro + "EURO is " + euro * 1.056 + " USD. ");
			} else {
				System.out.println("Enter positive no.of Euros");
			}
		}
			break;
		case 3: {
			System.out.println("Enter the no. of Pounds ");
			double pounds = sc.nextDouble();
			if (pounds >= 0) {
				System.out.println(pounds + "Pound is " + pounds * 1.21 + " USD ");
			} else {
				System.out.println("Enter positive no.of POUNDS");
			}
		}
			break;

		}

	}
}
