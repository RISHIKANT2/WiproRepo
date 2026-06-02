package com.java.abstraction;


class Main{
	public static void main(String args[]) {
		Camer sm= new SmartPhone();
		sm.takePhoto();
		
		MusicPlayer sm1= new SmartPhone();
		sm1.playMusic();
	}
}

public interface Camer {
    void takePhoto();
}
interface MusicPlayer{
	void playMusic();
}
class SmartPhone implements Camer,MusicPlayer{
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

