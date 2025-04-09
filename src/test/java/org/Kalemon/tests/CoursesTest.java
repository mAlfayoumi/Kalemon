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

    @Test(priority = 2, dataProvider = "validCourses")
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


    @Test(priority = 3, dataProvider = "validCourses")
    public void testTitleEnFieldRequired(CourseData course) throws InterruptedException {
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
       // coursesPage.EnterTitleEN(course.titleEN);
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

        Assert.assertTrue(coursesPage.getTitleEnErrorMessage().contains(
                "The title en field is required."));
    }




    @Test(priority = 4, dataProvider = "validCourses")
    public void testSubTitleENFieldRequired(CourseData course) throws InterruptedException {
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
        //coursesPage.EnterSubTitleEN(course.subTitleEN);
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

        Assert.assertTrue(coursesPage.getSubTitleEnErrorMessage().contains(
                "The subtitle en field is required."));
    }

    @Test(priority = 5, dataProvider = "validCourses")
    public void testSubTitleArFieldRequired(CourseData course) throws InterruptedException {
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
        //  coursesPage.EnterSubTitleAR(course.subTitleAR);
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

        Assert.assertTrue(coursesPage.getSubTitleArErrorMessage().contains(
                "The subtitle ar field is required."));
    }


    @Test(priority = 6, dataProvider = "validCourses")
    public void testImageFieldRequired(CourseData course) throws InterruptedException {
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
        //coursesPage.UploadCoverImage();
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

        Assert.assertTrue(coursesPage.getImageErrorMessage().contains(
                "The photo field is required."));
    }


    @Test(priority = 7, dataProvider = "validCourses")
    public void testVideoFieldRequired(CourseData course) throws InterruptedException {
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
        // coursesPage.UploadIntroVideo();
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

        Assert.assertTrue(coursesPage.getVideoErrorMessage().contains(
                "The video field is required."));
    }

    @Test(priority = 8, dataProvider = "validCourses")
    public void testLevelFieldRequired(CourseData course) throws InterruptedException {
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
        //  coursesPage.EnterLevel(course.level);
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

        Assert.assertTrue(coursesPage.getLevelErrorMessage().contains(
                "The level id field is required."));
    }

    @Test(priority = 9, dataProvider = "validCourses")
    public void testTopicFieldRequired(CourseData course) throws InterruptedException {
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
        // coursesPage.selectTopic();
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

        Assert.assertTrue(coursesPage.getTopicErrorMessage().contains(
                "The category topic ids field is required."));
    }

    @Test(priority = 10, dataProvider = "validCourses")
    public void testPriceFieldRequired(CourseData course) throws InterruptedException {
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
        coursesPage.ClickOnBasicInfo();
        Assert.assertTrue(coursesPage.getPriceErrorMessage().contains(
                "Price must be greater than or equal to 50"));

    }


}
