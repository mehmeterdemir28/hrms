package kodlamaio.hrms.core.results;

public class Result {

	private boolean success;
	private String message;

	public Result(boolean success) {

		this.success = success;

	}

	public Result(boolean success, String message) {

		this.message = message;
		this.success = success;

	}

	public boolean isSuccess() {
		return this.success;
	}

	public String getMessage(String message) {

		return this.message;

	}

}
