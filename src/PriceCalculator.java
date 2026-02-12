public static double applyDiscount(double price, double discountPercent) {
    if (discountPercent < 0 || discountPercent > 100) {
        IO.println("Invalid discount percent");
        return price;
    }
    return price * (1 - discountPercent / 100);
}

public static double addTax(double price) {
    return price * 1.25;

}

public static double calculateFinalPrice(double basePrice, double discountPercent) {
    double priceAfterTax = applyDiscount(basePrice, discountPercent);
    return addTax(priceAfterTax);
}

void main() {
    Scanner input = new Scanner(System.in);
    IO.print("Enter price for your purchase: ");
    double basisPrice;
    try {
        basisPrice = input.nextDouble();
        input.nextLine();
        if (basisPrice <= 0) {
            IO.println("Invalid price. Must be higher than 0");
            return;
        }
    } catch (NumberFormatException e) {
        IO.println("Invalid input. Must be a number");
        return;
    }

    IO.println("\nChoose customer type:");
    IO.println("1 = Normal (No Discount)");
    IO.println("2 = Student (15% discount)");
    IO.println("3 = Senior (10% discount)");
    IO.println("Pick your choice 1-3");

    String choice = input.nextLine().trim();
    double finalDiscount = 0;

    switch (choice) {
        case "1" -> finalDiscount = 0;
        case "2" -> finalDiscount = 15;
        case "3" -> finalDiscount = 10;
        default -> {
            IO.println("Invalid input. No discount will be applied");
            finalDiscount = 0;
        }

    }
    double calculatedFinalPrice = applyDiscount(basisPrice, finalDiscount);
    IO.println("Final price is " + calculatedFinalPrice + " $");
    input.close();

}
