import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitnessapp.R

@Composable
fun ResultSection(modifier: Modifier = Modifier) {

    Column(modifier = Modifier.padding(16.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.SpaceBetween
        ) {
            Text(text = "Last week Result")
            Text(text = "See Details")
        }
        Spacer(modifier = Modifier.size(30.dp))
        LazyRow(

        ) {
            itemsIndexed(
                items = listOf(
                    "Item 1",


                    )
            ) { index, item ->
                    WorkOut()
                Kcal()
                Time()

            }
        }

    }
}

@Composable
fun WorkOut(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .height(200.dp)
            .width(180.dp)
            .padding(8.dp)
            .background(
                color = MaterialTheme.colorScheme.primary, shape = RoundedCornerShape(10.dp)
            )
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxHeight(),
            Arrangement.SpaceBetween
        ){
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(
                        color = MaterialTheme.colorScheme.secondary,
                        shape = RoundedCornerShape(10.dp)
                    )
            )
            {

                Icon(painter = painterResource(id = R.drawable.workout_kicking_stroke_rounded),
                    contentDescription =null ,
                    modifier = Modifier.padding(10.dp)
                )

            }
            Text(text = "56", fontSize = 40.sp)
            Text(text = "Workouts")
        }
    }
}

@Composable
fun Kcal(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .height(200.dp)
            .width(180.dp)
            .padding(8.dp)
            .background(
                color = MaterialTheme.colorScheme.primary, shape = RoundedCornerShape(10.dp)
            )
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxHeight(),
            Arrangement.SpaceBetween
        ){
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(
                        color = MaterialTheme.colorScheme.secondary,
                        shape = RoundedCornerShape(10.dp)
                    )
            )
            {

                    Icon(painter = painterResource(id = R.drawable.cheese_cake_01_stroke_rounded),
                        contentDescription =null ,
                        modifier = Modifier.padding(10.dp)
                    )

            }


            Text(text = "11869", fontSize = 38.sp)
            Text(text = "Kacl")
        }
    }
}

@Composable
fun Time(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .height(200.dp)
            .width(180.dp)
            .padding(8.dp)
            .background(
                color = MaterialTheme.colorScheme.primary, shape = RoundedCornerShape(10.dp)
            )
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxHeight(),
            Arrangement.SpaceBetween
        ){
            Box(
                modifier = Modifier
                    .size(40.dp)

                    .background(
                        color = MaterialTheme.colorScheme.secondary,
                        shape = RoundedCornerShape(10.dp),

                    )
            ){
                Icon(painter = painterResource(id = R.drawable.clock_02_stroke_rounded),
                    contentDescription =null ,
modifier = Modifier.padding(10.dp)
                    )
            }
            Text(text = "669", fontSize = 38.sp)
            Text(text = "Minutes")
        }
    }
}





@Preview(showBackground = true,

)
@Composable
fun ResultSectionPreview() {
    ResultSection()
}