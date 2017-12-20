package summers.colemantriva;

import java.util.ArrayList;

/**
 * Created by 660252823 on 12/14/2017.
 */

public class Questions {

    public String sQutestions[] = {
            "In what year was Coleman University Founded?",
            "What is the name of the Founder of Coleman University?",
            "What is Coleman University Slogen?",
            "What was the nickname of the first Coleman University facility called?",
            "In 2016 what was the name Coleman University change the Network Security Program to?",
            "How many years has Coleman University been serving the community of San Diego?",
            "What is Coleman University Street Address?",
            "How old is Charlie Morgan?",
            "In what year did Leticia Rabor join the Coleman University staff?",
            "Who is the Best instructor at Coleman?",

    };

    public String sAnswers[][]= {
            {"1971","1963","1977","1961"},
            {"Dr. Coleman Furr","Dr. Coleman Burr","Dr. Charlie Morgan","Dr. Jeff Summers"},
            {"Technology Focused Careers","Experience Technology","Dreams into Reality","No More Homework!"},
            {"The Bowling Alley","Automation Institute of San Diego","Shake Shack","The Pit"},
            {"Internet Detectives","Firewall Professionals","Internet Security","Cyber Security"},
            {"45","50","71","52"},
            {"8891 Balboa Ave.","1134 Coleman Dr.","8888 Balboa Ave.","4 Private Dr."},
            {"75","91","71","27"},
            {"2013","2012","1989","1776"},
            {"Dr. Coleman Furr","Charlie Morgan","Laticia Rabor","Tommy Bahama"},

    };

    public String sCorrectAnswers[] = {
            "1963",
            "Dr. Coleman Furr",
            "Dreams into Reality",
            "The Bowling Alley",
            "Cyber Security",
            "50",
            "8888 Balboa Ave.",
            "75",
            "2012",
            "Laticia Rabor",
    };

    public String getQuestion(int a){
        String question = sQutestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice1 = sAnswers[a][0];
        return choice1;

    }

    public String getChoice2(int a){
        String choice1 = sAnswers[a][1];
        return choice1;

    }

    public String getChoice3(int a){
        String choice1 = sAnswers[a][2];
        return choice1;

    }

    public String getChoice4(int a){
        String choice1 = sAnswers[a][3];
        return choice1;

    }

    public String getAnswer(int a){
        String answer = sCorrectAnswers[a];
        return answer;


    }



}
