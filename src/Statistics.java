// Class for printing game statistics.
public class Statistics {
	double  stat;
    public void printStatistics(int wins, int losses, int games) {
    	stat= (double)wins/losses;
        System.out.print("\nYou have played " + games + " games. You won " 
    	+ wins + " times and lost " + losses + " times."+" Your win rate is: "+stat+"\n\n");
    }
}
