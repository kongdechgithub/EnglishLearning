package com.example.kongdech.finalend;

/**
 * Created by Kongdech on 25/8/2560.
 */

public class QuestionBank3 {

    // array of questions
    private String textQuestions [] = {
            "1. Good bye. ",
            "2. I have to go now.",
            "3. I must be going.",
            "4. ขอให้โชคดีในการเดินทาง",
            "5. ขอให้โชคดี",
            "6. ดูแลตัวเองด้วยนะ",
            "7. ขอให้สนุก",
            "8. See you next time.",
            "9. See you tomorrow.",
            "10.See you again. ",

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"ลาก่อน", "สวัสดีตอนเช้า", "สวัสดีตอนเย็น", "ดีมากเลย"},
            {"ขอให้โชคดี", "ฉันต้องไปแล้ว", "ดูแลตัวเองด้วย", "ขอให้สนุก"},
            {"ขอให้โชคดี", "ฉันต้องไปแล้ว", "ดูแลตัวเองด้วย", "ขอให้สนุก"},
            {"Good luck to you.", "Have a good time.", "Have a nice day.", "Bon voyage."},
            {"Good luck to you.", "Have a good time.", "Have a nice day.", "Bon voyage."},
            {"Good luck to you.", "Take care of your self.", "Have a nice day.", "Bon voyage."},
            {"Good luck to you.", "Take care of your self.", "Have a nice day.", "Bon voyage."},
            {"แล้วพบกันพรุ่งนี้", "โอกาสหน้าพบกันใหม่", "แล้วพบกันอีก", "พบกันเร็วๆนี้"},
            {"แล้วพบกันพรุ่งนี้", "โอกาสหน้าพบกันใหม่", "แล้วพบกันอีก", "พบกันเร็วๆนี้"},
            {"แล้วพบกันพรุ่งนี้", "โอกาสหน้าพบกันใหม่", "แล้วพบกันอีก", "พบกันเร็วๆนี้"},
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"ลาก่อน*", "ฉันต้องไปแล้ว", "ฉันต้องไปแล้ว", "Bon voyage.","Good luck to you.","Take care of your self.","Have a nice day.",
            "โอกาสหน้าพบกันใหม่"
            ,"แล้วพบกันพรุ่งนี้","แล้วพบกันอีก" };

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