package com.homeai.entity;

public class ServerResult {

	// statu
	private int status;

	// message
	private String message;

	// data
	private Object data;

	/**
	 * @return the Status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param statu the statu to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
}
