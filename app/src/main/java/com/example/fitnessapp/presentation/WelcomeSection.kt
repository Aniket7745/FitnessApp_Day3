import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitnessapp.R

@Composable
fun WelcomeSection(modifier: Modifier = Modifier) {

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp, top = 34.dp, end = 16.dp),
        Arrangement.SpaceBetween
    ) {
        Column {
            Text(text = "Hi Aniket,", fontSize = 26.sp)
            Text(text = "Are you ready to workout?,", fontSize = 16.sp)
        }
        Icon(painter = painterResource(id = R.drawable.user_stroke_rounded),
            contentDescription ="",modifier=Modifier
                .size(45.dp) )
    }

}
@Preview
@Composable
fun WelcomeSectionPreview() {
    WelcomeSection()
}