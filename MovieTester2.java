import java.util.Scanner;


public class MovieTester2 {

	public static void main(String[] args) {
		//variables
		Scanner scan = new Scanner (System.in);
		MovieList myMovies = new MovieList();
		Movie m1 = new Movie ("Doctor Strange", 2016);
		Movie m2 = new Movie ("Moana", 2016);
		Movie m3 = new Movie ("Fantastic Beasts and Where to Find Them", 2016);
		Movie m4 = new Movie ("Shaun of the Dead", 2004);
		Movie m5 = new Movie ("Pan's Labyrinth ", 2006);
		Movie m6 = new Movie ("Guardians of the Galaxy", 2014);
		Movie m7 = new Movie ("Big Hero 6", 2014);
		Movie m8 = new Movie ("The Imitation Game", 2014);
		Movie temp;
		
		MovieList yourMovies = new OrderedMovieList();
		
		MovieList list3 = new MovieList();
		
		myMovies.add(m1);
		myMovies.add(m2);
		myMovies.add(m3);
		myMovies.add(m4);
		myMovies.add(m5);
		myMovies.add(m6);
		myMovies.add(m7);
		myMovies.add(m8);
		System.out.println("unordered list\n");
		System.out.println(myMovies);
		System.out.println("****************************************");
		System.out.println("Adding Doctor Strange into empty list");
		yourMovies.add(m1);
		System.out.println("Printing list \n"+ yourMovies + "\n\n");
	
		
		System.out.println("Adding Moana");
		yourMovies.add(m2);
		System.out.println("Printing list \n"+ yourMovies + "\n\n");
	
	
		System.out.println("Adding Fantastic");
		yourMovies.add(m3);
		System.out.println("Printing list\n"+ yourMovies + "\n\n");
		
	
		
		System.out.println("Adding Shawn");		
		yourMovies.add(m4);
		System.out.println("Printing list\n"+ yourMovies + "\n\n");
		
		System.out.println("Adding Pan");
		yourMovies.add(m5);
		System.out.println("Printing list \n"+ yourMovies + "\n\n");
		
		
		System.out.println("Adding Guard");
		yourMovies.add(m6);
		System.out.println("Printing list \n"+ yourMovies + "\n\n");

		System.out.println("Adding Big");
		yourMovies.add(m7);
		System.out.println("Printing list\n"+ yourMovies + "\n\n");
	
		
		System.out.println("Adding The Imitation Game");
		yourMovies.add(m8);
		System.out.println("Printing list \n"+ yourMovies + "\n\n");
		
		
		System.out.println("\n\nCompleted Ordered list");
		System.out.println(yourMovies);
		
		System.out.println("\n****************************"
				+ "\ntesting remove methods...\n"
				+ "****************************\n");
		
		//testing removeFirst
		System.out.println(myMovies);
		System.out.println("RemoveFirst in a list" + myMovies.removeFirst());
		System.out.println();
		System.out.println(myMovies);
		
		list3.add(m1);
		System.out.println("remove first on list of  size 1\n" + list3);
		System.out.println("RemoveFirst " + list3.removeFirst());
		System.out.println("\nlist now...\n" + list3);
		
		System.out.println("remove first on empty list\n" + list3);
		System.out.println("RemoveFirst " + list3.removeFirst());
		System.out.println("\nlist now...\n" + list3);
		
		//testing remove last
		System.out.println(myMovies);
		System.out.println("RemoveLast " + myMovies.removeLast());
		System.out.println();
		System.out.println(myMovies);
		
		list3.add(m1);
		System.out.println("Remove LAST on list of 1\n" + list3);
		System.out.println("RemoveLast " + list3.removeLast());
		System.out.println("\nlist now...\n" + list3);
		
		System.out.println("remove Last on empty list\n" + list3);
		System.out.println("RemoveLast " + list3.removeLast());
		System.out.println("\nlist now...\n" + list3);
		
		System.out.println("\n****************************"
				+ "\nremoving specific movies from an orderd list...\n"
				+ "****************************\n");
		System.out.println("here is the original list...\n");
		System.out.println(yourMovies);
		
		temp = new Movie ("The Imitation Game", 2014);
		System.out.println("removing The Imitation Game\n " + yourMovies.remove(temp));
		System.out.println("updated list...\n" + yourMovies);
		System.out.println();
		
		System.out.println("removing Bigh Hero 6 from list...");
		temp = new Movie ("Big Hero 6", 2014);
		System.out.println(yourMovies.remove(temp));
		System.out.println("updated list...\n" + yourMovies);
		System.out.println();
		
		System.out.println("removing Guardians of the Galaxy from list...");
		temp = new Movie ("Guardians of the Galaxy", 2014);
		System.out.println(yourMovies.remove(temp));
		System.out.println("updated list...\n" + yourMovies);
		System.out.println();
		
		System.out.println("removing a movie that is not in the list...");
		temp = new Movie ("Ziggy", 2014);
		System.out.println(yourMovies.remove(temp));
		System.out.println("updated list...\n" + yourMovies);
		System.out.println();
		
		System.out.println("\n****************************"
				+ "\nremoving specific movies from an unorderd list...\n"
				+ "****************************\n");
		System.out.println("here is the original list...\n");
		System.out.println(myMovies);
		
		temp = new Movie ("Moana", 2016);
		System.out.println("removing Moana\n " + myMovies.remove(temp));
		System.out.println("updated list...\n" + myMovies);
		System.out.println();
		
		System.out.println("removing Bigh Hero 6 from list...");
		temp = new Movie ("Big Hero 6", 2014);
		System.out.println(myMovies.remove(temp));
		System.out.println("updated list...\n" + myMovies);
		System.out.println();
		
		System.out.println("removing Shaun of the Dead from list...");
		temp = new Movie ("Shaun of the Dead", 2004);
		System.out.println(myMovies.remove(temp));
		System.out.println("updated list...\n" + myMovies);
		System.out.println();
		
		System.out.println("removing a movie that is not in the list...");
		temp = new Movie ("Ziggy", 2014);
		System.out.println(myMovies.remove(temp));
		System.out.println("updated list...\n" + myMovies);
		System.out.println();
		
		list3.add(new Movie ("ROGUE ONE: A STAR WARS STORY", 2016));
		System.out.println("removing from a list of 1");
		System.out.println("list 3\n" + list3);
		System.out.println("removing ROGUE ONE: A STAR WARS STORY");
		temp = new Movie ("ROGUE ONE: A STAR WARS STORY", 2016);
		System.out.println(list3.remove(temp));
		System.out.println("list 3 is now...\n " + list3);
		System.out.println("Calling remove on an EMPTY LIST");
		System.out.println(list3.remove(temp));
	}

}
