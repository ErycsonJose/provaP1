
public class microondas {
private boolean ligado;
private String status;
private boolean portaFechada;

microondas(){
	
}





public boolean isLigado() {
	return ligado;
}





public String getStatus() {
	return status;
}





public boolean isPortaFechada() {
	return portaFechada;
}





String imprimir(){
	if((portaFechada==true)&&(ligado==true)){
		status = "Status:ligado, porta fechada: sim";
	}
	else if((portaFechada==false)&&(ligado==true)){
		status = "Status:ligado, porta fechada:não";
	}
	else if((portaFechada==true)&&(ligado==false)){
		status = "Status:desligado, porta fechada:sim";
	}
	else{
		status = "Status:desligado, porta fechada:não";
	}
	
	return status;
}
boolean ligar(){
	ligado = true;
	return ligado;
}
boolean desligar(){
	ligado = false;
    return ligado;
}
boolean fecharPorta(){
	portaFechada = true;
	return portaFechada;
}
boolean abrirPorta(){
	portaFechada = false;
	return portaFechada;
}
}
