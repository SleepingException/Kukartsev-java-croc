package task7;

import task7.util.ChessPosition;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < args.length-1; i++) {
            try {
                parse(args[i]).canMove(parse(args[i+1]));
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Ok");
    }
    static ChessPosition parse(String position){
        int pos1 = ((int)position.charAt(0) - (int)'a')+1;
        int pos2 = Integer.parseInt(String.valueOf(position.charAt(1)));
        try {
            return new ChessPosition(pos1, pos2);
        }
        catch (Exception e){
            System.out.println(e.getMessage());;
        }
        return null;
    }
}
