package task02;

import task02.Database;

public class TestHello {
  public static void main (String[] args) {
    Database.InitDatabase();
    System.out.println(Database.Select("select student"));
  }
}
