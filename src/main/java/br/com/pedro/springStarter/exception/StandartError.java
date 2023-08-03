package br.com.pedro.springStarter.exception;

import java.time.Instant;

public class StandartError {

	private Instant instant;
	private Integer status;
	private String error;
	private String message;
	private String path;

	public StandartError(Integer status, String error, String message, String path) {
		this.instant = Instant.now();
		this.error = error;
		this.message = message;
		this.path = path;
	}

	public Instant getInstant() {
		return instant;
	}

	public void setInstant(Instant instant) {
		this.instant = instant;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
