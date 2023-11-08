package com.example.lemonadeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonadeapp.ui.theme.LemonTree
import com.example.lemonadeapp.ui.theme.LemonadeAppTheme
import com.example.lemonadeapp.ui.theme.PurpleGrey80
import com.example.lemonadeapp.ui.theme.Yellow40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Column {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Yellow40)
                                .padding(18.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "Lemonade",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        var currentStep by remember { mutableStateOf(1) }

                        when(currentStep){
                            1 -> Column(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(25.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(40.dp))
                                            .background(PurpleGrey80)
                                            .size(250.dp),
                                        contentAlignment = Alignment.Center

                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.lemon_tree),
                                            contentDescription = "Lemon tree",
                                            modifier = Modifier
                                                .wrapContentSize()
                                                .clickable { currentStep = 2 }
                                        )
                                    }
                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Text(
                                        text = "Tap the lemon tree to select a lemon",
                                        fontSize = 15.sp
                                    )
                                }
                            }

                            2 -> Column(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(25.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(40.dp))
                                            .background(PurpleGrey80)
                                            .size(250.dp),
                                        contentAlignment = Alignment.Center

                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.lemon_squeeze),
                                            contentDescription = "Lemon tree",
                                            modifier = Modifier
                                                .wrapContentSize()
                                                .clickable {
                                                    val sequeezCount = (2..4).random()
                                                    if (sequeezCount == 3) currentStep  = 3
                                                }
                                        )
                                    }
                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Text(
                                        text = "Keep tapping the lemon to squeeze it",
                                        fontSize = 15.sp
                                    )
                                }
                            }

                            3 -> Column(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(25.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(40.dp))
                                            .background(PurpleGrey80)
                                            .size(250.dp),
                                        contentAlignment = Alignment.Center

                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.lemon_drink),
                                            contentDescription = "Lemon tree",
                                            modifier = Modifier
                                                .wrapContentSize()
                                                .clickable { currentStep = 4 }
                                        )
                                    }
                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Text(
                                        text = "Tap the lemonade to drink it",
                                        fontSize = 15.sp
                                    )
                                }
                            }

                            4 -> Column(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(25.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(40.dp))
                                            .background(PurpleGrey80)
                                            .size(250.dp),
                                        contentAlignment = Alignment.Center

                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.lemon_restart),
                                            contentDescription = "Lemon tree",
                                            modifier = Modifier
                                                .wrapContentSize()
                                                .clickable { currentStep = 5 }
                                        )
                                    }
                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Text(
                                        text = "Tap the empty glass to start again",
                                        fontSize = 15.sp
                                    )
                                }
                            }

                            5 -> Column(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(25.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(40.dp))
                                            .background(PurpleGrey80)
                                            .size(250.dp),
                                        contentAlignment = Alignment.Center

                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.lemon_tree),
                                            contentDescription = "Lemon tree",
                                            modifier = Modifier
                                                .wrapContentSize()
                                                .clickable { currentStep = 1 }
                                        )
                                    }
                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Text(
                                        text = "Tap the lemon tree to select a lemon",
                                        fontSize = 15.sp
                                    )
                                }
                            }
                        }


                    }
                }
            }
        }
    }
}



//@Preview(showSystemUi = true)
@Composable
fun LemonTree() {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Yellow40)
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Lemonade",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }

        var currentStep by remember { mutableStateOf(1) }

        when(currentStep){
            1 -> Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(25.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(40.dp))
                            .background(PurpleGrey80)
                            .size(250.dp),
                        contentAlignment = Alignment.Center

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lemon_tree),
                            contentDescription = "Lemon tree",
                            modifier = Modifier
                                .wrapContentSize()
                                .clickable { currentStep = 2 }
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Tap the lemon tree to select a lemon",
                        fontSize = 15.sp
                    )
                }
            }

            2 -> Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(25.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(40.dp))
                            .background(PurpleGrey80)
                            .size(250.dp),
                        contentAlignment = Alignment.Center

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lemon_squeeze),
                            contentDescription = "Lemon tree",
                            modifier = Modifier
                                .wrapContentSize()
                                .clickable {
                                    val sequeezCount = (2..4).random()
                                    if (sequeezCount == 3) currentStep  = 3
                                }
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Keep tapping the lemon to squeeze it",
                        fontSize = 15.sp
                    )
                }
            }

            3 -> Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(25.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(40.dp))
                            .background(PurpleGrey80)
                            .size(250.dp),
                        contentAlignment = Alignment.Center

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lemon_drink),
                            contentDescription = "Lemon tree",
                            modifier = Modifier
                                .wrapContentSize()
                                .clickable { currentStep = 4 }
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Tap the lemonade to drink it",
                        fontSize = 15.sp
                    )
                }
            }

            4 -> Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(25.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(40.dp))
                            .background(PurpleGrey80)
                            .size(250.dp),
                        contentAlignment = Alignment.Center

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lemon_restart),
                            contentDescription = "Lemon tree",
                            modifier = Modifier
                                .wrapContentSize()
                                .clickable { currentStep = 5 }
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Tap the empty glass to start again",
                        fontSize = 15.sp
                    )
                }
            }

            5 -> Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(25.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(40.dp))
                            .background(PurpleGrey80)
                            .size(250.dp),
                        contentAlignment = Alignment.Center

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lemon_tree),
                            contentDescription = "Lemon tree",
                            modifier = Modifier
                                .wrapContentSize()
                                .clickable { currentStep = 1 }
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Tap the lemon tree to select a lemon",
                        fontSize = 15.sp
                    )
                }
            }
        }


    }
}