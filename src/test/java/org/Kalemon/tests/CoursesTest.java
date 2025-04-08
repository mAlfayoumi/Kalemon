package org.Kalemon.tests;

import org.kalemon.data.CourseData;
import org.kalemon.pages.CoursesPage;
import org.kalemon.pages.HomePage;
import org.kalemon.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CoursesTest extends TestBase {
    private CoursesPage coursesPage;
    private HomePage homePage;
    private LoginPage loginPage;


@Test(priority = 1, dataProvider = "validCourses")
public void validCourses(CourseData course) throws InterruptedException {
    homePage = new HomePage(driver);
    loginPage = homePage.clickOnLoginButton();
    loginPage.EnterPhoneNumber(course.phoneNumber);
    loginPage.EnterPassword(course.password);
    loginPage.ClickOnLoginButton();

    coursesPage = new CoursesPage(driver);
    coursesPage.HoverOverMenuItem("My courses");
    coursesPage.ClickOnCourseIcon();
    coursesPage.ClickOnCreateCourse();
    coursesPage.ClickOnCreatePayCourse();
    coursesPage.EnterTitleAR(course.titleAR);
    coursesPage.EnterTitleEN(course.titleEN);
    coursesPage.EnterSubTitleAR(course.subTitleAR);
    coursesPage.EnterSubTitleEN(course.subTitleEN);
    coursesPage.EnterDescriptionAR(course.descriptionAR);
    coursesPage.EnterDescriptionEN(course.descriptionEN);
    coursesPage.UploadCoverImage();
    coursesPage.UploadIntroVideo();
    coursesPage.EnterLevel(course.level);
    coursesPage.EnterCourseStatus(course.courseStatus);
    coursesPage.selectTopic();
    coursesPage.EnterPrice(course.price);
    coursesPage.ClickOnNextButton();
    coursesPage.ClickOnAddMoreInfoForRequirements();
    coursesPage.EnterAddRequirements(course.requirements);
    coursesPage.ClickOnAddMoreInfoForWhoIsThisCourse();
    coursesPage.EnterAddWhoIsThisCourse(course.targetAudience);
    coursesPage.ClickOnAddMoreInfoForWhatYouWillLearn();
    coursesPage.EnterAddWhatYouWillLearn(course.learningOutcomes);
    coursesPage.ClickOnNextButton();
    coursesPage.ClickOnAddSection();
    coursesPage.EnterTheNameOfSection(course.sectionName);
    coursesPage.ClickOnSaveSection();
    coursesPage.ClickOnExpandCollapse();
    coursesPage.ClickOnAddLesson();
    coursesPage.EnterTheNameOfLesson(course.lessonName);
    coursesPage.ClickOnSaveTitleLesson();
    coursesPage.UploadLessonVideo();
    coursesPage.ClickOnSaveLesson();
    coursesPage.ClickOnSaveAsPublished();

    Assert.assertTrue(coursesPage.getActualTextValidPublished().contains(
            "The course creation process will finish shortly, and we will send a notification when it is finished"));
}

    @Test(priority = 1, dataProvider = "validCourses")
    public void testTitleArFieldRequired(CourseData course) throws InterruptedException {
        homePage = new HomePage(driver);
        loginPage = homePage.clickOnLoginButton();
        loginPage.EnterPhoneNumber(course.phoneNumber);
        loginPage.EnterPassword(course.password);
        loginPage.ClickOnLoginButton();

        coursesPage = new CoursesPage(driver);
        coursesPage.HoverOverMenuItem("My courses");
        coursesPage.ClickOnCourseIcon();
        coursesPage.ClickOnCreateCourse();
        coursesPage.ClickOnCreatePayCourse();
       // coursesPage.EnterTitleAR(course.titleAR);
        coursesPage.EnterTitleEN(course.titleEN);
        coursesPage.EnterSubTitleAR(course.subTitleAR);
        coursesPage.EnterSubTitleEN(course.subTitleEN);
        coursesPage.EnterDescriptionAR(course.descriptionAR);
        coursesPage.EnterDescriptionEN(course.descriptionEN);
        coursesPage.UploadCoverImage();
        coursesPage.UploadIntroVideo();
        coursesPage.EnterLevel(course.level);
        coursesPage.EnterCourseStatus(course.courseStatus);
        coursesPage.selectTopic();
        coursesPage.EnterPrice(course.price);
        coursesPage.ClickOnNextButton();
        coursesPage.ClickOnAddMoreInfoForRequirements();
        coursesPage.EnterAddRequirements(course.requirements);
        coursesPage.ClickOnAddMoreInfoForWhoIsThisCourse();
        coursesPage.EnterAddWhoIsThisCourse(course.targetAudience);
        coursesPage.ClickOnAddMoreInfoForWhatYouWillLearn();
        coursesPage.EnterAddWhatYouWillLearn(course.learningOutcomes);
        coursesPage.ClickOnNextButton();
        coursesPage.ClickOnAddSection();
        coursesPage.EnterTheNameOfSection(course.sectionName);
        coursesPage.ClickOnSaveSection();
        coursesPage.ClickOnExpandCollapse();
        coursesPage.ClickOnAddLesson();
        coursesPage.EnterTheNameOfLesson(course.lessonName);
        coursesPage.ClickOnSaveTitleLesson();
        coursesPage.UploadLessonVideo();
        coursesPage.ClickOnSaveLesson();
        coursesPage.ClickOnSaveAsPublished();
        coursesPage.ClickOnBasicInfo();

        Assert.assertTrue(coursesPage.getTitleArErrorMessage().contains(
                "The title ar field is required."));
    }



}
