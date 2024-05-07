import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {

        WelcomeSection()

            Spacer(modifier = Modifier.size(10.dp))
        SearchSection()
        Spacer(modifier = Modifier.size(10.dp))
        ResultSection()
        Spacer(modifier = Modifier.size(1.dp))
        WorkOutSection()

    }
}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun MainScreenPreview() {
    MainScreen()
}

