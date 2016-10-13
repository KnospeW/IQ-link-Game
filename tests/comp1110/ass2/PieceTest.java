package comp1110.ass2;

import org.junit.Test;

import java.util.Objects;
import java.util.Random;

import static org.junit.Assert.*;

// created by Alex
public class PieceTest {

    @Test
    public void testOriginSegment() {
        char[] testPiece = new char[] {'A','B','D','G', 'I'};
        String[][] expOutput = new String[][] {{"RING", "2", "3"},
                                                {"RING", "0", "0"},
                                                {"RING", "0", "0"},
                                                {"RING", "5", "0"},
                                                {"BALL", "1", "2"}};
        Random r = new Random();

        int index = r.nextInt(5);
        Piece piece = Piece.A;
        String output = "";
        for (String s: expOutput[index]) {
            output = output + " " + s;
        }
        switch(index) {
            case 0:
                piece = Piece.A;
                break;
            case 1:
                piece = Piece.B;
                break;
            case 2:
                piece = Piece.D;
                break;
            case 3:
                piece = Piece.G;
                break;
            case 4:
                piece = Piece.I;
                break;
        }

        String segString = "";
        for (String s : piece.getSegment(0)) {
            segString = segString + " " + s;
        }
        assertArrayEquals("Expected output of" +output+ " for piece " +testPiece[index]+", got" + segString, expOutput[index], piece.getSegment(0));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testOutOfBounds() throws Exception {
        Piece piece = Piece.K;
        try {
            piece.getSegment(-2);
            fail("Expected a ArrayIndexOutOfBoundsException.");
        } catch (NullPointerException e) {
            assertTrue(Objects.equals(e.getMessage(), "Segment index out of bounds."));
        }
        try {
            piece.getSegment(5);
            fail("Expected a ArrayIndexOutOfBoundsException.");
        } catch (NullPointerException e) {
            assertTrue(Objects.equals(e.getMessage(), "Segment index out of bounds."));
        }
    }

}