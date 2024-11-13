// 2. BankAccount (Банковский счет).
// Определите класс с такими атрибутами, как номер счета, баланс, ФИО владельца, контактный телефон, название банка, акции.
// Включите конструктор, методы ввода, вывода денег, а также проверку баланса счета.
// Создайте гетторы и сеттры на каждое свойство.
//  * Баланс: используйте тип BigDecimal и в гетторе попробуйте различные варианты округления баланса.

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BankAccount {
	private int billNumber;
	private BigDecimal balance;

	private String name;
	private String phoneNumber;

	private String bankName;
	private String stockName;

	public BankAccount() {
	}

	public BankAccount(int billNumber, String name, String phoneNumber, String bankName, String stockName) {
		this.billNumber = billNumber;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.bankName = bankName;
		this.stockName = stockName;
	}

	public BigDecimal getBalance() {
		// Супер крутое округление до трех знаков после запятой
		return balance.round(new MathContext(5, RoundingMode.HALF_EVEN));
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public void checkBalance(BigDecimal bg) {
		if (bg.compareTo(BigDecimal.ZERO) > 0) {
			System.out.println("Balance is good");
		} else {
			System.out.println("Balance is bad");
		}
	}

	public static void main(String[] args) {
		BankAccount v1 = new BankAccount(
				12345678,
				"Ivan Ivanov",
				"123 (456) 789",
				"Tinkoff",
				"Govno");

		System.out.println(v1.getName());

		v1.setBalance(new BigDecimal("24.784917"));
		v1.setName("Sasha Mycha");

		System.out.println(v1.getName());
		System.out.println(v1.getBalance());

		v1.checkBalance(v1.getBalance());

		// УШЛИ В ДОЛГИ
		v1.setBalance(new BigDecimal("-4343.3231321"));

		System.out.println(v1.getBalance());

		v1.checkBalance(v1.getBalance());
	}
}
