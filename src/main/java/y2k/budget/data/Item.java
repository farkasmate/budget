package y2k.budget.data;

import java.util.Date;

public class Item {
  private int id;
  private Date date;
  private Category category;
  private double value;

  public Item(Date date, Category category, double value) {
    this.date = date;
    this.category = category;
    this.value = value;
  }

  public int getId() {
    return id;
  }

  public Date getDate() {
    return date;
  }

  public Category getCategory() {
    return category;
  }

  public double getValue() {
    return value;
  }

  public static enum Category {
    CLOTHING,
    DRINK,
    EDUCATION,
    FOOD,
    HEALTHCARE,
    HOUSE,
    INCOME,
    LEISURE,
    SAVING,
    SHOPPING,
    SPECIAL,
    TRANSPORT,
  }
}
