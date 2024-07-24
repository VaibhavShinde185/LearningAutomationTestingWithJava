package ex_200724_ifElse_Switch_Statements;

public class Lab090 {
    public static void main(String[] args) {
        // JDK > 13
        char code = 'B';
        int val = switch (code){
            case 'A':
                yield 65;
            case 'B':
                yield 66;//// return
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }
}

// yield Keyword: It is similar to return
// yield Keyword does not require break