package comp1110.ass2;

import org.junit.Test;

import java.util.Random;

import static comp1110.ass2.Orientation.*;
import static org.junit.Assert.*;

/**
 * Created by Alex on 15/09/16.
 */
public class PieceMovementTest {

    @Test
    public void testRotateIndex() {
        Piece piece = Piece.A;
        Orientation[] expected = {OB,OC,OD,OE,OF,OA};
        Orientation[] output = new Orientation[6];
        for (int i = 1; i < output.length + 1; i++) {
            piece.rotatePiece(1);
            output[i-1] = piece.getOrientation();
        }
        boolean equal = true;
        for (int i = 0; i < output.length; i++) {
            equal = equal && (output[i].equals(expected[i]));
        }
        String out = "", exp = "";
        for (Orientation o : output) out = out + o.toString() + " ";
        for (Orientation o : expected) exp = exp + o.toString() + " ";
        assertTrue("Simple rotation failed: expected " +exp+ "and got " +out, equal);
    }

    @Test
    public void testRotateAbs() {
        Piece piece = Piece.B;
        Random r = new Random();
        Orientation o = Orientation.values()[r.nextInt(12)];
        piece.rotatePiece(o);
        assertTrue("Absolute rotation failed: expected " +o.toString()+ " and got " +piece.getOrientation(), piece.getOrientation()==o);
    }

    @Test
    public void testFlip() {
        Piece piece = Piece.C;
        Orientation exp = piece.getOrientation().flip();
        piece.flipPiece();
        assertTrue("Piece flip failed: expected " +exp.toString()+ " and got " + piece.getOrientation(), piece.getOrientation()==exp);
    }

}