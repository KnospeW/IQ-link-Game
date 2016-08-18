package comp1110.ass2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This class provides the text interface for the Link Game
 *
 * The game is based directly on Smart Games' IQ-Link game
 * (http://www.smartgames.eu/en/smartgames/iq-link)
 */
public class LinkGame {

    static List<String> board = new ArrayList<>();
    static String pieceSequence = "";

    // Converts a piece's data with thee placement location into a placement string.
    static String getPlacement(Piece piece, int placementLocation) {
        return "";
    }

    // Find openings in a peg to determine valid placement
    static String breakPlacement(Pegs pegs) {
        return "";
    }

    // Update the board after a placement
    static void updateBoard(String placementString) {}

    //long string into several arrays of 3-char string
    /**
     * Determine whether a piece placement is well-formed according to the following:
     * - it consists of exactly three characters
     * - the first character is in the range A .. X
     * - the second character is in the range A .. L
     * - the third character is in the range A .. F if the second character is A, otherwise
     *   in the range A .. L
     *
     * @param piecePlacement A string describing a piece placement
     * @return True if the piece placement is well-formed
     */
    // FIXME Task 3: determine whether a piece placement is well-formed
    static boolean isPiecePlacementWellFormed(String piecePlacement) {
        int len=piecePlacement.length();
        char[] chars=piecePlacement.toCharArray();
        if (len==3)
        {
           //judge the range of each character and for the third character has two different situations
            if ((int)chars[0]> 64 && (int)chars[0]<89 && (int)chars[1]> 64 && (int)chars[1]<77&&(((int)chars[2]>64&&(int)chars[2]<77&&chars[1]!='A')||((int)chars[2]>64&&(int)chars[2]<71&&chars[1]=='A')))
           return true;
            else
                return false;

        }
        else {
            return false;
        }
    }

    /**
     * Determine whether a placement string is well-formed:
     *  - it consists of exactly N three-character piece placements (where N = 1 .. 12);
     *  - each piece placement is well-formed
     *  - no piece appears more than once in the placement
     *
     * @param placement A string describing a placement of one or more pieces
     * @return True if the placement is well-formed
     */
    static boolean isPlacementWellFormed(String placement)
        {
        // FIXME Task 4: determine whether a placement is well-formed
            if(placement.length()%3!=0)
                return false;
            String[] s = new String[placement.length()/3];  //devide the string placement into 3-char array
            int flag=0;
            for(int i=0; i<placement.length()/3;i++)
            {
                s[i]=placement.substring(i*3,i*3+3);      //placement to piece
            }
            for (String str:s)
            {
                if(!isPiecePlacementWellFormed(str))
                    return false;
            }
            //List<String> list = Arrays.asList(s);        //to list
            Set set = new HashSet();
            for (int i = 0; i < s.length; i++) {      //hashset without duplicate,compare hash with the length of String array
                // set.add(list.get(i));
                set.add(s[i]);
            }
            if (set.size()==s.length)
                return true;                     //if the number of members between hashset and string array are not the same.has duplicate
            else
                return false;

        }

    /**}
     * Return a array of peg locations according to which pegs the given piece placement touches.
     * The values in the array should be ordered according to the links that constitute the
     * piece.
     * The code needs to account for the origin of the piece, the piece shape, and the piece
     * orientation.
     * @param piecePlacement A valid string describing a piece placement
     * @return An array of integers corresponding to the pegs which the piece placement touches,
     * listed in the normal order of links for that piece.
     */
    static int[] getPegsForPiecePlacement(String piecePlacement) {
        // FIXME Task 6: determine the pegs touched by a piece placement
        return null;
    }


    /**
     * Determine whether a placement is valid.  To be valid, the placement must be well-formed
     * and each piece must correctly connect with each other.
     *
     * @param placement A placement string
     * @return True if the placement is valid
     */
    static boolean isPlacementValid(String placement) {
        // FIXME Task 7: determine whether a placement is valid
        return false;
    }

    /**
     * Return an array of all solutions given a starting placement.
     *
     * @param placement  A valid piece placement string.
     * @return An array of strings, each describing a solution to the game given the
     * starting point provied by placement.
     */
    static String[] getSolutions(String placement) {
        // FIXME Task 10: determine all solutions to the game, given a particular starting placement
        return null;
    }
}
