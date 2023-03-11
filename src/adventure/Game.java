package adventure;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;


 

public class Game {
	
	JFrame gamewindow;
	Container con;
	JPanel gameNamePanel,startButtonPanel,mainGamePanel,mainGameButtonPanel,playerPanel;
	JLabel gameNameLabel,hpLabel,hpLabelStats,moneyLabel,moneyLabelTotal,weaponLabel,weaponLabelName;
	Font gameFont = new Font("Atlas", Font.PLAIN,50);
	Font normalFont = new Font("Atlas",Font.PLAIN,30);
	JButton startButton,A,B,C,D;
	JTextArea mainGameArea;
	 
	
	
	int playerHP,monsterHP,goblinHP,goblinKingHP,crown;
	float money;
	String weapon,position;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	
	ChoiceHandler choiceHandler = new ChoiceHandler();
	 

	public static void main(String[] args) {
	 new Game();

	}
	public Game() {
		gamewindow = new JFrame();
		gamewindow.setSize( 800, 600);
		gamewindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    gamewindow.getContentPane().setBackground(Color.black);
		gamewindow.setLayout(null);
		con = gamewindow.getContentPane();
		
		gameNamePanel = new JPanel();
		gameNamePanel.setBounds(100,100,600,150);
		gameNamePanel.setBackground(Color.black);
		gameNameLabel = new JLabel(" Ready Player One");
		gameNameLabel.setForeground( Color.white);
		gameNameLabel.setFont(gameFont);
	  
		 
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300,400,200,100);
		startButtonPanel.setBackground(Color.black);
		
		 
		startButton = new JButton("START");
		startButton.setBackground(Color. black);
		startButton.setForeground(Color. white);
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler);
		startButton.setFocusPainted(false);
		
		 
		gameNamePanel.add(gameNameLabel);
		startButtonPanel.add(startButton);
		
		con.add(gameNamePanel);
		con.add( startButtonPanel);
		gamewindow.setVisible(true);
		 
	}
	public void createGameScreen() {
		gameNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		mainGamePanel = new JPanel();
		mainGamePanel.setBounds(100,100,650,250);
		mainGamePanel.setBackground(Color.black);
		con.add(mainGamePanel);
		
		mainGameArea = new JTextArea("Main Text area");
		mainGameArea.setBounds(100,100,650,250);
		mainGameArea.setBackground(Color.black);
		mainGameArea.setForeground(Color.white);
		mainGameArea.setFont(normalFont);
		mainGameArea.setLineWrap(true);
		mainGamePanel.add(mainGameArea);
		
		mainGameButtonPanel = new JPanel();
		mainGameButtonPanel.setBounds(250,350,300,150);
		mainGameButtonPanel.setBackground(Color. black);
		mainGameButtonPanel.setLayout(new GridLayout(4,1));
		con.add(mainGameButtonPanel);
		
		 
		A = new JButton("A");
		A.setBackground(Color.black);
		A.setForeground(Color.white);
		A.setFont(normalFont);
		mainGameButtonPanel.add(A);
		A.setFocusPainted(false);
		A.addActionListener(choiceHandler);
		A.setActionCommand("A1");
		
		B = new JButton("B");
		B.setBackground(Color.black);
		B.setForeground(Color.white);
		B.setFont(normalFont);
		mainGameButtonPanel.add(B);
		B.setFocusPainted(false);
		B.addActionListener(choiceHandler);
		B.setActionCommand("B1");
		
		
		C = new JButton("C");
		C.setBackground(Color.black);
		C.setForeground(Color.white);
		C.setFont(normalFont);
		mainGameButtonPanel.add(C);
		C.setFocusPainted(false);
		C.addActionListener(choiceHandler);
		C.setActionCommand("C1");
		
		D = new JButton("D");
		D.setBackground(Color.black);
		D.setForeground(Color.white);
		D.setFont(normalFont);
		mainGameButtonPanel.add(D);
		D.setFocusPainted(false);
		D.addActionListener(choiceHandler);
		D.setActionCommand("D1");
		
		playerPanel = new JPanel();
		playerPanel.setBounds(100,15,1100,50);
		playerPanel.setBackground(Color. black);
		playerPanel.setLayout(new GridLayout(1,4));
		con.add(playerPanel);
		hpLabel = new JLabel("HP:");
		hpLabel.setFont(normalFont);
		hpLabel.setForeground( Color.white);
		playerPanel.add(hpLabel);
		
		hpLabelStats = new JLabel();
		hpLabelStats.setFont(normalFont);
		hpLabelStats.setForeground( Color.white);
		playerPanel.add(hpLabelStats);
		
		moneyLabel = new JLabel("Money:");
		moneyLabel.setFont(normalFont);
		moneyLabel.setForeground( Color.white);
		playerPanel.add(moneyLabel);
		
		moneyLabelTotal = new JLabel();
		moneyLabelTotal.setFont(normalFont);
		moneyLabelTotal.setForeground( Color.white);
		playerPanel.add( moneyLabelTotal);
		
		weaponLabel  = new JLabel("Weapon:");
	    weaponLabel.setFont(normalFont);
		weaponLabel.setForeground( Color.white);
		playerPanel.add( weaponLabel);
		
		weaponLabelName  = new JLabel();
	    weaponLabelName.setFont(normalFont);
		weaponLabelName.setForeground( Color.white);
		playerPanel.add( weaponLabelName);
		
		playerSetup();
	}
	
	public void playerSetup() {
		playerHP = 20;
		monsterHP = 10;
		goblinHP = 20;
		goblinKingHP = 30;
	    money = 50;
		weapon = "Fist";
		weaponLabelName.setText(weapon);
	    hpLabelStats.setText(""+playerHP);
	    moneyLabelTotal.setText(""+money);
	    
	    townGate();
	}
	
	public void townGate() {
		position = "townGate";
		mainGameArea.setText("Hey there!!It seems like you are a young warrior who has lost his memory.\nYou have decided to gain back your memory.\nIn order to do so where would you like to go?");
	    A.setText("Shining Forest");
	    B.setText("Palet Town");
	    C.setText("Dark Goblin Caves");
	    D.setText("Red River");
		
	}
	
	public void ShiningForest() {
		position = "ShiningForest";
		mainGameArea.setText("You meet an old lady at the entrance of the \nforest.\nShe says you remind her of a lost prince.");
		A.setText("Move ahead.");
		B.setText(" ");
	    C.setText(" ");
	    D.setText(" ");
	     
	}
	public void MoveAhead() {
		position = "MoveAhead";
		mainGameArea.setText("You find a Shining Sword.\nIt's a dead end ahead");
		weapon = "Sword";
		weaponLabelName.setText(weapon);
		A.setText("Leave");
		B.setText(" ");
	    C.setText(" ");
	    D.setText(" ");
	    
	}
	 
	public void PaletTown() {
		position = "PaletTown";
		mainGameArea.setText("The Town has been completely demolished and\n all you find is a mysterious creature lurking ");
		A.setText("Approach creature");
		B.setText("Attack the creature ");
	    C.setText("Leave");
	    D.setText(" ");
	  
	}
	public void ApproachCreature() {
		position = "ApproachCreature";
		mainGameArea.setText("The Lurking creature doesn't look happy.\nIt attacks you.\n(you receive 2 damage)");
		playerHP = playerHP - 2;
	    hpLabelStats.setText(""+playerHP);
		A.setText( "Attack the creature ");
		B.setText("Leave");
	    C.setText("");
	    D.setText(" ");
	    
	}
	public void AttackCreature() {
		position = "AttackCreature";
		mainGameArea.setText("Creature HP: " + monsterHP + "\nWhat do you do?");
		A.setText( "Fight");
		B.setText(" Run");
	    C.setText("");
	    D.setText(" ");
	    

	}
	public void Fight() {
		position = "Fight";
		int playerDamage = 0;
		if(weapon.equals("Fist")) {
		playerDamage = new java.util.Random().nextInt(3);
		}
		else if(weapon.equals("Sword")) {
			playerDamage = new java.util.Random().nextInt(5);
			}
		else if(weapon.equals("Glove")) {
			playerDamage = new java.util.Random().nextInt(15);
			}
		else if(weapon.equals("Dagger")) {
			playerDamage = new java.util.Random().nextInt(7);
			}
		else if(weapon.equals("Spear")) {
			playerDamage = new java.util.Random().nextInt(10);
			}
		mainGameArea.setText("You attacked the creature and gave " + playerDamage + "\n damage!");
		monsterHP = monsterHP - playerDamage;
		A.setText( ">");
		B.setText("");
	    C.setText("");
	    D.setText(" ");
	    
		
	}
	public void monsterAttack() {
		position = "monsterAttack";
		int monsterDamage = 0;
		monsterDamage = new java.util.Random().nextInt(5);
		mainGameArea.setText("The Creature attacked you and gave " + monsterDamage + "\n damage!");
		playerHP = playerHP - monsterDamage;
		hpLabelStats.setText(""+playerHP);
		A.setText( ">");
		B.setText("");
	    C.setText("");
	    D.setText(" ");
	    
	}
	public void win() {
		position = "win";
		mainGameArea.setText("You defeated the creature!\n You received 50 coins");
		money = money + 50;
		moneyLabelTotal.setText(""+money);
		A.setText("Leave");
		B.setText("");
	    C.setText("");
	    D.setText(" ");
	     
	
	}
	public void lose() {
		position = "lose";
		mainGameArea.setText("You were defeated!\n\n <GAME OVER>");
		A.setText("");
		B.setText("");
	    C.setText("");
	    D.setText(" ");
	    A.setVisible(false);
	    B.setVisible(false);
	    C.setVisible(false);
	    D.setVisible(false);
		 
	}
	public void GoblinCaves() {
		position = "GoblinCaves";
		mainGameArea.setText("You Enter the cave and find a \n goblin.\nWhat will you do?");
		A.setText("Attack the goblin");
		B.setText("Leave ");
	    C.setText(" ");
	    D.setText(" ");
 
	}
	public void AttackGoblin() {
		position = "AttackGoblin";
		mainGameArea.setText("Goblin HP: " + goblinHP + "\nWhat do you do?");
		A.setText( "Fight");
		B.setText(" Run");
	    C.setText("");
	    D.setText(" ");
	   

	}
	public void Fight1() {
		position = "Fight1";
		int playerDamage = 0;
		if(weapon.equals("Fist")) {
		playerDamage = new java.util.Random().nextInt(3);
		}
		else{
			  if(weapon.equals("Sword")) {
		
			     playerDamage = new java.util.Random().nextInt(5);
			  }
		      else{
			      if(weapon.equals("Glove")) {
		 
			       playerDamage = new java.util.Random().nextInt(15);
			      }
		          else {
		        	  if(weapon.equals("Dagger")) {
		              playerDamage = new java.util.Random().nextInt(7);
			           }
		               else {
		            	   if(weapon.equals("Spear")) {
		                   playerDamage = new java.util.Random().nextInt(10);
			                   }
		                    }
		                }
		         }
		}
		mainGameArea.setText("You attacked the  goblin and gave " + playerDamage + "\n damage!");
		goblinHP = goblinHP - playerDamage;
		A.setText( ">");
		B.setText("");
	    C.setText("");
	    D.setText(" ");
	  
		
	}
	public void goblinAttack() {
		position = "goblinAttack";
		int goblinDamage = 0;
		goblinDamage = new java.util.Random().nextInt(5);
		mainGameArea.setText("The  goblin attacked you and gave " +  goblinDamage + "\n damage!");
		playerHP = playerHP -  goblinDamage;
		hpLabelStats.setText(""+playerHP);
		A.setText( ">");
		B.setText("");
	    C.setText("");
	    D.setText(" ");
	   
	}
	public void win1() {
		position = "win1";
		mainGameArea.setText("You defeated the Goblin!\n You received 25 HP");
		playerHP = playerHP + 25;
	    hpLabelStats.setText(""+playerHP);
		A.setText("Let's go!!");
		B.setText("");
	    C.setText("");
	    D.setText(" ");
	    
	
	}
	public void  GoblinKing(){
		position = "GoblinKing";
		mainGameArea.setText(" Goblin King appears out of \n nowhere.\nGoblin King:You unknown commoner.\n You shall face my wrath.\nBwahahah!");
		A.setText("Attack the King");
		B.setText("Leave ");
	    C.setText("Giveup");
	    D.setText(" ");
	  
	}
	public void AttackGoblinKing() {
		position = "AttackGoblinKing";
		mainGameArea.setText("Goblin King HP: " + goblinKingHP + "\nWhat do you do?");
		A.setText( "Fight");
		B.setText("Run");
	    C.setText("");
	    D.setText(" ");
	    

	}
	public void Fight2() {
		position = "Fight2";
		int playerDamage = 0;
		if(weapon.equals("Fist")) {
		playerDamage = new java.util.Random().nextInt(3);
		}
		else{
			  if(weapon.equals("Sword")) {
		
			     playerDamage = new java.util.Random().nextInt(5);
			  }
		      else{
			      if(weapon.equals("Glove")) {
		 
			       playerDamage = new java.util.Random().nextInt(15);
			      }
		          else {
		        	  if(weapon.equals("Dagger")) {
		              playerDamage = new java.util.Random().nextInt(7);
			           }
		               else {
		            	   if(weapon.equals("Spear")) {
		                   playerDamage = new java.util.Random().nextInt(10);
			                   }
		                    }
		                }
		         }
		}
		mainGameArea.setText("You attacked the King and gave " + playerDamage + "\n damage!");
		goblinKingHP = goblinKingHP - playerDamage;
		A.setText(">");
		B.setText("");
	    C.setText("");
	    D.setText(" ");
	   
		
	}
	public void goblinKingAttack() {
		position = "goblinKingAttack";
		int goblinKingDamage = 0;
		goblinKingDamage = new java.util.Random().nextInt(9);
		mainGameArea.setText("The  goblin King attacked you and gave " + goblinKingDamage + "\n damage!");
		playerHP = playerHP -  goblinKingDamage;
		hpLabelStats.setText(""+playerHP);
		A.setText( ">");
		B.setText("");
	    C.setText("");
	    D.setText(" ");
	     
	}
	public void winGame() {
		position = "winGame";
		mainGameArea.setText("You defeated the Goblin King!\nCongratulations!!\nThe cave starts to fall off.\nYou broke the Curse!\nYou receive a Crown");
	    crown = 1;
		A.setText("Wear Crown");
		B.setText("");
	    C.setText("");
	    D.setText(" ");
	    
	
	}
	public void Crown() {
		position = "Crown";
		mainGameArea.setText("As soon as you wear the crown\n your memory returns.\nYou know that you were the prince of Palet\nwhich was demolished by goblins\nThe city will now be restored\nunder you");
	    A.setText(" The End");
		B.setText("");
	    C.setText("");
	    D.setText(" ");
	   
	
	}
	public void RedRiver() {
		position = "RedRiver";
		mainGameArea.setText("You find the Red River.\nYou drink the water and rest at the riverside\n(your HP has increased by 3)\nThere is a magical Shop.");
		playerHP = playerHP + 3;
	    hpLabelStats.setText(""+playerHP);
		A.setText("Enter Shop");
		B.setText("Leave");
	    C.setText("");
	    D.setText(" ");
	   
	}
	public void Shop() {
		position = "Shop";
		mainGameArea.setText("Shopkeeper: What would you like to buy?\nMagical glove:Emits magical strikes.\nDagger:Good for Close Range.\nSpear:Good for Long Range.");
		A.setText("Magical glove");
		B.setText("Dagger");
	    C.setText("Spear");
	    D.setText("Leave");
	}
	public void MagicalGlove() {
		position = "MagicalGlove";
		mainGameArea.setText("Shopkeeper:Oh!You would like to have the \nMagical Glove\nThat would be 50 coins.");
		A.setText("Buy");
		B.setText("Back");
	    C.setText("");
	    D.setText("");
	     
	}
	public void Buy1() {
		position = "Buy1";
		mainGameArea.setText("You now have the Magical Glove");
		money = money - 50;
		moneyLabelTotal.setText(""+money);
		weapon = "Glove";
		weaponLabelName.setText(weapon);
		A.setText("Leave");
		B.setText("Back");
	    C.setText("");
	    D.setText("");
	    
	}
	
	public void Dagger() {
		position = "Dagger";
		mainGameArea.setText("Shopkeeper:Oh!You would like to have the \nDagger\nThat would be 20 coins.");
		A.setText("Buy");
		B.setText("Back");
	    C.setText("");
	    D.setText("");
	    
	}
	public void Buy2() {
		position = "Buy2";
		mainGameArea.setText("You now have the  Dagger");
		money = money - 20;
		moneyLabelTotal.setText(""+money);
		weapon = "Dagger";
		weaponLabelName.setText(weapon);
		A.setText("Leave");
		B.setText("Back");
	    C.setText("");
	    D.setText("");
	    
	}
	public void Spear() {
		position = "Spear";
		mainGameArea.setText("Shopkeeper:Oh!You would like to have the \nSpear\nThat would be 30 coins.");
		A.setText("Buy");
		B.setText("Back");
	    C.setText("");
	    D.setText("");
	    
	}
	public void Buy3() {
		position = "Buy3";
		mainGameArea.setText("You now have the Spear");
		money = money - 30;
		moneyLabelTotal.setText(""+money);
		weapon = "Spear";
		weaponLabelName.setText(weapon);
		A.setText("Leave");
		B.setText("Back");
	    C.setText("");
	    D.setText("");
	    
	}
	public void NoMoney() {
		position = "NoMoney";
		mainGameArea.setText("You are out of coins!!");
		A.setText("Leave");
		B.setText("");
	    C.setText("");
	    D.setText("");
	   
	}
	public void crossRoad() {
		position = "crossRoad";
		mainGameArea.setText("You are at a crossroad.\nWhere will you go now?");
		    A.setText("Shining Forest");
		    B.setText("Palet Town");
		    C.setText("Dark Goblin Caves");
		    D.setText("Red River");
	}
	public void ending() {
		position = "ending";
		mainGameArea.setText("Old Lady:I knew it you are the prince.\nThat Crown says you defeated the\nGoblin King.\nYou are our Hero\nWelcome our new King!\n\nThe End\n\n\n\n");
		A.setText("");
		B.setText("");
	    C.setText("");
	    D.setText("");
	    A.setVisible(false);
	    B.setVisible(false);
	    C.setVisible(false);
	    D.setVisible(false);
	}
	
	public class TitleScreenHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			createGameScreen();
		}
	}
	public class ChoiceHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			String yourChoice = event.getActionCommand();
			switch(position) {
			case "townGate":
				switch(yourChoice) {
				case "A1": ShiningForest();
				           break;
				case "B1": PaletTown();   
				           break;
				case "C1":  GoblinCaves();  
			               break;
				case "D1":  RedRiver();   
			               break;       
				}
				break;
			case "ShiningForest":
				switch(yourChoice) {
				case "A1": MoveAhead(); 
				           break;
				case "B1":   
		                   break;
		        case "C1":    
	                       break;
		        case "D1":    
	                       break;                 
				}
				break;
			case "MoveAhead":
				switch(yourChoice) {
				case "A1": crossRoad(); 
			           break;
			    case "B1":      
	                   break;
	            case "C1":    
                    break;
	            case "D1":    
                    break;        
				}
				break;
			case "PaletTown":
				switch(yourChoice) {
				case "A1": ApproachCreature(); 
			           break;
			    case "B1":  AttackCreature();   
	                   break;
	            case "C1":  crossRoad();  
                       break;
	            case "D1":    
                       break;  
				}
				break;
			case "ApproachCreature":
				switch(yourChoice) {
				case "A1": AttackCreature(); 
			           break;
			    case "B1":  crossRoad();   
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break;  
				}
				break;
			case "AttackCreature":
				switch(yourChoice) {
				case "A1":  Fight();			           
				       break;
			    case "B1":  crossRoad();   
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break;  
				}
				break;
			case "Fight":
				switch(yourChoice) {
				case "A1":  
					if(monsterHP<1) {
						win();
					}
					else {
					monsterAttack();
					}
				       break;
			    case "B1":     
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break;  
				}
				break;
			case "monsterAttack":
				switch(yourChoice) {
				case "A1": 
					if(playerHP<1) {
						lose();
					}
					else {
					AttackCreature(); 
					}
				       break;
			    case "B1":     
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break;  
				}
				break;
			case "win":
				switch(yourChoice) {
				case "A1":  crossRoad();			           
				       break;
			    case "B1":      
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break;  
				}
				break;
			case "GoblinCaves":	
				switch(yourChoice) {
				case "A1": AttackGoblin();
			           break;
			    case "B1":  crossRoad();  
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break;  
				}
				break;
			case "AttackGoblin":
				switch(yourChoice) {
				case "A1":  Fight1();			           
				       break;
			    case "B1":  crossRoad();   
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break;  
				}
				break;
			case "Fight1":
				switch(yourChoice) {
				case "A1":  
					if( goblinHP<1) {
						win1();
					}
					else {
					 goblinAttack();
					}
				       break;
			    case "B1":     
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break;  
				}
				break;
			case "goblinAttack":
				switch(yourChoice) {
				case "A1": 
					if(playerHP<1) {
						lose();
					}
					else {
					AttackGoblin(); 
					}
				       break;
			    case "B1":     
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break;  
				}
				break;
			case "win1":
				switch(yourChoice) {
			        case "A1":  GoblinKing(); 		           
					       break;
				    case "B1":      
		                   break;
		            case "C1":     
	                    break;
		            case "D1":    
	                    break;  
					}
					break;
			
			case "GoblinKing":
				switch(yourChoice) {
			        case "A1":   AttackGoblinKing();		           
					       break;
				    case "B1":   crossRoad();   
		                   break;
		            case "C1":   lose();  
	                    break;
		            case "D1":    
	                    break;  
					}
					break;	
			case "AttackGoblinKing":
				switch(yourChoice) {
			        case "A1":    Fight2();		           
					       break;
				    case "B1":   crossRoad();   
		                   break;
		            case "C1":     
	                    break;
		            case "D1":    
	                    break;  
					}
					break;
			case "Fight2":
				switch(yourChoice) {
				case "A1":  
					if(goblinKingHP<1) {
						winGame();
					}
					else {
					 goblinKingAttack();
					}
				       break;
			    case "B1":     
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break;  
					}
					break;	
			case "goblinKingAttack":
				switch(yourChoice) {
				case "A1": 
					if(playerHP<1) {
						lose();
					}
					else {
					AttackGoblinKing(); 
					}
				       break;
			    case "B1":     
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break;  
				}
				break;
			case "winGame":
				switch(yourChoice) {
				case "A1": Crown();
				         break;
				case "B1":    
                         break;
                case "C1":     
                         break;
                case "D1":    
                         break;           
				}
				break;
			case "Crown":
				switch(yourChoice) {
				case "A1":  ending();
				         break;
				case "B1":    
                         break;
                case "C1":     
                         break;
                case "D1":    
                         break;           
				}
				break;
			case "RedRiver":	
				switch(yourChoice) {
				case "A1": Shop(); 
			           break;
			    case "B1":  crossRoad();  
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break;  
				}
				break;
			case "Shop":
				switch(yourChoice) {
				case "A1":  MagicalGlove();
			           break;
			    case "B1":  Dagger(); 
	                   break;
	            case "C1":  Spear(); 
                    break;
	            case "D1":  crossRoad();  
                    break; 
				}
				break;
			case "MagicalGlove":
				switch(yourChoice) {
				case "A1": 
					if(money<1) {
						NoMoney();
					}
					else {
					Buy1();
					}
			           break;
			    case "B1": Shop();   
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break; 
				}
				break;
		 
		 
			case "Dagger":
				switch(yourChoice) {
				case "A1":  
					if(money<1) {
						NoMoney();
					}
					else {
					Buy2();
					}
			           break;
			    case "B1":  Shop();  
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break; 
				}
		 
				break;
			case "Spear":
				switch(yourChoice) {
				case "A1":  
					if(money<1){
						NoMoney();
					}
					else{
					Buy3();
					}
			          break;
			    case "B1":  Shop();  
	                   break;
	            case "C1":     
                    break;
	            case "D1":  
                    break; 
				}
			case "Buy1":
				switch(yourChoice) {
				case "A1":  crossRoad();
			           break;
			    case "B1":  Shop();  
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break; 
				}
				break;
			case "Buy2":
				switch(yourChoice) {
				case "A1":  crossRoad();
			           break;
			    case "B1":  Shop();  
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break; 
				}
				break;
			case "Buy3":
				switch(yourChoice) {
				case "A1":  crossRoad();
			           break;
			    case "B1":   Shop(); 
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break; 
				}
				break;
			case "NoMoney":
				switch(yourChoice) {
				case "A1":  crossRoad();
			           break;
			    case "B1":    
	                   break;
	            case "C1":     
                    break;
	            case "D1":    
                    break; 
				}
				break;
			 
			case "crossRoad":
				 switch(yourChoice) {
				 case "A1":  ShiningForest();
			           break;
			    case "B1":  PaletTown();   
	                   break;
	            case "C1":   GoblinCaves();  
                     break;
	            case "D1":  RedRiver();  
                     break;  
				 }
			 
		}
	}
  }
}


 
