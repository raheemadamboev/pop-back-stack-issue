package xyz.teamgravity.popbackstackissue

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import xyz.teamgravity.popbackstackissue.ui.theme.PopBackStackIssueTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PopBackStackIssueTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                    modifier = Modifier.fillMaxSize()
                ) {
                    val controller = rememberNavController()

                    NavHost(
                        navController = controller,
                        startDestination = "screen_a"
                    ) {
                        composable("screen_a") {
                            ScreenA(
                                onNavigate = {
                                    controller.navigate("screen_b")
                                }
                            )
                        }

                        composable("screen_b") {
                            ScreenB(
                                onBack = controller::navigateUp
                            )
                        }
                    }
                }
            }
        }
    }
}