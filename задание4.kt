@Preview(name = "portrait", showSystemUi = true) @Composable
fun ButtonPreview() { Button(
onClick = { },
modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(16.dp), border = BorderStroke(2.dp, Color.Gray),
elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp),
colors = ButtonDefaults.buttonColors( containerColor = Color.LightGray, contentColor = Color.Black
)
) {
Text("Нажми на меня")
}
}
