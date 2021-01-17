package br.com.eduardo.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.eduardo.cursomc.domain.Cliente;
import br.com.eduardo.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
