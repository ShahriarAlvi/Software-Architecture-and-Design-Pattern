public class Burger {
    private final String size;
    private final int pattyCount;
    private final int cheeseCount;
    private final int lettuceCount;
    private final int tomatoCount;

    private Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.pattyCount = builder.pattyCount;
        this.cheeseCount = builder.cheeseCount;
        this.lettuceCount = builder.lettuceCount;
        this.tomatoCount = builder.tomatoCount;
    }

    public String getSize() {
        return size;
    }

    public int getPattyCount() {
        return pattyCount;
    }

    public int getCheeseCount() {
        return cheeseCount;
    }

    public int getLettuceCount() {
        return lettuceCount;
    }

    public int getTomatoCount() {
        return tomatoCount;
    }

    public static class BurgerBuilder {
        private String size;
        private int pattyCount;
        private int cheeseCount;
        private int lettuceCount;
        private int tomatoCount;

        public BurgerBuilder(String size) {
            this.size = size;
        }

        public BurgerBuilder addPatty() {
            this.pattyCount++;
            return this;
        }

        public BurgerBuilder addCheese() {
            this.cheeseCount++;
            return this;
        }

        public BurgerBuilder addLettuce() {
            this.lettuceCount++;
            return this;
        }

        public BurgerBuilder addTomato() {
            this.tomatoCount++;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
