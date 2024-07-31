import java.util.Scanner;

class Worning extends Exception {

}

class Atm1 {
	private int cardPin = 3718;
	private int pin;

	public void setPassw(int Pin) {
		this.pin = Pin;
	}

	public void input() {
		System.out.println("enter the password");
		Scanner scan = new Scanner(System.in);
		pin = scan.nextInt();
	}

	public void verify() throws Worning {
		if (cardPin == pin) {
			System.out.println("Collect your cash🤑");
		} else {
			System.out.println("your enter the Wrong password\ntry again");
			Worning w = new Worning();
			throw w;

		}
	}

}

class Limit {
	public void lmt() {
		Atm1 a = new Atm1();

		try {
			a.input();
			a.verify();
		} catch (Exception e) {
			try {
				a.input();
				a.verify();
			} catch (Exception f) {
				try {
					a.input();
					a.verify();
				} catch (Exception g) {
					System.out.println("youd card block");

				}
			}

		}

	}

}
public class Atm {

	public static void main(String[] args) {
		Limit l=new Limit();
		l.lmt();
		System.out.println("Conection terminate.");

	}

}
