import java.util.Scanner;

class receipt {
  public static void main(String arrgs[]) {
    Scanner input = new Scanner(System.in);
    isTaxable taxable = new isTaxable();
    addTax tax = new addTax();
    roundToNearest05 round = new roundToNearest05();

    String item1, item2, item3;
    Boolean item1Taxable, item2Taxable, item3Taxable;
    Double price1, price2, price3;
    Double price1PlusTax, price2PlusTax, price3PlusTax;
    Double taxes;
    Double totalTaxes = 0.0;
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
      taxes = round.result(tax.result(price1));
      price1PlusTax = price1 + taxes;
      totalTaxes += taxes;
    } else {
      price1PlusTax = price1;
    }
    ;

    if (item2Taxable) {
      taxes = round.result(tax.result(price2));
      price2PlusTax = price2 + taxes;
      totalTaxes += taxes;
    } else {
      price2PlusTax = price2;
    }
    ;

    if (item3Taxable) {
      taxes = round.result(tax.result(price3));
      price3PlusTax = price3 + taxes;
      totalTaxes += taxes;
    } else {
      price3PlusTax = price3;
    }
    ;

    total = price1PlusTax + price2PlusTax + price3PlusTax;

    System.out.println(price1PlusTax);
    System.out.println(price2PlusTax);
    System.out.println(price3PlusTax);
    System.out.println(totalTaxes);
    System.out.println(round.result(total));
  };
};