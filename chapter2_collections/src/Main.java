public class Main {
    public static void main(String[] args) {
        iteration();
    }

    public static void iteration() {
        Iteration iteration = new Iteration();

        // example 1
        System.out.println("==== example 1 ====\n");
        iteration.fori_Iteration();

        // example 2
        System.out.println("\n\n==== example 2 ====\n");
        iteration.foreach_Iteration();

        // example 3
        System.out.println("\n\n==== example 3 ====\n");
        iteration.foreachConsumer_Iteration();

        // example 4
        System.out.println("\n\n==== example 4 ====\n");
        iteration.foreachConsumer_lambda_Iteration();

        // example 5
        System.out.println("\n\n==== example 5 ====\n");
        iteration.methodReference_Iteration();
    }
}