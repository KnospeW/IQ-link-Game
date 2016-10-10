package comp1110.ass2;

/**
 * Created by Alex on 17/08/2016.
 */
public enum PieceType {
    /*  Simple enumeration for the piece shape.
        If each piece is laid out on a partial hex grid, as follows:
         2 3
        1 0 4
        Each piece has its origin on 0.
        The V piece has arms branching to 1 and 2.
        The WIDEV piece has arms to 1 and 3.
        The LINE piece has arms to 1 and 4. */

    V, WIDEV, LINE
}
