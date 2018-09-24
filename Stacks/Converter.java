
public class Converter {

    public static void main(String args[]) {

        int number = Integer.parseInt(args[0]);
        Stack stack = new Stack();

        int rest;

        // stacking
        while (number != 0) {
            rest = number % 2; //I get the rest of the division of this number for 2 (valid 0 or 1)
            stack.push(rest);
            number = number / 2; //generate a new number, result of the division by 2
        }

        // view results
        while (!stack.isEmpty()) {
            rest = stack.pop(); // remove
            System.out.print(rest);
        }
    }

// 172 / 2
//   0 86 / 2
//      0 43 / 2
//         1 21 / 2
//            1 10 / 2
//               0 5 / 2
//                 1 2 / 2
//                   0 1 / 2
//                     1   0
               
}

