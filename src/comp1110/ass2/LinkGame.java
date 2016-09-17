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
            if(placement.equals("") || placement.length() % 3 != 0)
                return false;

            String[] s = new String[placement.length()/3];  //divide the string placement into sets of 3 characters

            for(int i = 0; i < placement.length() / 3; i++) {
                s[i] = placement.substring(i*3,i*3+3);      //placement to piece
            }
            for (String str : s) {
                if(!isPiecePlacementWellFormed(str))
                    return false;
            }

            //List<String> list = Arrays.asList(s);        //to list
            Set set = new HashSet();

            for (String str : s) {              //hashset without duplicate,compare hash with the length of String array
//                set.add(list.get(i));
                set.add(str.charAt(1));
            }
//            if (set.size()==s.length)
//                return true;                     //if the number of members between hashset and
//            else                                 //string array are not the same.has duplicate
//                return false;
            return set.size() == s.length;          // tighter form

        }

    /**
     * Return a array of peg locations according to which pegs the given piece placement touches.
     * The values in the array should be ordered according to the units that constitute the
     * piece.
     * The code needs to account for the origin of the piece, the piece shape, and the piece
     * orientation.
     * @param piecePlacement A valid string describing a piece placement
     * @return An array of integers corresponding to the pegs which the piece placement touches,
     * listed in the normal order of units for that piece.   The value 0 corresponds to
     * peg 'A', 1 to peg 'B', etc.
     */
    static int[] getPegsForPiecePlacement(String piecePlacement) {
        // FIXME Task 6: determine the pegs touched by a piece placement
        int[] PegLocations = new int[3];
        int[] OddNeighbour = {-1,-7,-6,+1,+6,+5};
        int[] EvenNeighbour = {-1,-6,-5,+1,+7,+6};
        int br1,br2;

 /**
  *     1    2         neighbours records the origin's neighbour pegs in this order,
  *  0  origin  3      pay attention that the relationships are not the same
  *     5    4         for odd and even rows
  */
//        Piece piece=Piece.valueOf(piecePlacement.substring(1,2));
//        piece.setOrientation(Orientation.valueOf('O'+piecePlacement.substring(2,3)));
        int origin      = piecePlacement.charAt(0)-'A';
        int PieceType   = piecePlacement.charAt(1)-'A';
        int orientation = piecePlacement.charAt(2)-'A';

        int row = 1 + origin / 6;           //row 1 2 3 4
        int col = 1 + origin % 6;           //column 1 2 3 4 5 6

        
        if(orientation < 6) {
            br1 = (row % 2 == 0) ? (origin + EvenNeighbour[orientation] ):( origin+OddNeighbour[orientation]);
               if (PieceType < 3)       //which shows a line type
                   br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation+3)%6] ):( origin+OddNeighbour[(orientation+3)%6]);
                else if (PieceType < 8)   //a big v type
                  br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation+2)%6] ):( origin+OddNeighbour[(orientation+2)%6]);
               else                        // a v type
                   br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation+1)%6] ):( origin+OddNeighbour[(orientation+1)%6]);
        } else {
            orientation=orientation-6;      //flip change the start like the postion 2 will flip to 4, and 1 flip to 5
            br1 = (row % 2 == 0) ? (origin + EvenNeighbour[orientation] ):( origin+OddNeighbour[orientation]);
            if (PieceType < 3)
                br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation+3)%6] ):( origin+OddNeighbour[(orientation+3)%6]);
            else if (PieceType < 8)
                br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation+4)%6] ):( origin+OddNeighbour[(orientation+4)%6]);
            else
                br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation+5)%6] ):( origin+OddNeighbour[(orientation+5)%6]);
        }

        // we should judge whether it's off the grid
        int rowbr1=br1/6+1;
        int colbr1=br1%6+1;
        int rowbr2=br2/6+1;
        int colbr2=br2%6+1;
        //if the column and row are not ajacent or the index out of 0-23 it is offgrid
        if (Math.abs(rowbr1 - row) > 1 || Math.abs(colbr1 - col) > 1 || br1>23||br1<0){
            br1 = -1;
        }
        if (Math.abs(rowbr2 - row) > 1 || Math.abs(colbr2 - col) > 1 || br2>23||br2<0){
            br2 = -1;
          }
        PegLocations[0]=br1;
        PegLocations[1]=origin;
        PegLocations[2]=br2;
        

        return PegLocations;
    }
    //translate the pieceplacement to update the pegs states indicates whether there's a ball/ring and the direction for opening and connection
     //input:piceplacement
    //output the string with states for br1,origin,br2
    static int[] updatePegsPiecePlacement(String piecePlacement)
    {
        int[] threestates=new int[18];
        Piece currPiece= Piece.valueOf(piecePlacement.substring(1,2));
        int orientation = piecePlacement.charAt(2)-'A';
      //  Orientation currOrientation=Orientation.valueOf('O'+piecePlacement.substring(2,3));
        String[] pieceInfo= currPiece.getPieceInfo();
     //   for (String s : pieceInfo)
     //   System.out.println(s);
        for (int i=0;i<3;i++)
        {
            if(pieceInfo[3*i+2].equals("BALL"))
            {
                threestates[i*6]=1;
                if(orientation<=5) {                 //rotating  if no openings and connections doesn't change
                    if (!pieceInfo[3 * i + 3].equals("0"))
                        threestates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) + orientation) % 6;
                    if(!pieceInfo[3 * i + 4].equals("0"))
                    threestates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) + orientation) % 6;
                }
                else
                {
                    orientation= orientation-6;
                    if(pieceInfo[3 * i +3].equals("1")||pieceInfo[3 * i +3].equals("4"))
                        threestates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) + orientation) % 6;
                    else if(pieceInfo[3*i+3].equals("3"))
                        threestates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) + 2 + orientation) % 6;
                    else if(pieceInfo[3*i+3].equals("5"))
                        threestates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) - 2 + orientation) % 6;
                    else if(pieceInfo[3*i+3].equals("2"))
                        threestates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) + 4 + orientation) % 6;
                    else if(pieceInfo[3*i+3].equals("6"))
                        threestates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) - 4 + orientation) % 6;
                    else
                        threestates[i* 6 +1]=0;

                    if(pieceInfo[3 * i +4].equals("1")||pieceInfo[3 * i +4].equals("4"))
                        threestates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) + orientation) % 6;
                    else if(pieceInfo[3*i+4].equals("3"))
                        threestates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) + 2 + orientation) % 6;
                    else if(pieceInfo[3*i+4].equals("5"))
                        threestates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) - 2 + orientation) % 6;
                    else if(pieceInfo[3*i+4].equals("2"))
                        threestates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) + 4 + orientation) % 6;
                    else if(pieceInfo[3*i+4].equals("6"))
                        threestates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) - 4 + orientation) % 6;
                    else
                        threestates[i*6+2]=0;

                    orientation=orientation+6;
                }
                if(threestates[i*6+1]==0&&(!pieceInfo[i*3+3].equals("0")))
                    threestates[i*6+1]=6;
                if(threestates[i*6+2]==0&&(!pieceInfo[i*3+4].equals("0")))
                    threestates[i*6+2]=6;
            }
            else
            {
                threestates[i*6+3]=1;
                if(orientation<=5){
                    if(!pieceInfo[3 * i + 3].equals("0"))
                    threestates[i*6+4]=(Integer.parseInt(pieceInfo[3*i+3])+orientation)%6;
                    if(!pieceInfo[3 * i + 4].equals("0"))
                    threestates[i*6+5]=(Integer.parseInt(pieceInfo[3*i+4])+orientation)%6;
                }
                else
                {
                    orientation= orientation-6;
                    if(pieceInfo[3 * i +3].equals("1")||pieceInfo[3 * i +3].equals("4"))
                        threestates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) + orientation) % 6;
                    else if(pieceInfo[3*i+3].equals("3"))
                        threestates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) + 2 + orientation) % 6;
                    else if(pieceInfo[3*i+3].equals("5"))
                        threestates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) - 2 + orientation) % 6;
                    else if(pieceInfo[3*i+3].equals("2"))
                        threestates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) + 4 + orientation) % 6;
                    else if(pieceInfo[3*i+3].equals("6"))
                        threestates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) - 4 + orientation) % 6;
                    else
                        threestates[i*6+4]=0;
                    if(pieceInfo[3 * i +4].equals("1")||pieceInfo[3 * i +4].equals("4"))
                        threestates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) + orientation) % 6;
                    else if(pieceInfo[3*i+4].equals("3"))
                        threestates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) + 2 + orientation) % 6;
                    else if(pieceInfo[3*i+4].equals("5"))
                        threestates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) - 2 + orientation) % 6;
                    else if(pieceInfo[3*i+4].equals("2"))
                        threestates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) + 4 + orientation) % 6;
                    else if(pieceInfo[3*i+4].equals("6"))
                        threestates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) - 4 + orientation) % 6;
                    else
                        threestates[i*6+5]=0;
                    orientation=orientation+6;
                }
                if(threestates[i*6+4]==0&&(!pieceInfo[i*3+3].equals("0")))
                    threestates[i*6+4]=6;
                if(threestates[i*6+5]==0&&(!pieceInfo[i*3+4].equals("0")))
                    threestates[i*6+5]=6;


            }
        }
//        for (int s : threestates)
//            System.out.println(s);
        return threestates;
    }

//    public static void main(String[] args) {
//        updatePegsPiecePlacement("CGL");
//   }
    /**
     * Determine whether a placement is valid.  To be valid, the placement must be well-formed
     * and each piece must correctly connect with each other.
     *
     * @param placement A placement string
     * @return True if the placement is valid
     */
    static boolean isPlacementValid(String placement) {
        // FIXME Task 7: determine whether a placement is valid
        return isPlacementWellFormed(placement) && isPiecePlacementWellFormed(placement);
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
