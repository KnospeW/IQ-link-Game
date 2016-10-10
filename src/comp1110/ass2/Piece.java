package comp1110.ass2;

import static comp1110.ass2.Orientation.*;
import static comp1110.ass2.PieceSegment.*;
import static comp1110.ass2.PieceType.*;
/**
 * Created by Yicong and Alex
 *
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
             6 5
            The first set of bits is for the origin segment, the second set is for the first branch
                (which will always be on 1 in the above diagram in the A orientation), and the third set
                is the second branch.
    */
    A   (LINE,OA,
            RING,2,3,
            BALL,4,0,
            BALL,1,0),
    B    (LINE,OA,
            RING,0,0,
            BALL,4,0,
            RING,3,0),
    C    (LINE,OA,
            RING,0,0,
            BALL,4,0,
            RING,2,0),
    D     (WIDEV,OA,
            RING,0,0,
            BALL,4,0,
            RING,5,0),
    E     (WIDEV,OA,
            RING,0,0,
            BALL,4,0,
            RING,1,0),
    F     (WIDEV,OA,
            RING,0,0,
            BALL,4,0,
            RING,2,0),
    G     (WIDEV,OA,
            RING,6,0,
            BALL,4,0,
            BALL,6,0),
    H      (WIDEV,OA,
            RING,0,0,
            RING,2,0,
            RING,3,0),
    I      (V,OA,
            BALL,1,2,
            BALL,4,0,
            RING,2,0),
    J      (V,OA,
            BALL,1,2,
            BALL,4,0,
            RING,1,0),
    K      (V,OA,
            RING,5,0,
            BALL,4,0,
            BALL,5,0),
    L      (V,OA,
            RING,5,0,
            BALL,4,0,
            RING,4,0);

    private Orientation orientation;
    private PieceType type;
    private String[] PieceInfo=new String[11];
    private PieceSegment segment;

    Piece(PieceType type, Orientation o, PieceSegment origin, int or1, int or2, PieceSegment branch1, int br11, int br12, PieceSegment branch2, int br21, int br22) {
//        PieceInfo[0]=type.toString();
//        PieceInfo[1]=o.toString();
//        PieceInfo[2]=origin.toString();
//        PieceInfo[3]=Integer.toString(or1);
//        PieceInfo[4]=Integer.toString(or2);
//        PieceInfo[5]=branch1.toString();
//        PieceInfo[6]=Integer.toString(br11);
//        PieceInfo[7]=Integer.toString(br12);
//        PieceInfo[8]=branch2.toString();
//        PieceInfo[9]=Integer.toString(br21);
//        PieceInfo[10]=Integer.toString(br22);

        this.orientation = o;
        this.type = type;
        this.PieceInfo = new String[] {type.toString(), o.toString(),
                origin.toString(),  Integer.toString(or1),  Integer.toString(or2),
                branch1.toString(), Integer.toString(br11), Integer.toString(br12),
                branch2.toString(), Integer.toString(br21), Integer.toString(br22)};
    }

    public Orientation getOrientation() {
        return this.orientation;
    }

    public PieceType getPieceType() {
        return this.type;
    }

    /**
     * @param index Takes 0 (origin), 1 (branch that always lands on space 0), or 2 (second branch)
     * written by Alex
     * @return A 3-bit string for the segment type and its connectors
     */
    public String[] getSegment(int index) throws ArrayIndexOutOfBoundsException {
        try {
            String type = this.PieceInfo[2 + index*3];
            String piece1 = this.PieceInfo[3 + index*3];
            String piece2 = this.PieceInfo[4 + index*3];

            return new String[] {type, piece1, piece2};
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Segment index out of bounds.");
        }
    }

    /**
     * @param index Takes an orientation as an offset from its current orientation. Will not allow flipping.
     */
    public void rotatePiece(int index) {
        Orientation o = this.getOrientation();
        for (int i = 0; i < index; i++) {
            o = o.rotate();
        }
        this.rotatePiece(o);
    }

    /**
     * @param o Takes an orientation as an absolute orientation. Will allow flipping.
     */
    public void rotatePiece(Orientation o) {
        this.orientation = o;
    }

    public void flipPiece() {
        this.rotatePiece(this.getOrientation().flip());
    }

    public String[] getPieceInfo()
    {
        return PieceInfo;
    }

    //direction: six (inc 0) values
    int findOpening(String direction) {
        return 0;
    }
}