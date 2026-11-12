@Preview(showSystemUi = true) @Composable
fun Text1Preview() {
Text(
text = stringResource(R.string.compose_desc), color = Color(0xFF008000),
fontSize = 16.sp,
fontStyle = FontStyle.Italic, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth()
)
}

@Preview(showSystemUi = true) @Composable
fun Text2Preview() { Text(
text = stringResource(R.string.compose_desc), maxLines = 1,
overflow = TextOverflow.Ellipsis
)
}

@Preview(showSystemUi = true) @Composable
fun Text3Preview() { Text(
text = stringResource(R.string.compose_desc), fontSize = 24.sp,
color = Color.Black,
textDecoration = TextDecoration.Underline,
style = TextStyle(textIndent = TextIndent(firstLine = 48.sp)), modifier = Modifier.background(Color.Green)
)
}
