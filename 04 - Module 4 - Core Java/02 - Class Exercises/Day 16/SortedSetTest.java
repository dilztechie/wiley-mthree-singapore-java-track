public class SortedSetTest {
	public static void main(String[] args) {
		String[] strMovies = {
				"The Shawshank Redemption",
				"The Godfather",
				"The Godfather II",
				"The Dark Knight", 
				"12 Angry Men",
				"Schindler's List",
				"The Lord of the Rings: The Return of the King",
				"Pulp Fiction",
				"The Good, the Bad, and the Ugly",
				"Fight Club", 
				"Forest Gump",
				"Inception",
				"12 Angry Men"
		};
		/*
		 * java.util.SortedSet an interface extends java.util.Set interface
		 * java.util.TreeSet is a class which implements the SortedSet
		 */
		java.util.SortedSet<String> movies = new java.util.TreeSet<>(java.util.Arrays.asList(strMovies));
		
		System.out.println("Sorted Set: ");
		int count = 1;
		for(String movie : movies) {
			System.out.println(count++ + ". " + movie);
		}
	}
}