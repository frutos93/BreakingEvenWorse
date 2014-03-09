package jframeexamen;

      import java.awt.Image;
      import java.awt.Toolkit;
      
    public class BloqueR extends Base{
        
        private int golpes;
        private boolean destruido;
        
    public BloqueR(int posX,int posY){
	super(posX,posY);	
        Image bueno1 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("pill/red pill 1.png"));               
        animacion = new Animacion();
        animacion.sumaCuadro(bueno1, 100);
        destruido= false;
        golpes=0;
	}

    
    private static final String PAUSADO = "PAUSADO";
    private static final String DESAPARECE = "DESAPARECE";
    
    public static String getPausado(){
        return PAUSADO;
    }
    
    public static String getDesaparece(){
        return DESAPARECE;
    }
    public void setdestruido(boolean rompe){
        this.destruido=rompe;
    }
    public int getGolpes(){
    return golpes;
    }
        public void addGolpe() {
        golpes++;

       }
    public void cambiaimagen(int gp){
        if(gp==1){
        Image bueno1; bueno1 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("pill/red pill 2.png"));               
        animacion = new Animacion();
        animacion.sumaCuadro(bueno1, 100);
        }
        if(gp==2){
        Image bueno1; bueno1 = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("pill/red pill 3.png"));               
        animacion = new Animacion();
        animacion.sumaCuadro(bueno1, 100);

        if (golpes == 3) {
            destruido = true;

        }
    }
    }
    
}
