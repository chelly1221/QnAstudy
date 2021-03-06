package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Class_test {
	static ArrayList<ArrayList<Integer>> myGame = new ArrayList<ArrayList<Integer>>();

	static void printGame(ArrayList<ArrayList<Integer>> myGame) {
		for (int i = 0; i < myGame.size(); i++) {
			System.out.println(myGame.get(i));
		}
	}

	public Class_test(int gameNum) {
		for (int i = 1; i < gameNum + 1; i++) {
			ArrayList<Integer> numberPool = createNumList();
			ArrayList<Integer> game = new ArrayList<Integer>();
			for (int j = 0; j < 6; j++) {
				int poolSize = numberPool.size();
				int randNum = new Random().nextInt(poolSize);
				game.add(numberPool.get(randNum));
				numberPool.remove(randNum);
			}
			myGame.add(game);
		}
		sortList(myGame);
	}

	public ArrayList<ArrayList<Integer>> sortList(ArrayList<ArrayList<Integer>> myGame) {
		for (int i = 0; i < myGame.size(); i++) {
			Collections.sort(myGame.get(i));
		}
		return myGame;
	};

	public ArrayList<Integer> createNumList() {
		ArrayList<Integer> numberPool = new ArrayList<Integer>();
		for (int i = 1; i < 46; i++) {
			numberPool.add(i);
		}
		return numberPool;
	};

	public static void main(String[] args) {
		Class_test lotto = new Class_test(5);
		printGame(lotto.myGame);

	}

}
