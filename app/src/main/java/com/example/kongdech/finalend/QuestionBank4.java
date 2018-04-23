package com.example.kongdech.finalend;

/**
 * Created by Kongdech on 25/8/2560.
 */

public class QuestionBank4 {

    // array of questions
    private String textQuestions [] = {
            "1. May I introduce you to ... ",
            "2. Let me introduce you to ...",
            "3. I'd like you to meet...",
            "4. Do you know each other?",
            "5. Have you ever met before?",
            "6. ยินดีที่ได้พบคุณ",
            "7. ฉันดีใจที่ได้พบคุณ",
            "8. ยินดีที่ได้รู้จักคุณ",
            "9. ดีใจที่ได้คุยกับคุณ",
            "10.ยินดีที่ได้รู้จักคุณ. ",

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"อยากให้คุณรู้จักกับ", "ขอแนะนำให้คุณรู้จักกับ", "พวกคุณรู้จักกันหรือยัง", "พวกคุณเคยรู้จักกันมาก่อนหรือยัง"},
            {"อยากให้คุณรู้จักกับ", "ขอแนะนำให้คุณรู้จักกับ", "พวกคุณรู้จักกันหรือยัง", "พวกคุณเคยรู้จักกันมาก่อนหรือยัง"},
            {"อยากให้คุณรู้จักกับ", "ขอแนะนำให้คุณรู้จักกับ", "พวกคุณรู้จักกันหรือยัง", "พวกคุณเคยรู้จักกันมาก่อนหรือยัง"},
            {"อยากให้คุณรู้จักกับ", "ขอแนะนำให้คุณรู้จักกับ", "พวกคุณรู้จักกันหรือยัง", "พวกคุณเคยรู้จักกันมาก่อนหรือยัง"},
            {"อยากให้คุณรู้จักกับ", "ขอแนะนำให้คุณรู้จักกับ", "พวกคุณรู้จักกันหรือยัง", "พวกคุณเคยรู้จักกันมาก่อนหรือยัง"},
            {"Nice to see you.", "Nice to meet you.", "Glad to meet you.", "I'm happy to see you."},
            {"Nice to see you.", "Nice to meet you.", "Glad to meet you.", "I'm happy to see you."},
            {"Nice to see you.", "Nice to meet you.", "Glad to meet you.", "I'm happy to see you."},
            {"Nice to see you.", "Nice to meet you.", "Glad to meet you.", "I'm happy to see you."},
            {"Nice to see you.", "Nice to meet you.", "Glad to meet you.", "I'm happy to see you."},
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"ขอแนะนำให้คุณรู้จักกับ", "ขอแนะนำให้คุณรู้จักกับ", "อยากให้คุณรู้จักกับ", "พวกคุณรู้จักกันหรือยัง","พวกคุณเคยรู้จักกันมาก่อนหรือยัง","Nice to see you.","I'm happy to see you.",
            "Glad to meet you."
            ,"I'm happy to see you.","Nice to meet you." };

    // method returns number of questions
    public int getLength(){
        return textQuestions.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}