import java.util.Scanner;

class receipt {
  public static void main(String arrgs[]) {
    Scanner input = new Scanner(System.in);
    isTaxable taxable = new isTaxable();

    String item1, item2, item3;
    Boolean item1Taxable, item2Taxable, item3Taxable;
    Double priceInput1, priceInput2, priceInput3;

    System.out.println("Welcome to tax calculator");
    System.out.println("Enter 3 items to generate a reciept");

    System.out.println("Enter first item type (ex: book, food, medical or other)");
    item1 = input.nextLine();

    System.out.println("Enter second item type (ex: book, food, medical or other)");
    item2 = input.nextLine();

    System.out.println("Enter third item type (ex: book, food, medical or other)");
    item3 = input.nextLine();

    System.out.println("Enter first item price here (ex: 2.0, 20.67, 20.30, etc...)");
    priceInput1 = input.nextDouble();

    System.out.println("Enter second item price here (ex: 2.0, 20.67, 20.30, etc...)");
    priceInput2 = input.nextDouble();

    System.out.println("Enter third item price here (ex: 2.0, 20.67, 20.30, etc...)");
    priceInput3 = input.nextDouble();
    Boolean shit = taxable.result(item1);
    System.out.println(shit);
  }
}