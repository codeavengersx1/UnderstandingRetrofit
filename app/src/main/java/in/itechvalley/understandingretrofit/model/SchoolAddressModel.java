package in.itechvalley.understandingretrofit.model;

import com.google.gson.annotations.SerializedName;

public class SchoolAddressModel
{
    @SerializedName("address")
    private String schoolAddress;

    /*
    * Constructor
    * */
    public SchoolAddressModel(String schoolAddress)
    {
        this.schoolAddress = schoolAddress;
    }

    /*
    * Getter
    * */
    public String getSchoolAddress()
    {
        return schoolAddress;
    }
}
