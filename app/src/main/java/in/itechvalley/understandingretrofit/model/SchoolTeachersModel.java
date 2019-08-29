package in.itechvalley.understandingretrofit.model;

import com.google.gson.annotations.SerializedName;

public class SchoolTeachersModel
{
    @SerializedName("name")
    private String teacherName;

    @SerializedName("subject")
    private String subjectTaughtByTeacher;

    /*
    * Constructor
    * */
    public SchoolTeachersModel(String teacherName, String subjectTaughtByTeacher)
    {
        this.teacherName = teacherName;
        this.subjectTaughtByTeacher = subjectTaughtByTeacher;
    }

    /*
    * Getters
    * */
    public String getTeacherName()
    {
        return teacherName;
    }

    public String getSubjectTaughtByTeacher()
    {
        return subjectTaughtByTeacher;
    }
}
