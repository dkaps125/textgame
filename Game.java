package textgame;

import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int state = 1;
		int points = 0;
		String input = "";
		while (true) {
			switch (state) {
			case 1:
				System.out.println("You are standing at the door of an abandoned school.\n"
						+ "What do you do? <f, p>");
				input = in.next();
				
				if (input.equals("f")) {		//state change
					System.out.println("You're stupid. Just plain stupid.");
					state = 2;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 2:
				System.out.println("You are standing in the cafeteria of the abandoned school.\n"
						+ "What do you do? <l, r, b, p>");
				input = in.next();
				
				if (input.equals("b")) {		//state change
					System.out.println("You hear a kid scream somewhere in the depths of the school.");
					state = 1;
				}
				
				else if (input.equals("l")) {		//state change
					System.out.println("Do you have a death wish?");
					state = 3;
				}
				
				else if (input.equals("r")) {		//state change
					System.out.println("Do you have a death wish?");
					points++;
					state = 6;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 3:
				System.out.println("You enter the school's kitchen. You see a glowing light ahead.\n" +
						"What do you do? <f, b, p>");
				input = in.next();
				
				if (input.equals("b")) {		//state change
					System.out.println("Better safe than sorry, wimp.");
					state = 2;
				}
				
				else if (input.equals("f")) {		//state change
					System.out.println("Daring. A fine trait.");
					state = 4;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 4:
				System.out.println("You come to a door that is partway open, letting red light through.\n" +
				"What do you do? <f, b, p>");
				input = in.next();
		
				if (input.equals("b")) {		//state change
					System.out.println("Maybe you don't want to know what's behind that door...");
					state = 3;
				}
		
				else if (input.equals("f")) {		//state change
					System.out.println("You open the door and enter the room beyond.");
					state = 5;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 5:				//DEATH
				System.out.println("The room has no floor and you fall directly into a flaming " +
						"incinerator. Way to go. \n\n\n GAME OVER");
				System.exit(0);
			case 6:
				System.out.println("You come to a set of stairs leading up to a wide hallway.\n" +
				"What do you do? <u, b, p>");
				input = in.next();
				
				if (input.equals("b")) {		//state change
					System.out.println("Are you scared?");
					state = 2;
				}
		
				else if (input.equals("u")) {		//state change
					System.out.println("The child screams again, this time louder.");
					state = 7;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 7:
				System.out.println("You arrive at a fork in the hallway. To the left you see the hallway" +
						" fade to inky darkness. To the right, you think you hear voices.\n" +
				"What do you do? <l, r, b, p>");
				input = in.next();
				
				if (input.equals("b")) {		//state change
					System.out.println("A clicking sound begins in the darkness.");
					state = 6;
				}
		
				else if (input.equals("l")) {		//state change
					System.out.println("Deep into the darkness, peering...");
					points++;
					state = 8;
				}
				
				else if (input.equals("r")) {		//state change
					System.out.println("You must have forgotten that voices aren't always good...");
					state = 9;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 8:
				System.out.println("You come to a turn in the hall. You hear the clicking noise, quite" +
						" loud now, just around the bend.\n" +
				"What do you do? <t, b, p>");
				input = in.next();
				
				if (input.equals("b")) {		//state change
					System.out.println("If you're scared, why'd you come in here in the first place?");
					state = 7;
				}
		
				else if (input.equals("t")) {		//state change
					System.out.println("Be careful now.");
					state = 10;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 9:				//DEATH
				System.out.println("You come upon a group of criminals plotting a heist. They kill you " +
				"in order to clean up loose ends. Well done. \n\n\n GAME OVER");
				
				System.exit(0);
			case 10:
				System.out.println("You turn the corner and see a hunched figure devouring something in the" +
						" shadows.\n" +
				"What do you do? <f, b, p>");
				input = in.next();
				
				if (input.equals("b")) {		//state change
					System.out.println("You're doubting, dreaming dreams no mortal ever dared to dream before.");
					state = 8;
				}
		
				else if (input.equals("f")) {		//state change
					System.out.println("Bravery and stupidity are often confused. The creature doesn't " +
							"notice you.");
					state = 11;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 11:
				System.out.println("You reach a point where the hallway splits in two. To the left you see " +
						" a lightbulb flickering, to the right a stairway leading up.\n" +
				"What do you do? <l, r, b, p>");
				input = in.next();
				
				if (input.equals("b")) {		//state change
					System.out.println("You can't choose between the forks, so you turn around.");
					state = 10;
				}
		
				else if (input.equals("l")) {		//state change
					System.out.println("The light flickers more frequently as you approach.");
					state = 12;
				}
				
				else if (input.equals("r")) {		//state change
					System.out.println("Above the stairway you see tattered flags hanging, waving slightly in a stale breeze.");
					state = 15;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 12:
				System.out.println("Down to the left you see a door hanging open, and ahead of you, you see a long hallway, littered " +
						"with what look like bodies.\n" +
				"What do you do? <l, f, b, p>");
				input = in.next();
				
				if (input.equals("b")) {		//state change
					System.out.println("Sometimes the best way is the other way. Like, backwards.");
					state = 11;
				}
		
				else if (input.equals("l")) {		//state change
					System.out.println("Time to go to class...");
					state = 14;
				}
				
				else if (input.equals("f")) {		//state change
					System.out.println("You walk along the hallway, careful to avoid touching the detritus all over the floor.");
					state = 13;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 13:
				System.out.println("You arrive at the door to a stairwell, hanging off its hinges. You still see the classroom" +
						" door hanging open to your left.\n" +
				"What do you do? <l, u, b, p>");
				input = in.next();
				
				if (input.equals("b")) {		//state change
					System.out.println("You hear a faint voice saying \"beep boop beep\".");
					state = 12;
				}
		
				else if (input.equals("l")) {		//state change
					System.out.println("Time to go to class...");
					state = 14;
				}
				
				else if (input.equals("u")) {		//state change
					System.out.println("You walk up another stairway, each footstep like a gunshot in the darkness.");
					points++;
					state = 15;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 14:				//DEATH
				System.out.println("Oh no! It's a history classroom! You are quickly devoured by all of the unimportant facts " +
				"that you care nothing about. Sorry. \n\n\n GAME OVER");
				
				System.exit(0);
			case 15: 
				System.out.println("The top of the staircase proves barren. The hallway is completely empty, like the rest of" +
						" the school.\n" +
				"What do you do? <f, d, b, p>");
				input = in.next();
				
				if (input.equals("b")) {		//state change
					System.out.println("Maybe downstairs will prove more fruitful.");
					state = 11;
				}
		
				else if (input.equals("d")) {		//state change
					System.out.println("There can't be anything up here...");
					state = 13;
				}
				
				else if (input.equals("f")) {		//state change
					System.out.println("A piano slowly plays the Jaws theme in the darkness.");
					state = 16;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 16:
				System.out.println("Down the hallway whatever's on the floor becomes more sparse.\n" +
				"What do you do? <f, b, p>");
				input = in.next();
				
				if (input.equals("b")) {		//state change
					System.out.println("Make up your mind, or they'll find you.");
					state = 15;
				}
		
				else if (input.equals("f")) {		//state change
					System.out.println("A raven crows somewhere nearby. You hope that the creature in the darkness doesn't " +
							"notice you.");
					state = 17;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 17:
				System.out.println("You come to a point where there's a hole in the wall, through which you see desks and students" +
						" sitting in chairs.\n" +
				"What do you do? <l, r, b, p>");
				input = in.next();
				
				if (input.equals("b")) {		//state change
					System.out.println("Footsteps sound across the hallway. They're not yours.");
					state = 16;
				}
		
				else if (input.equals("l")) {		//state change
					System.out.println("The classroom can wait. The rest of the building seems too quiet...");
					points++;
					state = 19;
				}
				
				else if (input.equals("r")) {		//state change
					System.out.println("Footsteps grow louder and louder, pounding into your skull.");
					state = 18;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 18:					//DEATH
				System.out.println("Help, it's the Forensics classroom! The teacher's knowledge of forensic science allows her " +
				"to kill you and get rid of your body without a trace. \n\n\n GAME OVER");
				
				System.exit(0);
			case 19:
				System.out.println("As you approach a set of windows, you begin to hear laughter and talking somewhere nearby.\n" +
				"What do you do? <f, b, p>");
				input = in.next();
				
				if (input.equals("b")) {		//state change
					System.out.println("Maybe that classroom was the way to go.");
					state = 17;
				}
		
				else if (input.equals("l")) {		//state change
					System.out.println("A maniacal laugh echoes through the hallway.");
					state = 18;
				}
				
				else if (input.equals("f")) {		//state change
					System.out.println("The talking grows louder...");
					state = 20;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 20:
				System.out.println("You reach the intersection of two different hallways, each darker than the other.\n" +
				"What do you do? <f, l, r, b, p>");
				input = in.next();
				
				if (input.equals("b")) {		//state change
					System.out.println("As you may know, voices aren't always a good thing.");
					state = 19;
				}
		
				else if (input.equals("l")) {		//state change
					System.out.println("Those windows could help you find a way out.");
					state = 21;
				}
				
				else if (input.equals("f")) {		//state change
					System.out.println("You think the talking might be someone who can help you get out.");
					state = 25;
				}
				
				else if (input.equals("r")) {		//state change
					System.out.println("Yellow light shines through the window next to a door.");
					points++;
					state = 24;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 21:
				System.out.println("You come upon a staircase leading downstairs.\n" +
				"What do you do? <f, b, p>");
				input = in.next();
				
				if (input.equals("b")) {		//state change
					System.out.println("You didn't have good luck downstairs before.");
					state = 20;
				}
				
				else if (input.equals("f")) {		//state change
					System.out.println("Time to give downstairs another shot.");
					state = 22;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 22:
				System.out.println("You begin to feel cool night air and smell the outdoors over the stench of the school. " +
						"This must be the way out!\n" +
				"What do you do? <f, b, p>");
				input = in.next();
				
				if (input.equals("b")) {		//state change
					System.out.println("A raven crows very close by.");
					state = 21;
				}
				
				else if (input.equals("f")) {		//state change
					System.out.println("You trust the air; this way must be how to get out of the school.");
					state = 23;
				}
				
				else if (input.equals("p")) {		//state change
					System.out.println(points);
				}
				break;
			case 23:				//TRAP to 15
				System.out.println("Suddenly, someone places a canvas bag over your head and drags you into a large room. " +
						"You can hear them sharpening an axe.\n" +
				"What do you do? <f, p>");
				input = in.next();
				int i = 0;
				
				while (i < 5) {
					if (input.equals("f")) {
						System.out.println("Fighting against someone with an axe whom you can't see. That's ballsy.\n" +
								"What do you do? <f, p>");
						i++;
					}
					
					else if (input.equals("p")) {		//state change
						System.out.println(points);
					}
					
					input = in.next();
				}
				System.out.println("Someone cackles in your ear and hits you hard on the head, knocking you out.");
				state = 15;
				break;
			case 24:
				System.out.println("You made it safely to Mr. Hanlon's room! Well done, you're safe..." +
				"for now. \n\n\nYOU WIN");
				
				System.exit(0);
			case 25:				//DEATH
				System.out.println("Wrong computer lab! Students skipping class hold you for ransom and eventually " +
				"dispose of you so as to not get caught. \n\n\n GAME OVER");
				
				System.exit(0);
			}
		}
	}
}