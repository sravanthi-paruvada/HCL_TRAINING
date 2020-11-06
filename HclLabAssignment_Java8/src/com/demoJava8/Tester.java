package com.demoJava8;
import java.util.*;
import java.util.stream.Collectors;
public class Tester {

	public static void main(String[] args) {

		List<Transaction> transactionList = getAllTransactions();


		System.out.println("1. Find all transactions in the year 2011 and sort them by value");
		List<Transaction> listAllTransactionsInTheYear2011 = transactionList.stream()
																			.filter(year -> year.getYear() == 2011)
																			.sorted((o1, o2) -> Integer.compare(o1.getValue(), o2.getValue()))
																			.collect(Collectors.toList());
		listAllTransactionsInTheYear2011.forEach(list -> System.out.println(list));


		
		System.out.println("2. What are all the unique cities where the traders work?");
		List<Trader> getAllTraders = transactionList.stream()
													.map(transaction->transaction.getTrader())
													.distinct()
													.collect(Collectors.toList());
		
		List<String> getAllTradersCity = getAllTraders.stream()
													.map(trader -> trader.getCity())
													.distinct()
													.collect(Collectors.toList());
		System.out.println(getAllTradersCity);
		

		System.out.println("3. Find all traders from delhi and sort them by name");
		List<Trader> getAllTradersFromDelhi = getAllTraders.stream()
															.filter(city->city.getCity().equals("delhi"))
															.sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
															.collect(Collectors.toList());
	
		getAllTradersFromDelhi.forEach(trader->System.out.println(trader));													
		
	
		System.out.println("4. Return a string of all traders names sorted alphabetically.");
		List<Trader> getAllTradersSortedAlphabetically = getAllTraders.stream()
																	.sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
																	.collect(Collectors.toList());
		
		System.out.println(getAllTradersSortedAlphabetically);
		
	System.out.println("5. Are any traders based in Jaipur?");
		
		boolean anyTraderBasedOnJaipur = getAllTraders.stream()
														.anyMatch(trader->trader.getCity().equals("jaipur"));
		if(anyTraderBasedOnJaipur) {
			System.out.println("Yes! some traders are from jaipur");
		} else {
			System.out.println("No traiders are from jaipur");
		}
		
	System.out.println("6. Print all transactions values from the traders living in delhi");
		
		List<Integer> printValuLivingInDelhi = transactionList.stream()
															.filter(city->city.getTrader().getCity().equals("delhi"))
															.map(value -> value.getValue())
															.collect(Collectors.toList());
		
		printValuLivingInDelhi.forEach(getValue->System.out.println(getValue));
		
	System.out.println("7. Whats the highest value of all the transactions?");
		
		OptionalInt maxValueFromTransactions = transactionList.stream()
															.mapToInt(value->value.getValue())
															.max();

		System.out.println(maxValueFromTransactions);
			
	System.out.println("8. Find the transaction with the smallest value");
		
		List<Transaction> transactionWithSmallestValue = transactionList.stream()
																		.sorted((Transaction o1, Transaction o2) ->  Integer.compare(o1.getValue(), o2.getValue()))
																		.limit(1)
																		.collect(Collectors.toList());
		
		System.out.println(transactionWithSmallestValue);

	}

	private static List<Transaction> getAllTransactions() {

		Trader sri = new Trader("sri", "delhi");
		Trader Bhavani = new Trader("Bhavani", "delhi");
		Trader raj = new Trader("raj", "chennai");
		Trader sravanthi = new Trader("sravanthi", "banglore");

		List<Transaction> transactions = Arrays.asList(new Transaction(sri, 2011, 4600),
														new Transaction(sri, 2012, 2005),
														new Transaction(Bhavani, 2011, 3780),
														new Transaction(raj, 2011, 1070),
														new Transaction(sravanthi, 2012, 5664),
														new Transaction(sravanthi, 2012, 3557));

		return transactions;
	}

}
