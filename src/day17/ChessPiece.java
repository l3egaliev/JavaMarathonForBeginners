package day17;

public enum ChessPiece {


        WHITE_KING("?", 100), BLACK_KING("?", 100),
        WHITE_QUEEN("?", 9), BLACK_QUEEN("?", 9),
        WHITE_ROOK("?", 5), BLACK_ROOK("?", 5),
        WHITE_BISHOP("?", 3.5), BLACK_BISHOP("?", 3.5)
        , WHITE_KNIGHT("?", 3), BLACK_KNIGHT("?", 3),
        WHITE_PAWN("?", 1), BLACK_PAWN("?", 1),
        EMPTY("_", -1);

        private String name;
        private double value;

        ChessPiece() {
        }

        ChessPiece(String name, double value) {
                this.name = name;
                this.value = value;
        }

        public String getName() {
                return name;
        }


        public double getValue() {
                return value;
        }

        @Override
        public String toString() {
                return name;
        }
}
