package Lab3and4;

public enum Time {
    MORNING {
        public Time changeTime() {
            System.out.println("Наступает полдень");
            return AFTERNOON;
        }
    },
    AFTERNOON {
        public Time changeTime() {
            System.out.println("Наступает вечер");
            return EVENING;
        }
    },
    EVENING {
        public Time changeTime() {
            System.out.println("Наступает утро");
            return MORNING;
        }
    };

    public abstract Time changeTime();
}
