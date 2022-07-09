package apcsa;

public class WordMatch {
	private String secret;
	public WordMatch(String word) {
		secret=word;
	}
	public int scoreGuess(String guess) {
		int occurences=0;
		for(int i=0;i<=secret.length()-guess.length();++i) {
			if (secret.substring(i, i+guess.length()).equals(guess)) {//google .equals()
				occurences++;
			}
		}
		System.out.println(occurences*guess.length()*guess.length());
		return occurences*guess.length()*guess.length();
	}
	public String findBetterGuess(String guess1,String guess2) {
		int score1=scoreGuess(guess1);
		int score2=scoreGuess(guess2);
		if(score1==score2) {
			if(guess1.compareTo(guess2)>0) {//google compareTo()
				return guess1;
			}
			return guess2;
		}else if(score1<score2) {
			return guess2;
		}
		return guess1;
	}
	public static void test() {
		WordMatch game=new WordMatch("mississippi");
		game.scoreGuess("i");
		game.scoreGuess("iss");
		game.scoreGuess("issipp");
		game.scoreGuess("mississippi");
		WordMatch game2=new WordMatch("aaaabbb");
		game2.scoreGuess("a");
		game2.scoreGuess("aa");
		game2.scoreGuess("aaa");
		game2.scoreGuess("aabb");
		game2.scoreGuess("c");
		WordMatch game3=new WordMatch("concatenation");
		System.out.println(game3.findBetterGuess("ten","nation"));
		System.out.println(game3.findBetterGuess("con","cat"));
	}
}
