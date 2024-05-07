import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon


import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fitnessapp.R

@Composable
fun SearchSection(modifier: Modifier = Modifier) {
    Row(
        modifier= Modifier
            .fillMaxWidth()
            .padding(20.dp),

        
    ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(
                MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp)
            ),
            ){
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, 15.dp, end = 20.dp),
                    Arrangement.SpaceBetween
                ){
                    Text(text = "Search for workout")
                    Icon(painter = painterResource(id = R.drawable.search_01_stroke_rounded), contentDescription ="" )
                }
       }

    }
}

@Preview(showBackground = true)
@Composable
fun SearchSectionPreview() {
    SearchSection()
}