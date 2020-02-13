import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Solver solver = new Solver();

        int[] moves = solver.resolve(new int[]{0, 1, 2, 3, 4, 5, 6, 7});

        Arrays.stream(moves).forEach(System.out::print);
        System.out.println();
        System.out.println(moves.length);

    }
}
