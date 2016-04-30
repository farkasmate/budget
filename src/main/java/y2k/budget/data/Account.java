package y2k.budget.data;

import java.util.List;

public class Account {
  private BudgetDatabase db;

  public Account(String accountName) {
    db = new BudgetDatabase(accountName);
  }

  public void addItem(Item item) {
    db.insertOrUpdate(item);
  }

  public double getBalance() {
    // TODO: Query SUM(ALL) - SUM(savings)
    return 0.0;
  }

  public List<Item> getItems() {
    // TODO: Query items
    return null;
  }

  public double getSavings() {
    // TODO: Query SUM(savings)
    return 0.0;
  }
}
