package com.example.kongdech.finalend;

/**
 * Created by Kongdech on 25/8/2560.
 */

public class QuestionBank {

    // array of questions
    private String textQuestions [] = {
            "1. Long time no see. ",
            "2. สวัสดีตอนเช้า",
            "3. ฉันสบายดี",
            "4. I'm very well.",
            "5. ขอให้โชคดี",
            "6. See you again.",
            "7. I must be going.",
            "8. ดูแลตัวเองด้วย.",
            "9. I'm from Thailand.",
            "10. ฉันอยู่ภูเก็ต.",

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"ไม่ได้เจอกันตั้งนาน", "เป็นอย่างไรบ้าง", "สบายดีไหม", "มีความสุขหรือเปล่า"},
            {"Good afternoon.", "Good mornimg.", "Good evening.", "Good night."},
            {"I'm not fine.", "I'm not O.K.", "I'm fine.", "Not good."},
            {"ฉันสบายดี", "ฉันสบายดีมาก", "ฉันไม่ค่อยสบาย", "ฉันไม่ค่อยจะดี"},
            {"Have a good time.", "Have a nice day.", "Have a nice trip.", "Good luck to you."},
            {"ลาก่อน", "ดูแลตัวเองด้วย", "แล้วพบกัน", "ต้องไปแล้ว"},
            {"ฉันต้องไปแล้ว", "ฉันฝากความคิดถึง", "ฉันขอให้สนุก", "ฉันขอให้สนุกกับการเดินทาง"},
            {"Take care mom. ", "Take care of youe self.", "Good luck.", "I love you."},
            {"ฉันมาจากประเทศไทย", "ฉันรักประเทศไทย", "ฉํนเกิดที่ประเทศไทย", "ฉันเป็นคนไทย"},
            {"I come from phuket.", "I tour phuket.", "I love phuket.", "I live in phuket."},
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"ไม่ได้เจอกันตั้งนาน", "Good mormimg.", "I'm fine.", "ฉันสบายดีมาก","Good luck to you.","แล้วพบกัน","ฉันต้องไปแล้ว","Take care of youe self."
            ,"ฉันมาจากประเทศไทย","I live in phuket." };

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
