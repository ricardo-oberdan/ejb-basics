package com.oberdan.timer;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class Agendador {

	@Schedule(hour = "*", minute = "*", second = "*/30", persistent = false)
	void agendado() {
		System.out.println("Verificando servico periodicamente");
	}

}
