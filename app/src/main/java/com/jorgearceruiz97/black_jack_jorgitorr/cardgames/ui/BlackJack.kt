package com.jorgearceruiz97.black_jack_jorgitorr.cardgames.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.jorgearceruiz97.black_jack_jorgitorr.R


/**
 *@param navController The navigation controller used for navigating to different screens
 * @param highestCardViewModel The viewModel responsible for managing the Highest Card game logic
 */
@Composable
fun BlackJackScreen(){
    /*val imagenId: Int by blackjackviewmodel.imageId.observeAsState(initial = 0)
    val descImagen: String by blackjackviewmodel.imageDesc.observeAsState(initial = "")
    val turno: Boolean by blackjackviewmodel.*/

    val imageModifier = Modifier
        .size(900.dp)
        .border(BorderStroke(1.dp, Color.Black))
        .background(Color.Yellow)

    //cartas jugador 1
    Row (modifier = Modifier
        .fillMaxSize()
        .padding(top = 50.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Top){
        
        Text(text = "Jugador 1")
        LazyColumn {
            items(getCardsJugador1()){

            }
        }

        Image(painter = painterResource(id = R.drawable.facedown),
            contentDescription = "")
    }

    //cartas jugador 2
    Row (modifier = Modifier
        .fillMaxSize()
        .padding(top = 250.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically){
        Text(text = "Jugador 2")
        LazyColumn {
            items(getCardsJugador2()){
                
            }
        }
        Image(painter = painterResource(id = R.drawable.facedown),
            contentDescription = "")
    }

    //pedir Carta
    Row(modifier = Modifier
        .fillMaxSize()
        .padding(50.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Bottom){
        Button(onClick = {  }, colors = ButtonDefaults.buttonColors(Color.DarkGray)) {
            Text(text = "Pedir carta")
        }
        Button(onClick = {  }, colors = ButtonDefaults.buttonColors(Color.DarkGray)) {
            Text(text = "Plantarse")
        }
    }


}

fun getCardsJugador1(): Int {
    TODO("Not yet implemented")
}

fun getCardsJugador2(): Int {
    TODO("Not yet implemented")
}



@Composable
fun insertarUsuarios(
    navController: NavHostController,
    blackjackviewmodel: BlackJackViewModel,
    introduceNombre: (String) -> Unit
) {
    val nombre: String by blackjackviewmodel.player1Name.observeAsState("")

    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Introduce tu nombre")

    }
    
}

fun NombreItem(){

}



