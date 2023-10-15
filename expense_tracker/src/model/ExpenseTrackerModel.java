package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExpenseTrackerModel {
//final is added to achieve immutability of transactions
  public final List<Transaction> transactions;

  public ExpenseTrackerModel() {
    transactions = new ArrayList<>(); 
  }

  public void addTransaction(Transaction t) {
    transactions.add(t);
  }

  public void removeTransaction(Transaction t) {
    transactions.remove(t);
  }
//unmodifiableList is added to prevent external modifications
  public List<Transaction> getTransactions() {
    return Collections.unmodifiableList(transactions);
  }

}