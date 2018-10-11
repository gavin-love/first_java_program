import java.util.Scanner;

class receipt {
  public static void main(String arrgs[]) {
    Scanner input = new Scanner(System.in);
    isTaxable taxable = new isTaxable();
    addTax tax = new addTax();
    roundToTheNearest05 roundPrice = new roundToTheNearest05();

    String item1, item2, item3;
    Boolean item1Taxable, item2Taxable, item3Taxable;
    Double price1, price2, price3;
    Double price1PlusTax, price2PlusTax, price3PlusTax;
    Double taxes = 0.0;
    Double total = 0.0;

    System.out.println("Welcome to tax calculator");
    System.out.println("Enter 3 items to generate a reciept");

    System.out.println("Enter first item type (ex: book, food, medical or other)");
    item1 = input.nextLine();

    System.out.println("Enter second item type (ex: book, food, medical or other)");
    item2 = input.nextLine();

    System.out.println("Enter third item type (ex: book, food, medical or other)");
    item3 = input.nextLine();

    System.out.println("Enter first item price here (ex: 2.0, 20.67, 20.30, etc...)");
    price1 = input.nextDouble();

    System.out.println("Enter second item price here (ex: 2.0, 20.67, 20.30, etc...)");
    price2 = input.nextDouble();

    System.out.println("Enter third item price here (ex: 2.0, 20.67, 20.30, etc...)");
    price3 = input.nextDouble();

    item1Taxable = taxable.result(item1);
    item2Taxable = taxable.result(item2);
    item3Taxable = taxable.result(item3);

    if (item1Taxable) {
      price1PlusTax = tax.result(price1);
      taxes += price1PlusTax - price1;
    } else {
      price1PlusTax = price1;
    }
    ;

    if (item2Taxable) {
      price2PlusTax = tax.result(price2);
      taxes += price1PlusTax - price1;
    } else {
      price2PlusTax = price2;
    }
    ;

    if (item3Taxable) {
      price3PlusTax = tax.result(price3);
      taxes += price1PlusTax - price1;
    } else {
      price3PlusTax = price3;
    }
    ;

    total = price1PlusTax + price2PlusTax + price3PlusTax;

    System.out.println(roundPrice.result(price1PlusTax));
    System.out.println(roundPrice.result(price2PlusTax));
    System.out.println(roundPrice.result(price3PlusTax));
    System.out.println(roundPrice.result(taxes));
    System.out.println(roundPrice.result(total));
  };
};