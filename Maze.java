//Jorge Berroa 
//COP3503
//Maze solve Assignment 




public class Maze {
	public static void solve(char[][] maze) {
		// helper method to solve maze
		solve(maze, 1, 1);
		
	}

	public static boolean solve(char[][] maze, int x, int y) {

		// base cases if we found the exit return true
		if (maze[x][y] == 'e')
			return true;
		// if the spot im looking at does not equal s place a dot
		if (maze[x][y] != 's')
			maze[x][y] = '.';

		// if statements determine if im touching an outer wall
			if (x != 0&&x != maze.length - 1)
				if (y != maze[0].length - 1 && y != 0) {
					//if statements check surrounding spots around current spot if its open keep going that way else
					// return to where you made your last decision and go the other way 
					if (maze[x][y + 1] == ' ' || maze[x][y + 1] == 'e')
						if (solve(maze, x, y + 1))
							return true;

					if (maze[x][y - 1] == ' ' || maze[x][y - 1] == 'e')
						if (solve(maze, x, y - 1))
							return true;

					if (maze[x + 1][y] == ' ' || maze[x + 1][y] == 'e')
						if (solve(maze, x + 1, y))
							return true;

					if (maze[x - 1][y] == ' ' || maze[x - 1][y] == 'e')
						if (solve(maze, x - 1, y))
							return true;
				}
			//if false return to last place decision was made and erase the trail 
			// as you return to that place.
		if (maze[x][y] != 's')
			maze[x][y] = ' ';
		return false;

	}
	public static double difficultyRating(){
		return 1;
	}
	public static double hoursSpent(){
		return 1.2;
	}

}
