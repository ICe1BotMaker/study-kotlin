import java.util.Random;

fun main() {
	while (true) {
		readln();
		val random = Random();
		val num = random.nextInt(0, 6) + 1;

		println(num);
	}
}