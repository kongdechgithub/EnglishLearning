package com.example.kongdech.finalend;

/**
 * Created by Kongdech on 25/8/2560.
 */

public class QuestionBank5 {

    // array of questions
    private String textQuestions [] = {
            "1. Sorry. I'm rate. ",
            "2. I'm sorry. I have kept you waiting.",
            "3. I'm sorry to have trobled you.",
            "4. I'm sorry, but I can't help you.",
            "5. Excuse me. May I sit here?",
            "6. Excuse me. May I use your telephone?",
            "7. Excuse me for a moment.",
            "8. Excuse me. Is  there a post office near here?",
            "9. อย่าพูดถึงมันอีกเลย",
            "10.ไม่มีปัญหา ",

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"ขอโทษที่มาสาย", "ขอโทษที่รบกวน", "ขอโทษ แต่ฉันไม่สามารถให้ความช่วยเหลือได้", "ขอโทษที่ปล่อยให้คุณรอ"},
            {"ขอโทษที่มาสาย", "ขอโทษที่รบกวน", "ขอโทษ แต่ฉันไม่สามารถให้ความช่วยเหลือได้", "ขอโทษที่ปล่อยให้คุณรอ"},
            {"ขอโทษที่มาสาย", "ขอโทษที่รบกวน", "ขอโทษ แต่ฉันไม่สามารถให้ความช่วยเหลือได้", "ขอโทษที่ปล่อยให้คุณรอ"},
            {"ขอโทษที่มาสาย", "ขอโทษที่รบกวน", "ขอโทษ แต่ฉันไม่สามารถให้ความช่วยเหลือได้", "ขอโทษที่ปล่อยให้คุณรอ"},
            {"ขอโทษที่มาสาย", "ขอโทษที่รบกวน", "ขอโทษ แต่ฉันไม่สามารถให้ความช่วยเหลือได้", "ขอโทษที่ปล่อยให้คุณรอ"},
            {"ขอโทษที่มาสาย", "ขอโทษที่รบกวน", "ขอโทษ แต่ฉันไม่สามารถให้ความช่วยเหลือได้", "ขอโทษที่ปล่อยให้คุณรอ"},
            {"ขอโทษที่มาสาย", "ขอโทษที่รบกวน", "ขอโทษ แต่ฉันไม่สามารถให้ความช่วยเหลือได้", "ขอโทษที่ปล่อยให้คุณรอ"},
            {"ขอโทษที่มาสาย", "ขอโทษที่รบกวน", "ขอโทษ แต่ฉันไม่สามารถให้ความช่วยเหลือได้", "ขอโทษที่ปล่อยให้คุณรอ"},
            {"That's all right.", "Never mind.", "No problem.", "Don't mention it."},
            {"That's all right.", "Never mind.", "No problem.", "Don't mention it."},
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"ขอโทษที่มาสาย", "ขอโทษที่ปล่อยให้คุณรอ", "ขอโทษที่รบกวน", "ขอโทษ แต่ฉันไม่สามารถให้ความช่วยเหลือได้","ขอโทษนั่งตรงนี้ได้ไหม","ขอโทษ ฉันขอใช้โทรศัพท์คุณได้ไหม","ขอโทษ ขอตัวสักครู่",
            "ขอโทษ แถวนี้มีไปรษณีย์ไหม"
            ,"Don't mention it.","No problem." };

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