package org.example;

public class Request {
    private String actionCode;
    private int idx;

    public Request (String command) {
        String[] commandList = command.split("\\?", 2);
        this.actionCode = commandList[0];
        try {
            String[] paramsStr = commandList[1].split("=", 2);
            String key = paramsStr[0];
            String value = paramsStr[1];
            this.idx = Integer.parseInt(value);
        } catch (ArrayIndexOutOfBoundsException e) {}
    }

    public String getActionCode () {
        return actionCode;
    }
    public int getIdx () {
        return idx;
    }
}
