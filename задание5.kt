@Preview(name = "portrait", showSystemUi = true) @Composable
fun Task1Preview() { Box(
modifier = Modifier
.fillMaxWidth()
.height(100.dp)
.background(Color.LightGray)
) {
Box(
modifier = Modifier
.align(Alignment.Center)
.padding(vertical = 16.dp)
.fillMaxHeight()
.aspectRatio(1f)
.clip(CircleShape)
.background(Color(0xFFFF5722)), contentAlignment = Alignment.Center
) {
Text("АБ")
}
}
}
