class ArithmeticCmd {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java ArithmeticCmd <num1> <operator> <num2>");
            return;
        }

        double a = Double.parseDouble(args[0]);
        char op = args[1].charAt(0);
        double b = Double.parseDouble(args[2]);

        switch (op) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;
            case '-':
                System.out.println("Result = " + (a - b));
                break;
            case '*':
                System.out.println("Result = " + (a * b));
                break;
            case '/':
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Division by zero is not allowed.");
                break;
            case '%':
                System.out.println("Result = " + (a % b));
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
