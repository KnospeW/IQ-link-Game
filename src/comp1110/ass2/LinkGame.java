package comp1110.ass2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * This class provides the text interface for the Link Game
 *
 * The game is based directly on Smart Games' IQ-Link game
 * Written by Alex and Yicong
 * (http://www.smartgames.eu/en/smartgames/iq-link)
 */
public class LinkGame {
    /**
     * Determine whether a piece placement is well-formed according to the following:
     * - it consists of exactly three characters
     * - the first character is in the range A .. X
     * - the second character is in the range A .. L
     * - the third character is in the range A .. F if the second character is A, otherwise
     * in the range A .. L
     * Written by Yicong, and rewritten for presentation by Alex.
     *
     * @param piecePlacement A string describing a piece placement
     * @return True if the piece placement is well-formed
     */
    static boolean isPiecePlacementWellFormed(String piecePlacement) {
        int len = piecePlacement.length();
        char[] chars = piecePlacement.toCharArray();
        //judge the range of each character and for the third character has two different situations
        return len == 3
            && chars[0] >= 'A'
            && chars[0] <= 'X'
            && chars[1] >= 'A'
            && chars[1] <= 'L'
            && ((chars[2] >= 'A'
                    && chars[2] <= 'L'
                    && chars[1] != 'A')
                || (chars[2] >= 'A'
                    && chars[2] <= 'F'
                    && chars[1] == 'A')
        );
    }

    /**
     * Determine whether a placement string is well-formed:
     * - it consists of exactly N three-character piece placements (where N = 1 .. 12);
     * - each piece placement is well-formed
     * - no piece appears more than once in the placement
     * Written by Yicong.
     *
     * @param placement A string describing a placement of one or more pieces
     * @return True if the placement is well-formed
     */
    static boolean isPlacementWellFormed(String placement) {
        if (placement == null || placement.equals("") || placement.length() % 3 != 0)
            return false;

        String[] s = new String[placement.length() / 3];  //divide the string placement into sets of 3 characters

        for (int i = 0; i < placement.length() / 3; i++)
            s[i] = placement.substring(i * 3, i * 3 + 3);      //placement to piece
        for (String str : s)
            if (!isPiecePlacementWellFormed(str))
                return false;

        HashSet set = new HashSet();

        for (String str : s)                //hash set without duplicate,compare hash with the length of String array
            set.add(str.charAt(1));
        return set.size() == s.length;          // tighter form

    }

    /**
     * Return a array of peg locations according to which pegs the given piece placement touches.
     * The values in the array should be ordered according to the units that constitute the
     * piece.
     * The code needs to account for the origin of the piece, the piece shape, and the piece
     * orientation.
     * Written by Yicong.
     *
     * @param piecePlacement A valid string describing a piece placement
     * @return An array of integers corresponding to the pegs which the piece placement touches,
     * listed in the normal order of units for that piece.   The value 0 corresponds to
     * peg 'A', 1 to peg 'B', etc.
     */
    static int[] getPegsForPiecePlacement(String piecePlacement) {
        int[] PegLocations = new int[3];
        int[] OddNeighbour = {-1, -7, -6, +1, +6, +5};
        int[] EvenNeighbour = {-1, -6, -5, +1, +7, +6};
        int br1, br2;

        /*
             1    2         neighbours records the origin's neighbour pegs in this order,
          0  origin  3      pay attention that the relationships are not the same
             5    4         for odd and even rows
         */
        int origin = piecePlacement.charAt(0) - 'A';
        int PieceType = piecePlacement.charAt(1) - 'A';
        int orientation = piecePlacement.charAt(2) - 'A';

        int row = 1 + origin / 6;           //row 1 2 3 4
        int col = 1 + origin % 6;           //column 1 2 3 4 5 6


        if (orientation < 6) {
            br1 = (row % 2 == 0) ? (origin + EvenNeighbour[orientation]) : (origin + OddNeighbour[orientation]);
            if (PieceType < 3)       //which shows a line type
                br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation + 3) % 6]) : (origin + OddNeighbour[(orientation + 3) % 6]);
            else if (PieceType < 8)   //a big v type
                br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation + 2) % 6]) : (origin + OddNeighbour[(orientation + 2) % 6]);
            else                        // a v type
                br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation + 1) % 6]) : (origin + OddNeighbour[(orientation + 1) % 6]);
        } else {
            orientation = orientation - 6;      //flip change the start like the position 2 will flip to 4, and 1 flip to 5
            br1 = (row % 2 == 0) ? (origin + EvenNeighbour[orientation]) : (origin + OddNeighbour[orientation]);
            if (PieceType < 3)
                br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation + 3) % 6]) : (origin + OddNeighbour[(orientation + 3) % 6]);
            else if (PieceType < 8)
                br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation + 4) % 6]) : (origin + OddNeighbour[(orientation + 4) % 6]);
            else
                br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation + 5) % 6]) : (origin + OddNeighbour[(orientation + 5) % 6]);
        }

        // we should judge whether it's off the grid
        int rowBr1 = br1 / 6 + 1;
        int colBr1 = br1 % 6 + 1;
        int rowBr2 = br2 / 6 + 1;
        int colBr2 = br2 % 6 + 1;
        //if the column and row are not ajacent or the index out of 0-23 it is off-grid
        if (Math.abs(rowBr1 - row) > 1 || Math.abs(colBr1 - col) > 1 || br1 > 23 || br1 < 0) {
            br1 = -1;
        }
        if (Math.abs(rowBr2 - row) > 1 || Math.abs(colBr2 - col) > 1 || br2 > 23 || br2 < 0) {
            br2 = -1;
        }
        PegLocations[0] = br1;
        PegLocations[1] = origin;
        PegLocations[2] = br2;


        return PegLocations;
    }

    /**
     * Translates a piece placement string to update peg states.
     * Indicates whether the piece's segment has a ball or ring, and the directions for openings and connections.
     * Written by Yicong.
     *
     * @param piecePlacement A three-character piece placement string
     * @return An integer array containing the states for the origin and branch segments
     */
    static int[] updatePegsPiecePlacement(String piecePlacement) {
       /*
         three states will contain the states for three pegs
         0-5 for the peg of origin, 6-11 for branch1,12-17 for branch2
         each 6 digits have the same meaning of the pegs state
         _ _ _ _ _ _ an int array first 3 for ball and last 3 for ring
         _ _ _ the first digits 1/0 indicates whether there exists a ball/ring
         the second and third one indicates the direction of openings and connections
           2  3
         1      4
           6  5
        */
        int[] threeStates = new int[18];
        Piece currPiece = Piece.valueOf(piecePlacement.substring(1, 2)); // initiate the specific piece
        int orientation = piecePlacement.charAt(2) - 'A';           //orientation is presented as a int in 0-11
        String[] pieceInfo = currPiece.getPieceInfo();
        // do for three times to get the state of three components in one piece, the order
        // the function behind is to update the states of each ball/ring
        for (int i = 0; i < 3; i++) {
            if (pieceInfo[3 * i + 2].equals("BALL")) {
                threeStates[i * 6] = 1;  // the first element indicates whether a ball exists
                if (orientation <= 5) {                 //rotating if no openings and connections doesn't change,if have openings, openings should rotates
                    if (!pieceInfo[3 * i + 3].equals("0"))
                        threeStates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) + orientation) % 6;
                    if (!pieceInfo[3 * i + 4].equals("0"))
                        threeStates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) + orientation) % 6;
                } else {
                    orientation = orientation - 6;    // it's a flip, first flip and then rotate for orientation times
                    // orientation 1,4 no change when flip, 3,5 exchange and 2.6 exchange when flip
                    // so the orientation 6 indicates flip, other will first flip then rotates

                    // first do for the second element in the state
                    if (pieceInfo[3 * i + 3].equals("1") || pieceInfo[3 * i + 3].equals("4"))
                        threeStates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) + orientation) % 6;
                    else if (pieceInfo[3 * i + 3].equals("3"))
                        threeStates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) + 2 + orientation) % 6;
                    else if (pieceInfo[3 * i + 3].equals("5"))
                        threeStates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) - 2 + orientation) % 6;
                    else if (pieceInfo[3 * i + 3].equals("2"))
                        threeStates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) + 4 + orientation) % 6;
                    else if (pieceInfo[3 * i + 3].equals("6"))
                        threeStates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) - 4 + orientation) % 6;
                    else
                        //no opening or connection, no change
                        threeStates[i * 6 + 1] = 0;

                    // then do for the third element in the states, this is just for components with two openings and connections
                    if (pieceInfo[3 * i + 4].equals("1") || pieceInfo[3 * i + 4].equals("4"))
                        threeStates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) + orientation) % 6;
                    else if (pieceInfo[3 * i + 4].equals("3"))
                        threeStates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) + 2 + orientation) % 6;
                    else if (pieceInfo[3 * i + 4].equals("5"))
                        threeStates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) - 2 + orientation) % 6;
                    else if (pieceInfo[3 * i + 4].equals("2"))
                        threeStates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) + 4 + orientation) % 6;
                    else if (pieceInfo[3 * i + 4].equals("6"))
                        threeStates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) - 4 + orientation) % 6;
                    else
                        threeStates[i * 6 + 2] = 0;

                    orientation = orientation + 6;
                }
                if (threeStates[i * 6 + 1] == 0 && (!pieceInfo[i * 3 + 3].equals("0")))
                    threeStates[i * 6 + 1] = 6;
                if (threeStates[i * 6 + 2] == 0 && (!pieceInfo[i * 3 + 4].equals("0")))
                    threeStates[i * 6 + 2] = 6;
            } else {
                // if the component is a ring, the same thing but the update 3,4,5 of the state array
                threeStates[i * 6 + 3] = 1;
                if (orientation <= 5) {
                    if (!pieceInfo[3 * i + 3].equals("0"))
                        threeStates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) + orientation) % 6;
                    if (!pieceInfo[3 * i + 4].equals("0"))
                        threeStates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) + orientation) % 6;
                } else {
                    orientation = orientation - 6;
                    if (pieceInfo[3 * i + 3].equals("1") || pieceInfo[3 * i + 3].equals("4"))
                        threeStates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) + orientation) % 6;
                    else if (pieceInfo[3 * i + 3].equals("3"))
                        threeStates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) + 2 + orientation) % 6;
                    else if (pieceInfo[3 * i + 3].equals("5"))
                        threeStates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) - 2 + orientation) % 6;
                    else if (pieceInfo[3 * i + 3].equals("2"))
                        threeStates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) + 4 + orientation) % 6;
                    else if (pieceInfo[3 * i + 3].equals("6"))
                        threeStates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) - 4 + orientation) % 6;
                    else
                        threeStates[i * 6 + 4] = 0;
                    if (pieceInfo[3 * i + 4].equals("1") || pieceInfo[3 * i + 4].equals("4"))
                        threeStates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) + orientation) % 6;
                    else if (pieceInfo[3 * i + 4].equals("3"))
                        threeStates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) + 2 + orientation) % 6;
                    else if (pieceInfo[3 * i + 4].equals("5"))
                        threeStates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) - 2 + orientation) % 6;
                    else if (pieceInfo[3 * i + 4].equals("2"))
                        threeStates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) + 4 + orientation) % 6;
                    else if (pieceInfo[3 * i + 4].equals("6"))
                        threeStates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) - 4 + orientation) % 6;
                    else
                        threeStates[i * 6 + 5] = 0;
                    orientation = orientation + 6;
                }
                //states should contains direction of 1 2 3 4 5 6 but 6%6=0 so if it is 6, the chance is that it should be 6 not zero
                if (threeStates[i * 6 + 4] == 0 && (!pieceInfo[i * 3 + 3].equals("0")))
                    threeStates[i * 6 + 4] = 6;
                if (threeStates[i * 6 + 5] == 0 && (!pieceInfo[i * 3 + 4].equals("0")))
                    threeStates[i * 6 + 5] = 6;
            }
        }
        return threeStates;
    }

    /**
     * Determine whether a placement is valid.  To be valid, the placement must be well-formed
     * and each piece must correctly connect with each other.
     * Written by Yicong.
     *
     * @param placement A placement string
     * @return True if the placement is valid
     */
    public static boolean isPlacementValid(String placement) {
        // first set all the pegs states is{0,0,0,0,0,0}
         int[] pegStates=new int[6];
         Pegs a= new Pegs(pegStates);     Pegs b= new Pegs(pegStates);  Pegs c= new Pegs(pegStates);   Pegs d= new Pegs(pegStates);
         Pegs e= new Pegs(pegStates);     Pegs f= new Pegs(pegStates);  Pegs g= new Pegs(pegStates);   Pegs h= new Pegs(pegStates);
         Pegs ii= new Pegs(pegStates);    Pegs jj= new Pegs(pegStates); Pegs kk= new Pegs(pegStates);  Pegs l= new Pegs(pegStates);
         Pegs m= new Pegs(pegStates);     Pegs n= new Pegs(pegStates);  Pegs o= new Pegs(pegStates);   Pegs p= new Pegs(pegStates);
         Pegs q= new Pegs(pegStates);     Pegs r= new Pegs(pegStates);  Pegs s= new Pegs(pegStates);   Pegs t= new Pegs(pegStates);
         Pegs u= new Pegs(pegStates);     Pegs v= new Pegs(pegStates);  Pegs w= new Pegs(pegStates);   Pegs x= new Pegs(pegStates);
         Pegs[] pegs = {a,b,c,d,e,f,g,h,ii,jj,kk,l,m,n,o,p,q,r,s,t,u,v,w,x};

        if (!isPlacementWellFormed(placement))
            return false;
        else {
            String[] str = new String[placement.length() / 3];  //divide the string placement into sets of 3 characters
            for (int mm= 0; mm < placement.length() / 3; mm++)
                str[mm] = placement.substring(mm * 3, mm * 3 + 3);      //placement to piece

            for (String piecePlacement : str) {
                int[] pegIndex = getPegsForPiecePlacement(piecePlacement);   // get the peg number for each piece, the order is br1,origin,br2
                for(int pegPosition:pegIndex)
                    if(pegPosition<0||pegPosition>23)            //off-grid is not good
                        return false;

                int temp=pegIndex[0];
                pegIndex[0]=pegIndex[1];
                pegIndex[1]=temp;

                 //exchange the position of br1 and origin to make the order become origin,br1,br2, the same with threeStates from updatePegsState
                int[] updateStates=updatePegsPiecePlacement(piecePlacement);
                for(int i=0;i<3;i++) {       // do for three components
                    int index= pegIndex[i];
                    int[] currStates=pegs[index].getStateArray();    //the current states of the peg
                    int[] updatePegStates= Arrays.copyOfRange(updateStates,i*6,i*6+6);  //the states for each component
                    if(updatePegStates[0]==1)                //the component is a ball
                    {
                        // the current states shouldn't involve a ball
                        if (currStates[0]==0) {
                            if(currStates[3]==0||(currStates[3]==1&&(currStates[4]==updatePegStates[1]&&currStates[5]==updatePegStates[2])||(currStates[4]==updatePegStates[2]&&currStates[5]==updatePegStates[1]||(currStates[4]==updatePegStates[1]&&updatePegStates[2]==0)||(currStates[5]==updatePegStates[1]&&updatePegStates[2]==0)))) {
                                  //the current states can involve a ring with the same direction. notice that the order of the two openings doesn't matter.
                                 // so the judgement involve two different situations
                                System.arraycopy(currStates, 3, updatePegStates, 3, 3);
                                pegs[index].updateStates(updatePegStates);

                                //change the pegs states

                            } else
                                return false;
                        } else
                            return false;
                    } else if(updatePegStates[3]==1) {       //ring is also the same
                        if (currStates[3]==0) {
                            if(currStates[0]==0||(currStates[0]==1&&(currStates[1]==updatePegStates[4]&&currStates[2]==updatePegStates[5])||(currStates[1]==updatePegStates[5]&&currStates[2]==updatePegStates[4]||(currStates[1]==updatePegStates[4]&&currStates[2]==0)||(currStates[1]==updatePegStates[5]&&currStates[2]==0)))) {
                                System.arraycopy(currStates, 0, updatePegStates, 0, 3);
                                pegs[index].updateStates(updatePegStates);
                            } else
                                return false;
                        } else
                            return false;

                    }
                }
            }
            return true;
        }
    }

    /**
     * Return an array of all solutions given a starting placement.
     * Written by Alex.
     *
     * @param placement  A valid piece placement string.
     * @return An array of strings, each describing a solution to the game given the
     * starting point provided by placement.
     */
    public static String[] getSolutions(String placement) {
        ArrayList<String> solutions = new ArrayList<>();

//        System.out.println("Given placement "+placement);

        // Cheat a little bit by starting our search after the last piece given.
        /* if (placement.length() != 0) {
            char lastPiece = placement.charAt(placement.length() - 2);
            findSolution(lastPiece, placement, solutions);
        } else*/ findSolution('A', placement, solutions);

//        System.out.println();
//        System.out.println("Solutions:");
//        solutions.forEach(System.out::println);
//        System.out.println();

        // Return the solutions as an array rather than a list.
        String[] solutionString = new String[solutions.size()];
        for (int i = 0; i < solutions.size(); i++) solutionString[i] = solutions.get(i);
        return solutionString;
    }

    /**
     * Finds all solutions to a given placement string and stores them in a provided array list.
     * Recurses on itself to pass continually built placement strings and solution arrays.
     * Structure inspired by Bob Carpenter, adapted by Alex.
     *  https://bob-carpenter.github.io/games/sudoku/java_sudoku.html
     *
     * @param piece The initial piece to start searching from.
     * @param placement The initial valid piece placement string.
     * @param solutions The (potentially empty) array of solution strings, which will be written to.
     * @return True if a solution has been found, or false otherwise.
     */
    private static boolean findSolution(char piece, String placement, ArrayList<String> solutions) {
        // When we hit a full string, check if it's valid (which it should be anyway, but it doesn't hurt to double
        // check), and unique to what's already found.
        if (placement.length() == 36) {
            if(isPlacementWellFormed(placement) && isPlacementValid(placement) && !solutions.contains(placement)) {
                // Write out results to solutions.txt.
//                FileWriter writer = null;
//                try {
//                    writer = new FileWriter("assets/solutions.txt", true);
//                    writer.write(placement);
//                } catch (IOException e) { e.printStackTrace(); }
//                finally {
//                    try {
//                        if (writer != null)
//                            writer.close();
//                    } catch (IOException e) { e.printStackTrace(); }
//                }
                solutions.add(placement);
            }
//            return true;
            /*
              Returning true here prevents the algorithm from recursing once it finds a result. This is a good and bad thing.
              On one hand, it will stop as soon as it finds the first result, giving a much faster return on one-solution systems.
              On the other hand, it obviously won't find every solution if there is more than one.
             */
        }

        // Just a quick way to check what pegs are valid.
        ArrayList<Character> openPegs = new ArrayList<>();
        ArrayList<Character> usedPieces = new ArrayList<>();
        // These pieces are closed rings and can't have any other segment share the same peg.
        List ringPieces = Arrays.asList('B','C','D','E','F','H');

        for (char p = 'A'; p <= 'X'; p++)
            openPegs.add(p);
        for (int i = 0; i < placement.length() / 3; i++) {
            usedPieces.add(placement.charAt(i * 3 + 1));
            if (ringPieces.contains(placement.charAt(i * 3 + 1)))
                openPegs.remove(Character.valueOf(placement.charAt(i*3)));
        }

        // Don't use anything already on the board.
        if (usedPieces.contains(piece)) {
            return findSolution(++piece, placement, solutions);
        }

        /*
          Fairly straight-forward recursion. For a given piece, for each peg and rotation combo, check if the piece will
          fit into the provided placement. If it does, then restart the process with the added piece. Since a valid
          solution will return true, the return will propagate all the way down to the first added piece call.
         */
        for (char peg : openPegs) {
            for (char rot = 'A'; rot <= 'L'; rot++) {
                String toPlace = "" + peg + piece + rot;
                if (isPlacementValid(placement + toPlace)) {
                    if (findSolution(piece, placement + toPlace, solutions))
                        return true;
                }
            }
        }

        // If it hits this, then a piece doesn't fit. If one piece doesn't fit, there won't be a solution. At that point,
        // there's no point continuing.
        return false;
    }

    /**
     * Finds a list of placements that uniquely give the provided solution.
     * NOT exhaustive; it runs a few iterations of removing a RANDOM piece to find placements.
     * Written by Alex.
     *
     * @param solution A valid solution string.
     * @return True if a placement is minimal (i.e., 4 pieces long), and false otherwise.
     */
    private static boolean findUniqueStart (String solution, ArrayList<String> uniquePlacements) {
        int iterations = 4;

        if (solution.length() <= 9)
            return true;   // Stops us from testing 3-piece placements, which take forever.

        for (int c = 0; c < iterations; c++) {
            String tmp = removeRandomPiece(solution);   // Remove a piece.
            if (getSolutions(tmp).length == 1) {        // Check if the updated placement has only one solution.
                uniquePlacements.add(tmp);
                System.out.println(tmp);
                if (findUniqueStart(tmp, uniquePlacements))                // Recurse.
                    return true;
            }
        }

        System.out.println(uniquePlacements);            // No more placements, so let's print them.
        return false;
    }

    /**
     * Helper method for findUniqueStart. Removes a random piece from a solution string.
     *
     * @param solution A valid solution string.
     * @return The same solution string, sans one piece.
     */
    private static String removeRandomPiece(String solution) {
        Random r = new Random();
        List<String> splitPieces = new ArrayList<>();
        for (int i = 0; i < solution.length() / 3; i ++) {
            splitPieces.add(solution.substring(i * 3, i * 3 + 3));
        }

        splitPieces.remove(r.nextInt(splitPieces.size()));
        String rtn = "";
        for (String s : splitPieces) {
            rtn += s;
        }

        return rtn;
    }

    /**
     * Helper method for findUniqueStart. Removes a given piece from a solution string.
     *
     * @param solution A valid solution string.
     * @param piece A piece character.
     * @return The same solution string, sans the provided piece.
     */
    private static String removePiece(String solution, char piece) {
        List<String> splitPieces = new ArrayList<>();
        for (int i = 0; i < solution.length() / 3; i ++) {
            splitPieces.add(solution.substring(i * 3, i * 3 + 3));
        }

        String rtn = "";
        for (String s : splitPieces)
            if (s.charAt(1) != piece)
                rtn += s;

        return rtn;
    }

    public static void main(String[] args) {
        long init = System.nanoTime();
        String solution = "";
        String placement = "BAAJEJHHDRFE";
//        ArrayList<String> placements = new ArrayList<>();
//        findUniqueStart(solution, placements);
//        System.out.println(placements);

//        System.out.println(isPlacementValid("BAAEBDVCJODDHEAMFKPGLLHHIICKJGWKCNLE"));

        System.out.println(Arrays.toString(getSolutions(placement)));

        System.out.println("Total time: "+((System.nanoTime() - init) / 1000000)+"ms");
    }
}
