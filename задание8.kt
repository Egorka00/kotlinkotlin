private val primaryColor = Color(0xFF41649A) private val secondaryColor = Color(0xFF555D6E) private val buttonTextColor = Color.White

@Composable
fun WaterTracker() {
var waterCount by remember { mutableStateOf(0) } var streakDays by remember { mutableStateOf(0) }

Column(
modifier = Modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
) {
Text(
text = "Трекер воды", fontSize = 32.sp,
fontWeight = FontWeight.Bold, color = primaryColor
)
Spacer(modifier = Modifier.height(48.dp)) Text(
text = "$waterCount мл", fontSize = 48.sp,
fontWeight = FontWeight.Bold, color = secondaryColor
)
Spacer(modifier = Modifier.height(24.dp)) Button(
colors = ButtonDefaults.buttonColors(containerColor = primaryColor), onClick = { waterCount += 250 }
) {
Text("+250 мл", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = buttonTextColor)
}
Spacer(modifier = Modifier.height(12.dp)) Button(
colors = ButtonDefaults.buttonColors(containerColor = primaryColor), onClick = {
streakDays = if (waterCount >= 1500) streakDays + 1 else 0 waterCount = 0
}
) {
Text("Завершить день", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = buttonTextColor)
}
Spacer(modifier = Modifier.height(24.dp))
Text("Дней подряд с 1500 мл и больше: $streakDays", fontSize = 16.sp)
}
}
