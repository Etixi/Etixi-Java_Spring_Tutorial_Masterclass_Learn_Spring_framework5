////////////////////////////////////////////////////////////////////////////////
// Created By Etienne KOA
////////////////////////////////////////////////////////////////////////////////

package academy.learnprogramming.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(of = "id")
public class TodoItem {

	// == fields ==
	private int id;
	private String title;
	private String details;
	private LocalDate deadline;


	// == constructors ==

	public TodoItem(String title, String details, LocalDate deadline) {
		this.title = title;
		this.details = details;
		this.deadline = deadline;
	}

	/*public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof TodoItem)) return false;

		TodoItem todoItem = (TodoItem) o;

		return id == todoItem.id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public String toString() {
		return "TodoItem{" +
				"id=" + id +
				", title='" + title + '\'' +
				", details='" + details + '\'' +
				", deadline=" + deadline +
				'}';
	}*/
}
