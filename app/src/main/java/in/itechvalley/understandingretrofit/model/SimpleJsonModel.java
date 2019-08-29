package in.itechvalley.understandingretrofit.model;

import com.google.gson.annotations.SerializedName;

public class SimpleJsonModel
{
    /*
    *   {
            "success": true,
            "message": "Login successful",
            "status_code": 200
        }
    *
    * */

    @SerializedName("success")
    private boolean success;

    @SerializedName("message")
    private String message;

    @SerializedName("status_code")
    private int statusCode;

    /*
    * Constructor (used by Gson)
    * */
    public SimpleJsonModel(boolean success, String message, int statusCode)
    {
        this.success = success;
        this.message = message;
        this.statusCode = statusCode;
    }

    /*
    * Getters (used by Developer)
    * */
    public boolean isSuccess()
    {
        return success;
    }

    public String getMessage()
    {
        return message;
    }

    public int getStatusCode()
    {
        return statusCode;
    }
}
