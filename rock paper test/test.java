
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class test
{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        Boolean large = false;
        Boolean swin = false;
        Boolean pwin = false;

        //
        int answer = 0;

        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int wrong = 0;

        int wrongrock = -1;
        int wrongpaper = -2;
        int wrongscissors = -3;

        int systemanswer = 0;
        int systemrock = 1;
        int systempaper = 2;
        int systemscissors = 3;

        //
        //String owo = ("apples");
        //int o = owo.length();
        //System.out.print(owo.substring(o-4));

        System.out.println ("rock paper scissors!");
        String name = input.nextLine();

        if (name.length() > 50){
            large = true;
        }
        //
        if (name.lastIndexOf("rock") == name.length()-4){
            if(large == true){
                answer = rock;
            } else answer = wrongrock;
        }

        if (name.lastIndexOf("paper") == name.length()-5){
            if(large == true){
                answer = paper;
            } else answer = wrongpaper;
        }

        if (name.lastIndexOf("scissors") == name.length()-8){
            if(large == true){
                answer = scissors;
            } else answer = wrongscissors;
        }

        if (answer == 0 && large == false){
            answer = wrong;
        }
        //

        //figure out how to check???
        //"i choose you, paper"
        //name.lastIndexOf(paper) = name.length()-5

        if (large == true && answer == rock){
            System.out.println ("oh wow, rock!");
        } else if (large == true && answer == paper){
            System.out.println ("oh wow, paper!");
        } else if (large == true && answer == scissors){
            System.out.println ("oh wow, scissors!");
        } else if (large == false){
            System.out.println ("sorry, you have to type at least 50 characters, and end with rock, paper, or scissors");
        } else System.out.print ("...wheres rock paper or scissors?");

        if(large == false){
            if (answer == wrongpaper){
                System.out.print ("you didnt even put the effort in to give a full answer! so i pick scissors >:(");
                systemanswer = systemscissors;
            } else if (answer == wrongrock){
                System.out.print ("really? not even a full 50 characters? well youre losing, i pick paper");
                systemanswer = systempaper;
            } else 
                System.out.print ("wow, youre bad at this, picking scissors without putting in any effort, i pick rock");
            systemanswer = systemrock;
        }

        if(large == true){
            int num = (int) (Math.random()*3) + 1;
            //System.out.print (num);
            //figure out how to make only work when large true
            if (num == 1){
                System.out.println ("rock");
                systemanswer = systemrock;
            } else if (num == 2) {
                System.out.println ("paper");
                systemanswer = systempaper;
            } else {
                System.out.println ("scissors");
                systemanswer = systemscissors;
            }
        }

        
        if (answer == 1 && systemanswer == 2){
            swin = true;
            pwin = false;
        } else if (answer == 1 && systemanswer == 3){
            pwin = true;
            swin = false;
        } else if (answer == 2 && systemanswer == 1){
            pwin = true;
            swin = false;
        } else if (answer == 2 && systemanswer == 3){
            swin = true;
            pwin = false;
        } else if (answer == 3 && systemanswer == 1){
            swin = true;
            pwin = false;
        } else if (answer == 3 && systemanswer == 2){
            pwin = true;
            swin = false;
        }

        System.out.print(swin + " ");
        System.out.print(pwin + " ");
        System.out.print(answer + " ");
        System.out.print(systemanswer + " ");

        if (answer == systemanswer){
            System.out.print ("haha wow! a draw!");
        } else if (pwin == true){
            System.out.print ("alas, it seems youve won");
        } else if (swin == true){
            System.out.print ("ahaha! i win!");
        } else System.out.print ("laris coded something wrong");
        //print out winning stuff here but im gonna make a separate thing to check
    }

}

