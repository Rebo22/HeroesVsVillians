/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeroesVsVillians;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author rebo
 */
public class HeroesVsVilliansMain {

    public static void main(String[] args) {
        
        Random randomGenerator = new Random();
        
        int count = 0;
        int x = 1;
        
        Character king = new King();
        Character queen = new Queen();
        Character bishop = new Bishop();
        Character knight = new Knight();
        Character lilith = new Lilith();
        Character wizard = new Wizard();
        Character troll = new Troll();
        Character ghoul = new Ghoul();
        
        Scanner scan = new Scanner(System.in);
        
        int deathHeroe1 = 0;
        int deathHeroe2 = 0;
        int deathHeroe3 = 0;
        int deathHeroe4 = 0;
        int deathVillian2 = 0;
        int deathVillian3 = 0;
        int deathVillian4 = 0;
        
        System.out.println("What number of fights do you want: ");
        int partidas = scan.nextInt();
        
        if(partidas <= 1 || partidas > 8){
            System.out.println("The number of fights shoud be less or equal to 8 or more than 1");
            System.out.println("What number of fights do you want: ");
                partidas = scan.nextInt();
        }
        
        
        do
        {
        int randomInt = randomGenerator.nextInt(4 - 1 + 1) + 1;
        int randomInt2 = randomGenerator.nextInt(4 - 1 + 1) + 1;
        int randomInt3 = randomGenerator.nextInt(4 - 1 + 1) + 1;
        int randomInt4 = randomGenerator.nextInt(4 - 1 + 1) + 1;

        int heroe = randomInt;
        int villian = randomInt2;
        int weaponHeroe = randomInt3;
        int weaponVillian = randomInt4;
        
        while(heroe == deathHeroe2){
            randomInt = randomGenerator.nextInt(4 - 1 + 1) + 1;
            if(randomInt != deathHeroe2){
                heroe = randomInt;
                break;
            }
        }
        
        while(heroe == deathHeroe3){
            randomInt = randomGenerator.nextInt(4 - 1 + 1) + 1;
            if(randomInt != deathHeroe3){
                heroe = randomInt;
                break;
            }
        }
        
        while(heroe == deathHeroe4){
            randomInt = randomGenerator.nextInt(4 - 1 + 1) + 1;
            if(randomInt != deathHeroe4){
                heroe = randomInt;
                break;
            }
        }
        
        while(villian == deathVillian2){
            randomInt2 = randomGenerator.nextInt(4 - 1 + 1) + 1;
            if(randomInt2 != deathVillian2) {
                villian = randomInt;
                break;
            }
        }
        
        while(villian == deathVillian3){
            randomInt2 = randomGenerator.nextInt(4 - 1 + 1) + 1;
            if(randomInt2 != deathVillian3){
                villian = randomInt2;
                break;
            }
        }
        
        while(villian == deathVillian4){
            randomInt2 = randomGenerator.nextInt(4 - 1 + 1) + 1;
            if(randomInt2 != deathVillian4){
                villian = randomInt;
                break;
            }
        }
        
        switch(weaponHeroe){
            case 1:
                king.setWeapon(new SwordBehavior());
                queen.setWeapon(new SwordBehavior());
                bishop.setWeapon(new SwordBehavior());
                knight.setWeapon(new SwordBehavior());
                break;
            case 2:
                king.setWeapon(new BowAndArrowBehavior());
                queen.setWeapon(new BowAndArrowBehavior());
                bishop.setWeapon(new BowAndArrowBehavior());
                knight.setWeapon(new BowAndArrowBehavior());
                break;
            case 3:
                king.setWeapon(new AxeBehavior());
                queen.setWeapon(new AxeBehavior());
                bishop.setWeapon(new AxeBehavior());
                knight.setWeapon(new AxeBehavior());
                break;
            case 4:
                king.setWeapon(new KnifeBehavior());
                queen.setWeapon(new KnifeBehavior());
                bishop.setWeapon(new KnifeBehavior());
                knight.setWeapon(new KnifeBehavior());
                break;
        }


        
        switch(weaponVillian){
            case 1:
                lilith.setWeapon(new SwordBehavior());
                wizard.setWeapon(new SwordBehavior());
                troll.setWeapon(new SwordBehavior());
                ghoul.setWeapon(new SwordBehavior());
                break;
            case 2:
                lilith.setWeapon(new BowAndArrowBehavior());
                wizard.setWeapon(new BowAndArrowBehavior());
                troll.setWeapon(new BowAndArrowBehavior());
                ghoul.setWeapon(new BowAndArrowBehavior());
                break;
            case 3:
                lilith.setWeapon(new AxeBehavior());
                wizard.setWeapon(new AxeBehavior());
                troll.setWeapon(new AxeBehavior());
                ghoul.setWeapon(new AxeBehavior());
                break;
            case 4:
                lilith.setWeapon(new KnifeBehavior());
                wizard.setWeapon(new KnifeBehavior());
                troll.setWeapon(new KnifeBehavior());
                ghoul.setWeapon(new KnifeBehavior());
                break;
        }
        
            try {
                Thread.sleep(5000);
        
                System.out.println("\nFight " + x + ":\n");
            
            
                
                switch(heroe){
                case 1:
                    System.out.println("King:");
                    king.display();
                    break;
                case 2:
                    System.out.println("Queen:");
                    queen.display();
                    queen.fight();
                    break;
                case 3:
                    System.out.println("Bishop:");
                    bishop.display();
                    bishop.fight();
                    break;
                case 4:
                    System.out.println("Knight:");
                    knight.display();
                    knight.fight();
                    break;
            }

            switch(villian){
                 case 1:
                    System.out.println("\nLilith:");
                    lilith.display();
                    lilith.fight();
                    break;
                case 2: 
                    System.out.println("\nWizard:");
                    wizard.display();
                    wizard.fight();
                    break;
                case 3:
                    System.out.println("\nTroll:");
                    troll.display();
                    troll.fight();
                    break;
                case 4:
                    System.out.println("\nGhoul:");
                    ghoul.display();
                    ghoul.fight();
                    break;
            }
            
            //poner la regla de la espada al revez para lilith
            if(heroe == 2){
                if(villian == 1){
                    if(queen.weaponBehavior.sword){
                        if(!lilith.weaponBehavior.sword){
                            deathVillian2 = 2;
                            System.out.println("\nLilith is dead!!");
                            System.out.println("The heroes have won the game!!");
                        } 
                    }
                }
                
                if(villian == 2){
                    deathVillian2 = 2;
                    System.out.println("\nThe Wizard is dead");
                }
                if(villian == 3){
                    deathVillian3 = 3;
                    System.out.println("\nThe Troll is dead");
                }
                if(villian == 4){
                    deathVillian4 = 4;
                    System.out.println("\nThe Ghoul is dead");
                }
            }
            if(heroe == 3){
                if(villian == 3){
                    deathVillian3 = 3;
                    System.out.println("\nThe Troll is dead");
                }
                if(villian == 4){
                    if(!ghoul.weaponBehavior.bowAndArrow){
                        deathVillian4 = 4;
                        System.out.println("\nThe goul is dead");
                    }
                }
            }

            if(heroe == 4){
                if(villian == 3){
                    if(knight.weaponBehavior.axe){
                        deathVillian3 = 3;
                        System.out.println("\nThe troll is dead!!");
                    }
                }
                if(villian == 4){
                    deathVillian4 = 4;
                    System.out.println("\nThe Ghoul is dead");
                }
            }

            if(villian == 1){
                if(heroe == 1){
                    deathHeroe1 = 1;
                    System.out.println("\nThe King is dead");
                    System.out.println("\nThe villians have won the game");
                    break;
                }
                if(heroe == 2){
                    if(lilith.weaponBehavior.sword){
                        if(!queen.weaponBehavior.sword){
                            deathHeroe2 = 2;
                            System.out.println("\nThe queen is dead!!");
                            break;
                        }
                    }   
                }
                if(heroe == 3){
                    deathHeroe3 = 3;
                    System.out.println("\nThe Bishop is dead");
                }
                if(heroe == 4){
                    deathHeroe4 = 4;
                    System.out.println("\nThe Knight is dead");
                }
            }

            if(villian == 2){
                if(heroe == 1){
                    System.out.println("\nThe Wizard can't do damage to the King");
                }
                if(heroe == 3){
                    deathHeroe3 = 3;
                    System.out.println("\nThe Bishop is dead");
                }
                if(heroe == 4){
                    deathHeroe4 = 4;
                    System.out.println("\nThe Knight is dead");
                }
            }

            if(villian == 3){
                if(heroe == 1){
                    System.out.println("\nThe Troll can't do damage to the King");
                }
                if(heroe == 4){
                    if(!knight.weaponBehavior.axe){
                        deathHeroe4 = 4;
                        System.out.println("\nThe knight is dead");
                    }
                }
            }

            if(villian == 4){
                if(heroe == 1){
                    System.out.println("\nThe Ghoul can't do damage to the king");
                }
                if(heroe == 3){
                    if(ghoul.weaponBehavior.bowAndArrow){
                        deathHeroe3 = 3;
                        System.out.println("\nThe bishop is dead");
                    }
                }
            }
            } catch (InterruptedException ex) {
                Logger.getLogger(HeroesVsVilliansMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            count ++;
            x++;
        }while(count < partidas);
        
        if(deathHeroe1 == 0){
            System.out.println("\nThe king still lives \nThe heroes have won the game!!");
        }
    }
}