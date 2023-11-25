public class m2 {
    private int score;

    public m2(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public class main {
        {

        }

        public static void main(String[] args) {

            GameEntry[] A = new GameEntry[5];
            A[4] = new GameEntry();
            GameEntry[] B = new GameEntry[5];
            B[4] = new GameEntry();

            System.out.println("Score in A[4]: " + A[4].getScore());
            System.out.println("Score in B[4]: " + B[4].getScore());
        }

    }
}