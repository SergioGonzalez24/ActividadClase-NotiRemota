package mx.itesm.smgv.notiremota

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class ServicioMensajesFB : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        println("Token de este dispositivo: $token")
    }

    override fun onMessageReceived(message: RemoteMessage) {
        println("Llega notificaccion remota!!!!!!!!!!!")
    }
}