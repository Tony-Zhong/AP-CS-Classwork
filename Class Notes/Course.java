package com.company;
/* Tony Zhong
   S3C7
   2018.3.15
   classwork

 */
import java.util.List;

public class Course {
    private String coursetitle;
    private int maxstudents;
    private int numberofLessons;
    private Assessment courseAssessment;
    private List<Lesson> courseLesson;

    public Course(String newcoursetitle, int newmaxstudents, int newnumberofLessons, List<Lesson> newcourseLesson, Assessment newcourseAssessment ){
        this.coursetitle = newcoursetitle;
        this.maxstudents = newmaxstudents;
        this.numberofLessons = newnumberofLessons;
        this.courseLesson = newcourseLesson;
        this.courseAssessment = newcourseAssessment;
    }
    public void addLesson(Lesson a){
        this.numberofLessons = this.numberofLessons + 1;
        courseLesson.add(a);

    }

    public void AaddCourseAssessment(Assessment a) {
        courseAssessment = a;

    }

    public void outputCourseDetails() {
        System.out.println("Course Titile: " + this.coursetitle + "/n" +
                "Max Students: " + this.maxstudents + "/n" +
                "Number of Lessons: " + this.numberofLessons + "/n" +
                "Course Lessons: " + courseLesson);
        for (int i = 0; i <= courseLesson.size(); i++) {
            courseLesson.get(i).outputLessonDetails();
        }
        System.out.print("Course Assessment: ");
        courseAssessment.outputAssessmentDetails();


    }


    }



