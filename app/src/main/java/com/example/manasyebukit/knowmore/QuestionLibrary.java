package com.example.manasyebukit.knowmore;

public class QuestionLibrary {

    private String myQuestion [] = {

            "In what country would you find the cities Glasgow and Edinburgh?",
            "What country has a maple leaf on their national flag?",
            "What country is home to the Great Barrier Reef?",
            "Tapas and paella are dishes that originated in what country?",
            "What is the largest country (by size and population) in South America?",
            "In what country is the Yangtze River found?",
            "In what country was Nelson Mandela born?",
            "Adidas and Volkswagen are companies from what country?",
            "Leonardo da Vinci was born in what country?",
            "What country has the seconnd largest population in the world?",

    };

    private String myChoices [][] = {

            {"Canada","America","Scotland","Germany"},
            {"France","Switzerland","Egypt","Canada"},
            {"Australia","China","Malaysia","Brazil"},
            {"Greece","Spain","Italy","Japan"},
            {"Chile","Argentina","Ekuador","Brazil"},
            {"China","America","Thailand","Vietnam"},
            {"Zimbabwe","South Africa","India","Brazil"},
            {"Germany","Netherland","France","Italy"},
            {"Italy","France","Britain","Spain"},
            {"India","China","Indonesia","America"}

    };

    private String myCorrectAns[] = {

            "Scotland",
            "Canada",
            "Australia",
            "Spain",
            "Brazil",
            "China",
            "South Africa",
            "Germany",
            "Italy",
            "India"
    };

    public String getQuestion(int a){
        String question = myQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = myChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = myChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2 = myChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a){
        String choice3 = myChoices[a][3];
        return choice3;
    }

    public String getAnswer(int a){
        String ans = myCorrectAns[a];
        return ans;
    }
}
