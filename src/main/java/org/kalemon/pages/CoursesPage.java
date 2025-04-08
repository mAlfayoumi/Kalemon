package org.kalemon.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;


public class CoursesPage extends PageBase {
    public CoursesPage(WebDriver driver) {
        super(driver);
    }

    //Icons + Button
    By CourseIcon = By.xpath("//*[@id=\"__next\"]/main/div[2]/div/div/a[2]/div");
    By CreateCourses = By.xpath("//*[@id=\"create-course-btn\"]");
    By CoursePay = By.xpath("//*[@id=\"radix-:r9:\"]/div/div/button[1]");
    By CourseFree = By.xpath("//*[@id=\"radix-:r9:\"]/div/div/button[2]");
    By NextButton = By.xpath("//button[text()='Next']\n");
    By SaveAsDraftButton = By.xpath("//button[text()='save as draft']\n");
    By AddSectionButton = By.xpath("//button[text()='Add Section']\n");
    By SaveSectionButton = By.xpath("//button[contains(text(), 'Save')]\n");
    By AddLessonButton = By.xpath("//div[div[text()='Add Lesson']]\n");
    By SaveTitleLessonButton = By.xpath("//button[contains(text(), 'Save')]\n");
    By SaveLessonButton= By.xpath("//button[contains(@class, 'bg-primary-k-blue') and text()='Save']\n");
    By SaveAsPublishedButton = By.xpath("//button[text()='Publish']\n");
    By BasicInfoTap= By.xpath("//div[contains(text(), 'Basic Info')]\n");


    // All Fields Used when create the courses
    By titleAR = By.xpath("//input[@placeholder=\"أدخل اسم الدورة بالعربي\"]\n");
    By titleEN = By.xpath("//input[@placeholder=\"Insert your course title\"]\n");
    By subTitleAR = By.xpath("//input[@placeholder='أدخل العنوان الفرعي للدورة بالعربي ' and @maxlength='160']\n");
    By subTitleEN = By.xpath("//input[@placeholder=\"Insert your course subtitle\"]\n");
    By descriptionAR = By.xpath("//textarea[@placeholder=\"اكتب نبذه قصيرة عن الدورة\"]\n");
    By descriptionEN = By.xpath("//textarea[@placeholder=\"Write a short summary of your course\"]\n");
    By courseCover = By.xpath("//button[.//p[text()='Upload course cover']]\n");
    By Price = By.xpath("//input[@type=\"number\" and @name=\"price\"]\n");
    By firstAddMoreInfoButton = By.xpath("//div[@class='my-12'][1]//button[contains(text(), 'Add more information')]\n");
    By secondAddMoreInfoButton = By.xpath("//div[@class='my-12'][2]//button[contains(text(), 'Add more information')]\n");
    By thirdAddMoreInfoButton = By.xpath("//div[@class='my-12'][3]//button[contains(text(), 'Add more information')]\n");
    By courseRequirements = By.xpath("//input[@placeholder='Please add course requirements']");
    By whoIsThisCourse = By.xpath("//input[@placeholder='Please add who is this course for']");
    By whatYouWillLearn = By.xpath("//input[@placeholder='Please add what you will learn in this course']");
    By sectionTitle = By.xpath("//input[@placeholder='Enter the name of the section ']\n");
    By lessonTitle = By.xpath("//textarea[@placeholder='Enter the name of the lesson ']\n");
    By videoLesson = By.xpath("//label[.//p[text()='Add video']]\n");
    By PublishedSuccess = By.xpath("//div[contains(text(), 'The course creation process will finish shortly')]\n");
    By MessageTitleAR = By.xpath("//p[contains(text(), 'title ar field is required')]\n");

    // Drop DownList
    By SelectLevel = By.xpath("//select[.//option[text()=\"Easy\"]]\n");
    By SelectCourseStatus = By.xpath("//select[.//option[text()=\"Active\"]]\n");


    WebElement CourseIconElement;
    WebElement CreateCoursesButtonElement;
    WebElement CoursesPayButtonElement;
    WebElement CoursesFreeButtonElement;
    WebElement FiledTitleArElement;
    WebElement FiledTitleEnElement;
    WebElement FiledSubTitleARElement;
    WebElement FiledSubTitleENElement;
    WebElement FiledDescriptionARElement;
    WebElement FiledDescriptionENElement;
    WebElement FiledSelectLevelElement;
    WebElement FiledSelectCourseStatusElement;
    WebElement FiledPriceElement;
    WebElement FiledNextElement;
    WebElement FiledSaveAsDraftElement;
    WebElement FiledMoreInfoElementRequirementsElement;
    WebElement FiledAddRequirementsElement;
    WebElement FiledMoreInfoElementWhoIsThisCourseElement;
    WebElement FiledWhoIsThisCourseElement;
    WebElement FiledMoreInfoElementWhatYouWillLearnElement;
    WebElement FiledWhatYouWillLearnElement;
    WebElement FiledAddSectionElement;
    WebElement FiledTitleSectionElement;
    WebElement FiledSaveSectionElement;
    WebElement FiledAddLessonElement;
    WebElement FiledAddTitleLessonElement;
    WebElement FiledSaveTitleLessonElement;
    WebElement FileVideoLessonInputElement;
    WebElement FiledFileInputElement;
    WebElement FiledSaveLessonElement ;
    WebElement FiledSaveAsPublishedElement;
    WebElement FiledBasicInfoElement ;




