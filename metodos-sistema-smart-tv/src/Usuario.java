public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

      
      smartTv.abaixarVolume();
      smartTv.abaixarVolume();
      smartTv.abaixarVolume();
      smartTv.aumentarVolume();
      System.out.println("volume atual : "+ smartTv.volume);




     System.out.println("TV Ligada ? "+  smartTv.ligada);
     System.out.println("Canal Atual ? "+ smartTv.canal);
     System.out.println("Volume Atual ? "+ smartTv.volume);


     smartTv.ligar();
     System.out.println("Atualizando -> TV ligada ? "+  smartTv.ligada);

     smartTv.desligar();
     System.out.println("Atualizando -> TV ligada ? "+  smartTv.ligada);


     



    }
}
