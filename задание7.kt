data class Contact(
val name: String, val patronymic: String, val surname: String, val phone: String, val address: String
)

val contacts = listOf(
Contact("Евгений", "Андреевич", "Лукашин", "+7 495 495 95 95", "г. Москва, 3-я улица Строителей, д. 25, кв. 12"),
Contact("Василий", "Егорович", "Кузякин", "—", "Ивановская область, дер. Крутово, д. 4"),
Contact("Людмила", "Прокофьевна", "Калугина", "+7 495 788 78 78", "Москва, Большая Никитская, д. 43, кв. 290")
)

@Composable
fun ContactInfo(c: Contact, centered: Boolean = false) {
val align = if (centered) TextAlign.Center else TextAlign.Start Column(horizontalAlignment = if (centered) Alignment.CenterHorizontally
else Alignment.Start) { Text("Имя: ${c.name}", textAlign = align) Text("Отчество: ${c.patronymic}", textAlign = align) Text("Фамилия: ${c.surname}", textAlign = align) Text("Мобильный телефон: ${c.phone}", textAlign = align) Text("Адрес: ${c.address}", textAlign = align)
}
}

// Column: один контакт
@Preview(showSystemUi = true) @Composable
fun ContactColumnPreview() { ContactInfo(contacts[0])
}

// Column: список контактов в серых карточках @Preview(showSystemUi = true)
@Composable
fun ListPreview() {
Column(Modifier.padding(8.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
contacts.forEach { c -> Box(
Modifier.fillMaxWidth().background(Color.LightGray).padding(8.dp), contentAlignment = Alignment.Center
) { ContactInfo(c, centered = true) }
}
}
}

// Row: карточка с иконкой справа @Preview(showSystemUi = true) @Composable
fun ContactRowPreview() { Row(

Modifier.padding(8.dp).fillMaxWidth().background(Color.LightGray).padding(8.dp), verticalAlignment = Alignment.CenterVertically
) {
Box(Modifier.weight(1f), contentAlignment = Alignment.Center) { ContactInfo(contacts[0], centered = true)
}
Icon(Icons.Filled.Star, contentDescription = "Избранное", tint = Color(0xFFFF6D00))
}
}
