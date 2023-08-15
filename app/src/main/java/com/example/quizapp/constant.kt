package com.example.quizapp

object constant {
    fun getQuestions():ArrayList<Question>{
        val questionlist =ArrayList<Question>()
        val q1=Question(
            1,"whose flag?",R.drawable.c1,"Germany","Russia",
        "France",	"United Kingdom",1)
        questionlist.add(q1)

        val q2=Question(
            2,"whose flag?",R.drawable.c2,"Germany","Japan",
            "France",	"United Kingdom",2)
        questionlist.add(q2)
        val q3=Question(
            3,"whose flag?",R.drawable.c3,"Germany","Russia",
            "France",	"Ireland",4)
        questionlist.add(q3)
        val q4=Question(
            4,"whose flag?",R.drawable.c4,"Canada","Russia",
            "France",	"Ireland",1)
        questionlist.add(q4)
        val q5=Question(
            5,"whose flag?",R.drawable.c5,"Germany","Russia",
            "United Kingdom",	"Ireland",3)
        questionlist.add(q5)
        val q6=Question(
            6,"whose flag?",R.drawable.c6,"Germany","USA",
            "United Kingdom",	"Ireland",2)
        questionlist.add(q6)

        val q7=Question(
            7,"whose flag?",R.drawable.c7,"Germany","USA",
            " Bahrain",	"Ireland",3)
        questionlist.add(q7)
        val q8=Question(
            8,"whose flag?",R.drawable.c8,"China","USA",
            "United Kingdom",	"Ireland",1)
        val q9=Question(
            9,"whose flag?",R.drawable.c9,"China","USA",
            "United Kingdom",	"Argentina",4)
        questionlist.add(q9)

        val q10=Question(
            9,"whose flag?",R.drawable.c10,"China","Jamaica",
            "United Kingdom",	"Argentina",2)
        questionlist.add(q10)




        return questionlist
    }

}