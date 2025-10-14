public class TelePad {
    public static void main(String[] args) {
        System.out.println(teleNumberPad());
    }

    public static char teleNumberPad(){
        char[][] numberPad = {
                { '1' , '2' , '3'},
                { '4' , '5' , '6'},
                { '7' , '8' , '9'},
                { '*' , '0' , '#'}
        };

        for(char[] row : numberPad){
            for(char col: row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        return 0;
    }
}
