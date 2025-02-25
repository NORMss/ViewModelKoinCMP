package screen.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import domain.Repository
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeScreen(
    navigateToDetails: () -> Unit,
) {
    val viewModel = koinViewModel<HomeViewModel>()

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Button(
            onClick = navigateToDetails
        ) {
            Text(
                text = "Go to details"
            )
        }
    }
}