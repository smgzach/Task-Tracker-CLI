
public class Task 
{
	private int id;
	private String description;
	private String status;
	private String createdAt;
	private String updatedAt;
	
	public Task(int id, String description, String status, String createdAt, String updatedAt)
	{
		this.id = id;
		this.description = description;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public String toString()
	{
		return description + " || ID: " + id + " || Status: " + status + " || Created: " + createdAt + " || Last Updated: " + updatedAt;
		
	}
}
