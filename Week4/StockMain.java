package Week4;

import java.util.*;

public class StockMain {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Ýlk maðazanýn ismi: ");
		String store1 = console.next();
		Stock stock1 = new Stock(store1);
		int profit1 = makePurchases(stock1, console);

		System.out.println("Ýkinci maðazanýn ismi: ");
		String store2 = console.next();
		Stock stock2 = new Stock(store1);
		int profit2 = makePurchases(stock1, console);

		if (profit1 > profit2) {
			System.out.println(store1 + " daha yararlýdýr");
		} else if (profit2 > profit1) {
			System.out.println(store2 + " daha yararlýdýr");
		} else {
			System.out.println(store1 + " ve" + store2 + "eþittir");
		}

	}

	public static int makePurchases(Stock currentStock, Scanner console) {
		System.out.println("Kaç kez satýn alma yaptýn ");
		int numPurchases = console.nextInt();
		for (int i = 1; i <= numPurchases; i++) {
			System.out.println(i + ": alýmda kaç tane aldýn? Birim fiyatý nedir? ");
			int numShares = console.nextInt();
			int pricePerShare = console.nextInt();
			currentStock.purchase(numShares, pricePerShare);
		}
		System.out.println("Güncel birim fiyatý? ");
		int currentPrice = console.nextInt();
		int profit = currentStock.getProfit(currentPrice);
		System.out.println("Net kazanç/kayýp: " + profit + "TL");
		System.out.println();
		return profit;

	}
}
