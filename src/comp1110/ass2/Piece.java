package comp1110.ass2;

import static comp1110.ass2.Orientation.*;
import static comp1110.ass2.PieceSegment.*;
import static comp1110.ass2.PieceType.*;

/**
 * Created by joelmcleod on 17/08/2016.
 */

public enum Piece {
    /*  Defines the possible pieces.
        Each piece has an 11-bit sequence defining their configuration.
        The first bit controls the shape of the piece, derived from PieceType.
        The second bit controls the orientation, derived from Orientation.
        Bits 3-5, 6-8, and 9-11 control each segment's shape and features.
            The first bit of each segment is the type of segment.
            The second and third bits describe the orientation of the feature.
            For a ball, the feature will be a branch (a line).
            For rings, the features are breaks in the ring. A value of 0 for the second bit means there is only one
                break, and 0 in both means there are no breaks.
            Orientation is numbered 1-6 clockwise starting from the left-most point:
             2 3
            1 0 4
             5 6
            The first set of bits is for the origin segment, the second set is for the first branch
                (which will always be on 1 in the above diagram in the A orientation), and the third set
                is the second branch.
    */
    A   (LINE,OA,
            RING,2,3,
            BALL,4,0,
            BALL,1,0)
    ;

    private PieceSegment segment;
    private Orientation orientation;
    private PieceType type;
    Piece(PieceType type, Orientation o, PieceSegment origin, int or1, int or2, PieceSegment branch1, int br11, int br12, PieceSegment branch2, int br21, int br22) {

    }

    //direction: six (inc 0) values
    int findOpening(String direction) {
        return 0;
    }

    //mark piece as array of ball or ring + opening, pull orientation from enum
    String definePiece(char pieceName) {
        return "";
    }
}







