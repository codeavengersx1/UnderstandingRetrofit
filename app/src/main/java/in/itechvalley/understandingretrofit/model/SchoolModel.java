package in.itechvalley.understandingretrofit.model;

import com.google.gson.annotations.SerializedName;

public class SchoolModel
{
    @SerializedName("id")
    private long schoolId;

    @SerializedName("school_name")
    private String schoolName;

    @SerializedName("principal_name")
    private String principalName;

    @SerializedName("locations")
    private SchoolAddressModel[] addresses;

    @SerializedName("teachers")
    private SchoolTeachersModel[] schoolTeachers;

    /*
    * Constructor
    * */
    public SchoolModel(long schoolId, String schoolName, String principalName, SchoolAddressModel[] addresses, SchoolTeachersModel[] schoolTeachers)
    {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
        this.principalName = principalName;
        this.addresses = addresses;
        this.schoolTeachers = schoolTeachers;
    }

    /*
    * Getters
    * */
    public long getSchoolId()
    {
        return schoolId;
    }

    public String getSchoolName()
    {
        return schoolName;
    }

    public String getPrincipalName()
    {
        return principalName;
    }

    public SchoolAddressModel[] getAddresses()
    {
        return addresses;
    }

    public SchoolTeachersModel[] getSchoolTeachers()
    {
        return schoolTeachers;
    }
}
