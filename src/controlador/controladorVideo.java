package controlador;

import modelo.clase_actor;
import modelo.clase_nomination;
import modelo.clase_video;

public class controladorVideo {
	
	public void registrar(int time, int gender, String title, int year, double price, int unit, int us){
		
		clase_video vi = new clase_video(time, gender, title, year, price, unit, us);
		vi.registro();
	}
	
	public void regitrar1(int video, int actor){
		clase_actor ac = new clase_actor(actor, video);
		ac.registro1();
		}
	
	public void regitrar2(int nom, int video){
		clase_nomination no = new clase_nomination(nom, video);
		no.registro1();
		}
	
	public void regitrar3(int tit, String alternative){
		clase_video vi = new clase_video(tit, alternative);
		vi.registro1();
		}
	
	public void regitrar4(int earned){
		clase_nomination no = new clase_nomination(earned);
		no.registro2();
		}
}
