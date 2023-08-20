import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Iteration {
    final List<String> friends =
            Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott1");
    
    public void fori_Iteration() {
        for (int i = 0; i < friends.size(); i++) {
            System.out.println( friends.get(i));
        }
    }
    
    public void foreach_Iteration() {
        for (String friend : friends) {
            System.out.println(friend);
        }
    }

    public void foreachConsumer_Iteration() {
        friends.forEach(new Consumer<String>() {
            @Override
            public void accept(final String name) {
                System.out.println( name);
            }
        });
    }

    public void foreachConsumer_lambda_Iteration() {
        friends.forEach((final String name) -> System.out.println( name));

        // without type information
        // friends.forEach( name -> System.out.println( name));
    }

    public void methodReference_Iteration() {
        friends.forEach( System.out::println);
    }

}
