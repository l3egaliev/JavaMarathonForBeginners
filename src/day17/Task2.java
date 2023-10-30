package day17;

public class Task2 {
    public static void main(String [] args){
        ChessPiece [][] c = {{ChessPiece.BLACK_ROOK, ChessPiece.EMPTY, ChessPiece.EMPTY,
                ChessPiece.EMPTY, ChessPiece.BLACK_ROOK, ChessPiece.BLACK_KING, ChessPiece.EMPTY, ChessPiece.EMPTY,
                ChessPiece.WHITE_KING},

                {ChessPiece.BLACK_BISHOP, ChessPiece.EMPTY, ChessPiece.EMPTY,
                ChessPiece.EMPTY, ChessPiece.WHITE_PAWN, ChessPiece.WHITE_KNIGHT, ChessPiece.EMPTY, ChessPiece.EMPTY,
                ChessPiece.WHITE_QUEEN}};

        ChessBoard board = new ChessBoard(c);
        board.print();
    }


}
