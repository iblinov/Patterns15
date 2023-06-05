package by.epam.prj.content;

import java.util.HashMap;

public class RequestContent {

    private HashMap<String, String> requestParameters = new HashMap<>();
    // поля для атрибутов сессии и запроса

    public void extractValues() {
    }
    public void insertAttributes() {
    }
    public HashMap<String, String> getRequestParameters() {
        return requestParameters;
    }
    public void setRequestParameters(HashMap<String, String> requestParameters) {
        this.requestParameters = requestParameters;
    }
}
