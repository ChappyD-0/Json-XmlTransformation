package org.example.service.email;
/*
 * -----------------------------------
 *  Proyecto: JsonTranfer
 *  Autor: chappyd-0
 *  Fecha: 3/14/25
 * -----------------------------------
 */
import jakarta.mail .*;
import jakarta.mail.internet .*;

import java.util.Properties;

public class ManejadorCorreo {

    public void enviarCorreo(String correo){
    // Configuración del servidor SMTP de Gmail
    Properties props = new Properties();
            props.put("mail.smtp.host","smtp.gmail.com");
            props.put("mail.smtp.port","587");
            props.put("mail.smtp.auth","true");
            props.put("mail.smtp.starttls.enable","true");

    // Credenciales del remitente
    final String usuario = System.getenv("CORREOEMAIL");
    final String contraseña =System.getenv("CONTRASENIAEMAIL");

    // Crear la sesión
    Session session = Session.getInstance(props, new Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(usuario, contraseña);
        }
    });

    try
    {
        // Crear el mensaje
        Message mensaje = new MimeMessage(session);
        mensaje.setFrom(new InternetAddress(usuario));
        mensaje.setRecipients(Message.RecipientType.TO, InternetAddress.parse("destinatario@correo.com"));
        mensaje.setSubject("Prueba desde Jakarta Mail");
        mensaje.setText("¡Hola! Este es un correo de prueba enviado desde Java usando Jakarta Mail.");

    } catch (AddressException e) {
                throw new RuntimeException(e);
            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
    }
}