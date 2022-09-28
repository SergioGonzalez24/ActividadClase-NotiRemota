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

// TOKEN: dNrsf8UjT_OvZwzopbq0fQ:APA91bEUzifhxTtZFlbXlEoF4HI8DX-DEr7CjKx9XZEeJso1yUFPSipAb_ffHpOPHeN3Nfqqxjidsezh3vz3_Mk9sRxQ83_1DqRO9zeWOvUBys-AWqhKFwZhmthTr6zzrJp7lTHg78uA