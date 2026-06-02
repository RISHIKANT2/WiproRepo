package com.java.abstraction;

interface Camera1 {
    void takePhoto();
}
interface MusicPlayer1{
	void playMusic();
}
class SmartPhone1 implements Camera1,MusicPlayer1{
	public void takePhoto(){
		System.out.println("Photo Taken");
	}
    public void playMusic(){
		System.out.println("Music is playing");
	 }
    public void Start() {
    	System.out.println("SmartPhone Started");
    }
}




public class Camera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camera1 sm= new SmartPhone1();
		sm.takePhoto();
		
		MusicPlayer1 sm1= new SmartPhone1();
		sm1.playMusic();
		

	}

}
