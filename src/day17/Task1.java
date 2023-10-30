package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece [] chessPieces = {ChessPiece.WHITE_PAWN, ChessPiece.WHITE_PAWN, ChessPiece.WHITE_PAWN, ChessPiece.WHITE_PAWN
        , ChessPiece.BLACK_ROOK, ChessPiece.BLACK_ROOK, ChessPiece.BLACK_ROOK, ChessPiece.BLACK_ROOK};
        for (ChessPiece c: chessPieces){
            System.out.print(c+" ");
        }

    }
}
