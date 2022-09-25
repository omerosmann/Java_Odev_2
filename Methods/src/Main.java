
public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        
    }
    
    public static void sayiBulmaca (){
        
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMı = false;
        
        for(int sayı : sayilar){
            if(sayı == aranacak){
                varMı = true;
                break;
            }
        }
        if(varMı){
            mesajVer("Sayı mevcuttur : " + aranacak);
        }else{
            mesajVer("Sayı mevcut değildir : " + aranacak);
        }
        
    
    }
    
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
        
    }
}
