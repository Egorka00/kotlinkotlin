@Composable
fun Hello(name: String?) {
Text(
text = if (name != null) "Привет, $name!" else "Имя не задано", modifier = Modifier.padding(16.dp)
)
}

class MainActivity : ComponentActivity() {
override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
setContent {
Hello("Angelina")	// вариант 1: конкретное имя
// Hello(null) // вариант 2: имя не задано
}
}
}
