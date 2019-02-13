package com.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.cursomc.domain.Cliente;
import com.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void  sendNewPasswordEmail(Cliente cliente, String newPass);
}