    public void HoverOverMenuItem(String courses) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement menuItemElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(@href, '/en/user/teacher/courses')]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menuItemElement);
        Actions actions = new Actions(driver);
        actions.moveToElement(menuItemElement).perform();


    }




    public void ClickOnCourseIcon() {
        CourseIconElement = driver.findElement(CourseIcon);
        PageBase.Clicking(CourseIconElement);

    }

    public void ClickOnCreateCourse() {
        CreateCoursesButtonElement = driver.findElement(CreateCourses);
        PageBase.Clicking(CreateCoursesButtonElement);
    }

    public void ClickOnCreatePayCourse() throws InterruptedException {
        CoursesPayButtonElement = driver.findElement(CoursePay);
        PageBase.Clicking(CoursesPayButtonElement);

        Thread.sleep(5000);
    }


    public void ClickOnCreateFreeCourse() {
        CoursesFreeButtonElement = driver.findElement(CourseFree);
        PageBase.Clicking(CoursesFreeButtonElement);
    }

    public void EnterTitleAR(String titleForArabic) {
        FiledTitleArElement = driver.findElement(titleAR);
        PageBase.sendText(FiledTitleArElement, titleForArabic);
    }

    public void EnterTitleEN(String titleForEnglish) {
        FiledTitleEnElement = driver.findElement(titleEN);
        PageBase.sendText(FiledTitleEnElement, titleForEnglish);
    }

    public void EnterSubTitleAR(String subTitleForArabic) {
        FiledSubTitleARElement = driver.findElement(subTitleAR);
        PageBase.sendText(FiledSubTitleARElement, subTitleForArabic);
    }

    public void EnterSubTitleEN(String subTitleForEnglish) {
        FiledSubTitleENElement = driver.findElement(subTitleEN);
        PageBase.sendText(FiledSubTitleENElement, subTitleForEnglish);
    }

    public void EnterDescriptionAR(String descriptionForArabic) {
        FiledDescriptionARElement = driver.findElement(descriptionAR);
        PageBase.sendText(FiledDescriptionARElement, descriptionForArabic);
    }

    public void EnterDescriptionEN(String descriptionForEnglish) {
        FiledDescriptionENElement = driver.findElement(descriptionEN);
        PageBase.sendText(FiledDescriptionENElement, descriptionForEnglish);
    }



    By fileInputImage = By.xpath("//button[.//p[text()='Upload course cover']]/preceding-sibling::input[@type='file']\n");
    By fileInputVideo = By.xpath("//button[.//p[text()='Upload course intro video']]/preceding-sibling::input[@type='file']\n");

    public void UploadCoverImage() {

        try {
            {
                driver.findElement(courseCover).click();
                String filePathImage = "C:\\Users\\CYBORG\\Desktop\\FileTest\\ImageCourses.jpg";
                PageBase.uploadFile(driver, fileInputImage, filePathImage);

            }
        } catch (Exception e) {
            System.out.println("File upload failed: " + e.getMessage());
        }


    }
    public void UploadIntroVideo ()
    {
        String filePath = "C:\\Users\\CYBORG\\Desktop\\FileTest\\VideoCourses.mp4";
        PageBase.uploadFile(driver, fileInputVideo,filePath);
    }

    public void EnterLevel(int index) {
        FiledSelectLevelElement = driver.findElement(SelectLevel);
        PageBase.selectByIndex(FiledSelectLevelElement, index);
    }

    public void EnterCourseStatus(int index) {
        FiledSelectCourseStatusElement = driver.findElement(SelectCourseStatus);
        PageBase.selectByIndex(FiledSelectCourseStatusElement, index);
    }

    public void selectTopic()
    {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);

        List<String> topics = List.of(
                "Software Project Management - Faculty of Information Technology - Middle East University",
                "Fundamentals of Nursing - Faculty of Nursing - Middle East University",
                "drawing  - Faculty of Arts - Middle East University",
                "Engineering drawing - Faculty of Engineering - Hashemite University",
                "Fundamentals of Nursing - Faculty of Nursing - Hashemite University",
                "Science - First grade",
                "mathematics - First grade"
        );

        WebElement inputField = driver.findElement(By.id("react-select-2-input"));

        for (String topic : topics) {
            actions.moveToElement(inputField).click().sendKeys(topic).perform();

            WebElement topicOption = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[contains(@class, 'react-select__menu')]\n")
            ));


            topicOption.click();
        }


    }

    public void EnterPrice(String priceOfCourse) {
        FiledPriceElement = driver.findElement(Price);
        FiledPriceElement.clear();
        PageBase.sendText(FiledPriceElement, priceOfCourse);
    }

    public void ClickOnNextButton() {
        FiledNextElement = driver.findElement(NextButton);
        PageBase.Clicking(FiledNextElement);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
    }

    public void ClickOnSaveAsDraftButton() {
        FiledSaveAsDraftElement = driver.findElement(SaveAsDraftButton);
        PageBase.Clicking(FiledSaveAsDraftElement);
    }

    public void ClickOnAddMoreInfoForRequirements() {
        FiledMoreInfoElementRequirementsElement = driver.findElement(firstAddMoreInfoButton);
        PageBase.Clicking(FiledMoreInfoElementRequirementsElement);
    }

    public void EnterAddRequirements(String addNewRequirements) {
        FiledAddRequirementsElement = driver.findElement(courseRequirements);
        PageBase.sendText(FiledAddRequirementsElement, addNewRequirements);
    }

    public void ClickOnAddMoreInfoForWhoIsThisCourse() {
        FiledMoreInfoElementWhoIsThisCourseElement = driver.findElement(secondAddMoreInfoButton);
        PageBase.Clicking(FiledMoreInfoElementWhoIsThisCourseElement);
    }

    public void EnterAddWhoIsThisCourse(String addNewWhoIsThisCourse) {
        FiledWhoIsThisCourseElement = driver.findElement(whoIsThisCourse);
        PageBase.sendText(FiledWhoIsThisCourseElement, addNewWhoIsThisCourse);
    }


    public void ClickOnAddMoreInfoForWhatYouWillLearn() {
        FiledMoreInfoElementWhatYouWillLearnElement = driver.findElement(thirdAddMoreInfoButton);
        PageBase.Clicking(FiledMoreInfoElementWhatYouWillLearnElement);
    }

    public void EnterAddWhatYouWillLearn(String addNewWhatYouWillLearn) {
        FiledWhatYouWillLearnElement = driver.findElement(whatYouWillLearn);
        PageBase.sendText(FiledWhatYouWillLearnElement, addNewWhatYouWillLearn);
    }

    public void ClickOnAddSection() {
        FiledAddSectionElement = driver.findElement(AddSectionButton);
        PageBase.Clicking(FiledAddSectionElement);
    }
    public void EnterTheNameOfSection(String addTitleOfSection) {
        FiledTitleSectionElement = driver.findElement(sectionTitle);
        PageBase.sendText(FiledTitleSectionElement, addTitleOfSection);
    }

    public void ClickOnSaveSection() {
        FiledSaveSectionElement = driver.findElement(SaveSectionButton);
        PageBase.Clicking(FiledSaveSectionElement);
    }

