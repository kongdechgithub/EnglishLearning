package com.example.kongdech.finalend;

/**
 * Created by Kongdech on 25/8/2560.
 */

public class QuestionBank1 {

    // array of questions
    private String textQuestions [] = {
            "1. Thank you for your kindness. ",
            "2. Thanks  for your advice.",
            "3. Thanks for your help.",
            "4. Thanks for everything.",
            "5. ไม่มีปัญหา",
            "6. Don't worry about that.",
            "7. ขอบคุณมากๆ สำหรับกำลังใจ",
            "8. I'm sorry. I have kept you waiting.",
            "9. I'm sorry. but I can't help you.",
            "10.I'm sorry to have troubled you. ",

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"ขอบคุณสำหรับความกรุณา", "ขอบคุณสำหรับความช่วยเหลือ", "ขอบคุณสำหรับคำแนะนำ", "ขอบคุณสำหรับทุกสิ่ง"},
            {"ขอบคุณสำหรับความกรุณา", "ขอบคุณสำหรับความช่วยเหลือ", "ขอบคุณสำหรับคำแนะนำ", "ขอบคุณสำหรับทุกสิ่ง"},
            {"ขอบคุณสำหรับความกรุณา", "ขอบคุณสำหรับความช่วยเหลือ", "ขอบคุณสำหรับคำแนะนำ", "ขอบคุณสำหรับทุกสิ่ง"},
            {"ขอบคุณสำหรับความกรุณา", "ขอบคุณสำหรับความช่วยเหลือ", "ขอบคุณสำหรับคำแนะนำ", "ขอบคุณสำหรับทุกสิ่ง"},
            {"That's O.K.", "That's all right.", "Never mind.", "No problem."},
            {"อย่าใจร้าย", "อย่าคิดมาก", "อย่ามีปัญหา", "อย่าไปไหน"},
            {"Thank a lot.", "Thank you very much for you kindess.", "I do appreciate your kindness.", "Thank you very much for cheering me up."},
            {"ฉันขอโทษที่ปล่อยให้คุณต้องรอ ", "ฉันขอโทษแต่ฉันไม่สามารถช่วยเหลือเธอได้", "ฉันขอโทษที่รบกวน", "ฉันขอโทษจริงๆที่ปล่อยให้เธอต้องรอ"},
            {"ฉันขอโทษที่ปล่อยให้คุณต้องรอ ", "ฉันขอโทษแต่ฉันไม่สามารถช่วยเหลือเธอได้", "ฉันขอโทษที่รบกวน", "ฉันขอโทษจริงๆที่ปล่อยให้เธอต้องรอ"},
            {"ฉันขอโทษที่ปล่อยให้คุณต้องรอ ", "ฉันขอโทษแต่ฉันไม่สามารถช่วยเหลือเธอได้", "ฉันขอโทษที่รบกวน", "ฉันขอโทษจริงๆที่ปล่อยให้เธอต้องรอ"},
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"ขอบคุณสำหรับความกรุณา", "ขอบคุณสำหรับคำแนะนำ", "ขอบคุณสำหรับความช่วยเหลือ", "ขอบคุณสำหรับทุกสิ่ง","No problem.","อย่าคิดมาก","Thank you very much for cheering me up.",
            "ฉันขอโทษที่ปล่อยให้คุณต้องรอ"
            ,"ฉันขอโทษแต่ฉันไม่สามารถช่วยเหลือเธอได้","ฉันขอโทษที่รบกวน" };

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
