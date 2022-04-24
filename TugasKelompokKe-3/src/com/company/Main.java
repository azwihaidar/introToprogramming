package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CoepoeWordPuzzle();
    }
    
    public static int runningProgram(int level, ArrayList<String> listAnswer, String hint) {
        int score = 0;

        System.out.println("level " + level);
        System.out.println("-------------\n");
        System.out.println(hint);

        Scanner input = new Scanner(System.in);
        ArrayList<String> arrList = new ArrayList<>();

            int correct = 0;
            for (int j = 0; j < 10; j++) {
                int rownum = j + 1;
                System.out.print(rownum + "> Your answer : ");
                String answer = input.next();

                if(answer.length() < 3 || answer.length() > 6){
                    System.out.println("Input min 3 characters & max 6 characters");
                }

                boolean contains = listAnswer.contains(answer);
                if (arrList.contains(answer)) {
                    System.out.println("You had already type this word before..");
                } else if (contains) {
                    score = score + 10;
                    System.out.println("#Right. Score : " + score);
                    arrList.add(answer);
                    correct++;
                }
            }

            System.out.println("You had answered 10 times with " + correct + " right answers...");
            System.out.println("Correct Answers :");
            System.out.println(listAnswer.toString().substring(1, listAnswer.toString().length() - 1));
            return score;

        }
    
    public static void CoepoeWordPuzzle(){
        Scanner input = new Scanner(System.in);
        int finalScore;

        // list answer Level 1
        int level = 1;
        String hint1 ="                 d   e   t   t   l   i     ";
        ArrayList<String> level1 = new ArrayList<>();
        level1.add("die");
        level1.add("led");
        level1.add("lei");
        level1.add("let");
        level1.add("lid");
        level1.add("lie");
        level1.add("lit");
        level1.add("tie");
        level1.add("deli");
        level1.add("diet");
        level1.add("edit");
        level1.add("idle");
        level1.add("lied");
        level1.add("tide");
        level1.add("tied");
        level1.add("tile");
        level1.add("tilt");
        level1.add("tilde");
        level1.add("tiled");
        level1.add("title");
        level1.add("titled");
        level1.add("titled");

        //list answer level 2
        String hint2 ="                  s   e   c   a   e   n    ";
        ArrayList<String> level2 = new ArrayList<>();
        level2.add("sec");
        level2.add("can");
        level2.add("cane");
        level2.add("scan");
        level2.add("scene");
        level2.add("case");
        level2.add("cease");
        level2.add("cas");
        level2.add("nees");
        level2.add("seen");
        level2.add("seec");

        // list answer Level 3
        String hint3 ="                    h   k   r   n   e   o     ";
        ArrayList<String> level3 = new ArrayList<>();
        level3.add("honk");
        level3.add("honker");
        level3.add("roe");
        level3.add("ore");
        level3.add("her");
        level3.add("hen");
        level3.add("one");
        level3.add("horn");
        level3.add("nor");
        level3.add("tone");
        level3.add("neo");

        System.out.println("Coepoe Word Puzzle");
        System.out.println("==================");
        System.out.println("Rules :");
        System.out.println("1. Create a word using given characters, min 3 characters & max 6 characters.");
        System.out.println("2. Each Level, you have 10 chance to answer correctly.");
        System.out.println("3. To get through to next level, you have to score 70 points each level.");


        finalScore = runningProgram(level, level1, hint1);
        if(finalScore >= 70){ // next to level 2 if score >= 70
            
            level = level+1; // entry to level 2
            int scoreL2 = runningProgram(level, level2, hint2);
            finalScore = finalScore + scoreL2;
            if(finalScore >= 140){ // next to level 2 if score >= 140
                
                level = level+1; // entry to level 3
                int scoreL3 = runningProgram(level, level3, hint3);
                finalScore = finalScore +scoreL3;
                if(finalScore >= 210){ // print user win if score >= 210
                    System.out.println("\nOverall Score = "+finalScore);
                    System.out.println("You Win !!");
                    System.out.print("Press ENTER to exit..");
                    try{
                        System.in.read();
                    }
                    catch(Exception e){
                        
                    }
                }else{
                    System.out.println("You Lose!! Try Again..");
                    System.out.print("\nDo you want to retry [y/t] ?");
                    String reTry = input.next();
                    if (reTry.equalsIgnoreCase("y")){
                        CoepoeWordPuzzle();
                    }else{
                        System.exit(0);
                    }
                }
            }else{
                System.out.println("You Lose!! Try Again..");
                System.out.print("\nDo you want to retry [y/t] ?");
                String reTry = input.next();
                if (reTry.equalsIgnoreCase("y")){
                    CoepoeWordPuzzle();
                }else{
                    System.exit(0);
                }
            }
        }else{
            System.out.println("You Lose!! Try Again..");
            System.out.print("\nDo you want to retry [y/t] ?");
            String reTry = input.next();
            if (reTry.equalsIgnoreCase("y")){
                CoepoeWordPuzzle();
            }else{
                System.exit(0);
            }
        }
    }

}