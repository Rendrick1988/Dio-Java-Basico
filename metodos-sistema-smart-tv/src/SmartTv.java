

public class SmartTv {
    boolean ligada = false;
    int canal =1;
    int volume =26;

     
    public void aumentarVolume(){
        // volume = volume +1;
        volume++;
        System.out.println("aumentando o volume para : " + volume );
    }
    public void abaixarVolume(){
        //volume = volume - 1;
        volume--;
        System.out.println("abaixando o volume para : " + volume);
    }



    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

   
    


}
