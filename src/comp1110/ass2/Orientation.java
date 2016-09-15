package comp1110.ass2;

/**
 * Created by azphr on 17/08/2016.
 */
public enum Orientation {

    OA,OB,OC,OD,OE,OF {
        @Override
        public Orientation rotate() {
            return OA;
        }
    },OG {
        @Override
        public Orientation flip() {
            return OA;
        }
    },OH {
        @Override
        public Orientation flip() {
            return OB;
        }
    },OI {
        @Override
        public Orientation flip() {
            return OC;
        }
    },OJ {
        @Override
        public Orientation flip() {
            return OD;
        }
    },OK {
        @Override
        public Orientation flip() {
            return OE;
        }
    },OL {
        @Override
        public Orientation rotate() {
            return OG;
        }
        @Override
        public Orientation flip() {
            return OF;
        }
    };

//    @Override
//    public String toString() {
//        return
//    }

    public Orientation rotate() {
        return values()[ordinal() + 1];
    }

    public Orientation flip() {
        return values()[ordinal() + 6];
    }
}
