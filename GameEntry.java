public class GameEntry {
       private int score;
                public void GameEntry ( int score){
                        this.score = score;
                }
                public int getScore() {
                        return score;

                }
                public void setScore(int score){
                        this.score = score;
                 class main {
                       public static void main(String [] args){
                               GameEntry[] A = new GameEntry[5];
                               A[4] = new GameEntry();
                               GameEntry[] B = A.clone();
                                       A[4].setScore(550);
                               System.out.println("Score in A[4]: " +A[4]);
                               System.out.println("Score in B[4]: "+ B[4]);
                       }

               }
        }
}