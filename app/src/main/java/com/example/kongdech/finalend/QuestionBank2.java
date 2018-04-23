package com.example.kongdech.finalend;

/**
 * Created by Kongdech on 25/8/2560.
 */

public class QuestionBank2 {

    // array of questions
    private String textQuestions [] = {
            "1. What is your career? ",
            "2. ลาออก",
            "3. What is your job?.",
            "4. Secretary.",
            "5. What duty do you have in the company?",
            "6. รายงานการประชุม",
            "7. บริษัท",
            "8. หน้าที่",
            "9. เอกสาร",
            "10.Welcome. ",

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"อาชีพของคุณคืออะไร", "อาชีพที่คุณทำดีไหม", "งานของคุณคืออะไร", "อาชีพที่คุณทำสะดวกไหม"},
            {"right now", "resign", "work", "go to"},
            {"อาชีพของคุณคืออะไร", "อาชีพที่คุณทำดีไหม", "งานของคุณคืออะไร", "อาชีพที่คุณทำสะดวกไหม"},
            {"เจ้านาย", "ตำรวจ", "ทหาร", "เลขา"},
            {"ในบริษัทคุณเป็นเลขาใช่ไหม", "เจ้านายคุณอยู่ที่บริษัทไหม", "คุณมีหน้าที่อะไรในบริษัท", "คุณชอบบริษัทที่ทำอยู่ไหม"},
            {"meeting minutes.", "company.", "duty.", "document."},
            {"meeting minutes.", "company.", "duty.", "document."},
            {"meeting minutes.", "company.", "duty.", "document."},
            {"meeting minutes.", "company.", "duty.", "document."},
            {"ต้อนรับ", "แขก", "การเตรียม", "จำเป็น"},
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"อาชีพของคุณคืออะไร", "resign", "งานของคุณคืออะไร", "เลขา","คุณมีหน้าที่อะไรในบริษัท","meeting minutes.","company.",
            "duty."
            ,"document.","ต้อนรับ" };

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