package by.bsu.commandfunctional.content;

import java.util.StringJoiner;

public class CommandResult {
    private ResponseType responseType;
    private String page;

    public CommandResult() {
    }

    public CommandResult(ResponseType responseType, String page) {
        this.responseType = responseType;
        this.page = page;
    }

    public ResponseType getResponseType() {
        return responseType;
    }

    public void setResponseType(ResponseType responseType) {
        this.responseType = responseType;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CommandResult.class.getSimpleName() + "[", "]")
                .add("responseType=" + responseType)
                .add("page='" + page + "'")
                .toString();
    }
}