public void ClickOnExpandCollapse() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Increase wait time
    WebElement expandCollapseButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/main/div[3]/main/form/div[2]/div[3]/div/div[2]/div[2]/div/div/div[2]")));
    Actions actions = new Actions(driver);
    actions.moveToElement(expandCollapseButton).click().perform();

}


    public void ClickOnAddLesson() {
        FiledAddLessonElement = driver.findElement(AddLessonButton);
        PageBase.Clicking(FiledAddLessonElement);
    }

    public void EnterTheNameOfLesson(String addTitleOfLesson) {
        FiledAddTitleLessonElement = driver.findElement(lessonTitle);
        PageBase.sendText(FiledAddTitleLessonElement, addTitleOfLesson);
    }

    public void ClickOnSaveTitleLesson() {
        FiledSaveTitleLessonElement = driver.findElement(SaveTitleLessonButton);
        PageBase.Clicking(FiledSaveTitleLessonElement);
    }



    public  void UploadLessonVideo ()  {
        // Define video file path
        String videoPath = "C:\\Users\\CYBORG\\Desktop\\FileTest\\LessonCourses.mp4";

        FileVideoLessonInputElement = driver.findElement(videoLesson);
        FileVideoLessonInputElement.click();
        FiledFileInputElement = driver.findElement(By.xpath("//label[.//p[text()='Add video']]/input[@type='file']\n")); // Adjust if necessary
        PageBase.sendText (FiledFileInputElement,videoPath);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ESCAPE).perform();

    }


    public void ClickOnSaveLesson() {
        FiledSaveLessonElement = driver.findElement(SaveLessonButton);
        PageBase.Clicking(FiledSaveLessonElement);
    }
    public void ClickOnSaveAsPublished() throws InterruptedException {
        FiledSaveAsPublishedElement = driver.findElement(SaveAsPublishedButton);
        PageBase.Clicking(FiledSaveAsPublishedElement);
        Thread.sleep(4000);
    }

    public String getActualTextValidPublished () {

        return getElementText(PublishedSuccess);
    }

    public  String getTitleArErrorMessage ()
    {
        return getElementText(MessageTitleAR);
    }

    public void ClickOnBasicInfo() {
        FiledBasicInfoElement = driver.findElement(BasicInfoTap);
        PageBase.Clicking(FiledBasicInfoElement);
    }

}
