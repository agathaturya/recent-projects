public class MovieCollection {

	public static void main(String[] args) {

		// variables
		// unordered MovieList
		OrderedMovieList uList = new OrderedMovieList();

		Movie m1 = new Movie("Guardians of the Galaxy", 2014);
		Movie m2 = new Movie("Shawn of the Dead", 2004);
		Movie m3 = new Movie("The Avengers", 2012);
		Movie m4 = new Movie("Pan's Labyrinth", 2006);
		Movie m5 = new Movie("Big Hero 6", 2014);
		Movie m6 = new Movie("Fantastic Beasts and Where to Find Them", 2016);

		uList.add(m1);
		uList.add(m2);
		uList.add(m3);
		uList.add(m4);
		uList.add(m5);
		uList.add(m6);
		
		System.out.println(uList);
	}
}
//Ordered