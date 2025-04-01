package javastart;

public class Multipl {
	void printMultiplic() {
		printMultiplic(5);
	}
	
	void printMultiplic(int table) {
		printMultiplic(table, 1, 10);
	}
	
	void printMultiplic(int table, int from, int to) {
		for( int i=from ; i<=to; i++) {
			System.out.printf("%d X %d = %d", table, i, table * i).println();
		}
	}
}
