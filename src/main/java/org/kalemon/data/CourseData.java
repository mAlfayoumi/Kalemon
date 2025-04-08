package org.kalemon.data;

public class CourseData {
    public String phoneNumber;
    public String password;
    public String titleAR;
    public String titleEN;
    public String subTitleAR;
    public String subTitleEN;
    public String descriptionAR;
    public String descriptionEN;
    public int level;
    public int courseStatus;
    public String price;
    public String requirements;
    public String targetAudience;
    public String learningOutcomes;
    public String sectionName;
    public String lessonName;

    // Constructor
    public CourseData(String phoneNumber, String password, String titleAR, String titleEN,
                      String subTitleAR, String subTitleEN, String descriptionAR, String descriptionEN,
                      int level, int courseStatus, String price, String requirements,
                      String targetAudience, String learningOutcomes, String sectionName, String lessonName) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.titleAR = titleAR;
        this.titleEN = titleEN;
        this.subTitleAR = subTitleAR;
        this.subTitleEN = subTitleEN;
        this.descriptionAR = descriptionAR;
        this.descriptionEN = descriptionEN;
        this.level = level;
        this.courseStatus = courseStatus;
        this.price = price;
        this.requirements = requirements;
        this.targetAudience = targetAudience;
        this.learningOutcomes = learningOutcomes;
        this.sectionName = sectionName;
        this.lessonName = lessonName;
    }
}
