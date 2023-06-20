class Todo {
	private var todos = ArrayList<String>();

	public fun addTodo(string: String) {
		todos.add(string);
	}

	public  fun checkTodo(): ArrayList<String> {
		return todos;
	}

	public  fun remove(idx: Int) {
		todos.removeAt(idx);
	}
}

fun main() {
	val todoApp = Todo();

	while (true) {
		print("$ [todos] ~ ");
		val message = readln().toString();

		if (message == "add") {
			print("$ [string]: ");
			val string = readln().toString();

			todoApp.addTodo(string);
			println(todoApp.checkTodo());
		} else if (message == "remove") {
			print("$ [idx]: ");
			val idx = readln().toInt();

			todoApp.remove(idx);
			println(todoApp.checkTodo());
		}
	}
}