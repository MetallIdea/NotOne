package metal.notone;

/**
 * Created by smetalnikov on 03.04.2015.
 */
public class ApiResponse {

    private String mOneNoteClientUrl;
    private String mOneNoteWebUrl;
    private String mResponseMessage;
    private int mResponseCode;

    public String getOneNoteClientUrl() {
        return mOneNoteClientUrl;
    }

    public String getOneNoteWebUrl() {
        return mOneNoteWebUrl;
    }

    public String getResponseMessage() {
        return mResponseMessage;
    }

    public int getReseponseCode() {
        return mResponseCode;
    }

    public void setOneNoteClientUrl(String url) {
        mOneNoteClientUrl = url;
    }

    public void setOneNoteWebUrl(String url) {
        mOneNoteWebUrl = url;
    }

    public void setResponseCode(int code) {
        mResponseCode = code;
    }

    public void setResponseMessage(String message) {
        mResponseMessage = message;
    }


}