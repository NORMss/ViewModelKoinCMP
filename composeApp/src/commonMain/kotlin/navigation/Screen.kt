package navigation

sealed class Screen(val rote: String) {
    data object Home : Screen(rote = "home")
    data object Detail : Screen(rote = "detail")
}