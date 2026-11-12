// 1. Круг исходного размера в правом верхнем углу, чёрный фон 240x120 @Preview(showSystemUi = true)
@Composable
fun CircleTopEndPreview() {
Box(Modifier.size(240.dp, 120.dp).background(Color.Black)) { Image(
painter = painterResource(R.drawable.circle), contentDescription = null,
modifier = Modifier.align(Alignment.TopEnd)
)
}
}

// 2. Синий фон, круг по центру, растянут, фиолетовый цвет @Preview(showSystemUi = true)
@Composable
fun CircleStretchPreview() {
Box(Modifier.size(240.dp, 120.dp).background(Color.Blue)) { Image(
painter = painterResource(R.drawable.circle), contentDescription = null,
modifier = Modifier.fillMaxSize().align(Alignment.Center), contentScale = ContentScale.FillBounds,
colorFilter = ColorFilter.tint(Color(0xFF800080))
)
}
}
