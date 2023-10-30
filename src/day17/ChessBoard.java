package day17;

public class ChessBoard {
    private ChessPiece [][] chessPiece;

    public ChessBoard(ChessPiece [][] chessPiece){
        this.chessPiece = chessPiece;
    }

    public void print(){
        for(ChessPiece[] c: chessPiece){
            for (ChessPiece ch: c){
                System.out.print(ch);
            }
        }
    }
}
