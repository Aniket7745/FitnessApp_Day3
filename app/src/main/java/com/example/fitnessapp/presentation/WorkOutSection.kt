import android.service.media.CameraPrewarmService
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitnessapp.R

@Composable
fun WorkOutSection(modifier: Modifier = Modifier) {
        Column( modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()) {
            Text(text = "Workout")

            Spacer(modifier = Modifier.size(10.dp))
            LazyColumn(

            ) {
                itemsIndexed(
                    items = listOf(
                        "Item 1",


                        )
                ) { index, item ->
                
                    Arms()
                    Lower()
                    Cardio()
                    Cardio()
                    Cardio()
                }
            }
            
        }
}


@Composable
fun Arms(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .height(80.dp)
            .fillMaxWidth()
            .padding(8.dp)
            .background(
                color = MaterialTheme.colorScheme.secondary,
                shape = RoundedCornerShape(10.dp)
            )
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp,8.dp, end = 16.dp),
            Arrangement.SpaceBetween,
            Alignment.CenterVertically


        ) {
            Column {
                Text(
                    text = "Bicep curl ", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                    )
                Text(
                    text = "X24 ", fontSize = 16.sp,
                )

            }

            Icon(painter = painterResource(id = R.drawable.workout_stretching_stroke_rounded), contentDescription ="" )

        }
    }

}

@Composable
fun Lower(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .height(80.dp)
            .fillMaxWidth()
            .padding(8.dp)
            .background(
                color = MaterialTheme.colorScheme.secondary,
                shape = RoundedCornerShape(10.dp)
            )
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp,8.dp, end = 16.dp),
            Arrangement.SpaceBetween,
            Alignment.CenterVertically


        ) {
            Column {
                Text(
                    text = "Sit ups ", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "X20 ", fontSize = 16.sp,
                )

            }

            Icon(painter = painterResource(id = R.drawable.workout_squats_stroke_rounded), contentDescription ="" )

        }
    }

}

@Composable
fun Cardio(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .height(80.dp)
            .fillMaxWidth()
            .padding(8.dp)
            .background(
                color = MaterialTheme.colorScheme.secondary,
                shape = RoundedCornerShape(10.dp)
            )
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp,8.dp, end = 16.dp),
            Arrangement.SpaceBetween,
            Alignment.CenterVertically


        ) {
            Column {
                Text(
                    text = "Running ", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "5km ", fontSize = 16.sp,
                )

            }

            Icon(painter = painterResource(id = R.drawable.workout_run_stroke_rounded), contentDescription ="" )

        }
    }

}


@Preview(
    showBackground = true,

)
@Composable
fun WorkOutSectionPreview() {
    WorkOutSection()
}