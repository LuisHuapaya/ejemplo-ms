package com.luishuapaya.ejemploms.model;

public class PingResponse {

    private String responseMessage;

    public PingResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    @Override
	public String toString() {
		return " message: " + responseMessage;
    }
    
}