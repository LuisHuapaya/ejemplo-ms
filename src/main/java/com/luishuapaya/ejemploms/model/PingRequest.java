package com.luishuapaya.ejemploms.model;

public class PingRequest {

    private long id;
    private String message;

	public PingRequest(long id, String message) {
        this.id = id;
        this.message = message;
    }

    @Override
	public String toString() {
		return "id: " + String.valueOf(id) + " message: " + message;
	}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}