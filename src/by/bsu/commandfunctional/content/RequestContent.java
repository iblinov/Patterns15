package by.bsu.commandfunctional.content;

import java.util.HashMap;
import java.util.Map;

public class RequestContent {

    private Map<String, String> requestParameters = new HashMap<>();

    public RequestContent(Map<String, String> requestParameters) {
        this.requestParameters = requestParameters;
    }

    public Map<String, String> getRequestParameters() {
        return requestParameters;
    }

    public void setRequestParameters(Map<String, String> requestParameters) {
        this.requestParameters = requestParameters;
    }

    public String get(Object key) {
        return requestParameters.get(key);
    }
}
