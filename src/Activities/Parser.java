package Activities;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Parser {

	// data types
    private static final String INTEGER = "int";
    private static final String DOUBLE = "double";
    private static final String CHAR = "char";
    private static final String STRING = "String";

    // operator
    private static final String ASSIGNMENT_OPERATOR = "=";

    // delimiter
    private static final String DELIMITER = ";";

    private static StringBuilder builder;

    private static final int VALUE_POS = 3;

    public static void main(String[] args) {
        builder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Tokens: ");
        String myString = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(myString);
        int index = 0;

        while(tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken(" ");
            identifyTokenType(token, myString.contains(ASSIGNMENT_OPERATOR), index++);
        }

        //<data_type><identifier><assignment_operator><value><delimiter>
        String syntax = builder.toString();
        System.out.println(syntax);

        if(syntax.equals("<data_type><identifier><delimiter>") || syntax.equals("<data_type><identifier><assignment_operator><value><delimiter>")) {
            System.out.println("Syntax is Correct");
        } else {
            System.out.println("Syntax is Error!");
        }
    }

    private static void identifyTokenType(String token, boolean hasAssignmentOperator, int index) {

        if(token.equals(INTEGER) || token.equals(DOUBLE) || token.equals(CHAR) || token.equals(STRING)) {
            builder.append("<data_type>");

        } else if (token.equals(ASSIGNMENT_OPERATOR)) {
            builder.append("<assignment_operator>");

        } else if (token.contains(DELIMITER) && hasAssignmentOperator) {

            if(token.startsWith(DELIMITER)) {
                builder.append("<delimiter><value>");
            } else {
                builder.append("<value><delimiter>");
            }

        } else if (token.contains(DELIMITER) && !hasAssignmentOperator) {

            if(token.startsWith(DELIMITER)) {
                builder.append("<delimiter><identifier>");
            } else {
                builder.append("<identifier><delimiter>");
            }

        } else if(!token.contains(DELIMITER) && hasAssignmentOperator && index == VALUE_POS) {
            builder.append("<value>");

        } else {
            builder.append("<identifier>");
        }

    }

}
// Done~
