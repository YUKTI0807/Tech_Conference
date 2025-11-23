package com.example.test_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test_2.ui.theme.Test_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test_2Theme {
                EventScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("EventEase") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back press */ }) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    IconButton(onClick = { /* Handle share */ }) {
                        Icon(Icons.Filled.Share, contentDescription = "Share")
                    }
                }
            )
        },
        bottomBar = {
            BottomBar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.tech_conference),
                contentDescription = "Tech Conference 2024",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Tech Conference 2024",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Mehsana, Gujarat | 2.5 km away",
                fontSize = 16.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "This is a detailed description of the event...",
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            EventSchedule()
            Spacer(modifier = Modifier.height(16.dp))
            Reviews()
        }
    }
}

@Composable
fun EventSchedule() {
    Column {
        Text(
            text = "Event Schedule",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            ScheduleCard("9:00 AM", "Opening Ceremony", "Kick-off the event with a welcome address.")
            ScheduleCard("10:00 AM", "Keynote Speech", "By our esteemed keynote speaker.")
            ScheduleCard("11:30 AM", "Networking Session", "Meet and interact with fellow attendees.")
        }
    }
}

@Composable
fun ScheduleCard(time: String, title: String, subtitle: String) {
    Card(
        modifier = Modifier
            .width(180.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = time, fontSize = 14.sp, color = Color.Gray)
            Text(text = title, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Text(text = subtitle, fontSize = 14.sp)
        }
    }
}

@Composable
fun Reviews() {
    Column {
        Text(
            text = "Reviews",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        ReviewCard("Alice Johnson", "Great event! Well-organized and informative.", 5)
        ReviewCard("Bob Smith", "Really enjoyed the keynote speaker. Would recommend!", 4)
        ReviewCard("Charlie Davis", "Good event overall, but some sessions were too short.", 4)
    }
}

@Composable
fun ReviewCard(name: String, review: String, rating: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = name,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = name, fontWeight = FontWeight.Bold)
                Row {
                    for (i in 1..5) {
                        Icon(
                            painter = painterResource(id = if (i <= rating) android.R.drawable.star_on else android.R.drawable.star_off),
                            contentDescription = "Rating",
                            tint = Color(0xFFFFC107),
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
                Text(text = review)
            }
        }
    }
}

@Composable
fun BottomBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Button(onClick = { /* Handle buy tickets */ }, modifier = Modifier.weight(1f)) {
            Text("Buy Tickets")
        }
        Spacer(modifier = Modifier.width(16.dp))
        OutlinedButton(onClick = { /* Handle add to calendar */ }, modifier = Modifier.weight(1f)) {
            Text("Add to Calendar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EventScreenPreview() {
    Test_2Theme {
        EventScreen()
    }
}
