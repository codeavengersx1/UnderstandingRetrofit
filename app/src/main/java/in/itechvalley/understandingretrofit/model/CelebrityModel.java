package in.itechvalley.understandingretrofit.model;

import com.google.gson.annotations.SerializedName;

public class CelebrityModel
{
    /*
    * {
        "id": 1,
        "name": "Ranu Mandal",
        "city": "Mumbai",
        "mobile_number": 9881234567,
        "wikipedia_url": "http://sillyconfusion.com/ranu-mondal-biography-success-story/",
        "is_indian": true
     }
    * */

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String celebrityName;

    @SerializedName("city")
    private String city;

    @SerializedName("mobile_number")
    private long mobileNumber;

    @SerializedName("wikipedia_url")
    private String wikipediaUrl;

    @SerializedName("is_indian")
    private boolean isIndian;

    /*
    * Constructor
    * */
    public CelebrityModel(int id, String celebrityName, String city, long mobileNumber, String wikipediaUrl, boolean isIndian)
    {
        this.id = id;
        this.celebrityName = celebrityName;
        this.city = city;
        this.mobileNumber = mobileNumber;
        this.wikipediaUrl = wikipediaUrl;
        this.isIndian = isIndian;
    }

    /*
    * Getters
    * */
    public int getId()
    {
        return id;
    }

    public String getCelebrityName()
    {
        return celebrityName;
    }

    public String getCity()
    {
        return city;
    }

    public long getMobileNumber()
    {
        return mobileNumber;
    }

    public String getWikipediaUrl()
    {
        return wikipediaUrl;
    }

    public boolean isIndian()
    {
        return isIndian;
    }
}
