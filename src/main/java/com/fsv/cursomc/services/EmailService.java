package com.fsv.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.fsv.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
