
/**
 * Write a description of class Bukti here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Bukti
{
    String pemesan; 
    int mieGor, mieKuah,  mieIjo, mieRen;
    
    public Bukti(String pemesan, int mieGor, int mieKuah, int mieIjo, int mieRen)
    {
        this.pemesan=pemesan;
        this.mieGor=mieGor;
        this.mieKuah=mieKuah;
        this.mieIjo=mieIjo;
        this.mieRen=mieRen;
        
    }
    void display()
    {
        System.out.print("\f");
        DateFormat formatTanggal = new SimpleDateFormat("dd/MM/yyyy");
        Date tanggal = new Date();
        System.out.println("Nama Pemesan :" +pemesan);
        System.out.println("Tanggal :" +formatTanggal.format(tanggal) + "\n\n");
        
        if(mieGor>0)
        {
            System.out.println("Mie Goreng\tx"+mieGor+"\n\t\t\t"+(10000*mieGor));
        } 
        if(mieKuah>0)
        {
            System.out.println("Mie Kuah\tx"+mieKuah+"\n\t\t\t"+(10000*mieKuah));
        }
        if(mieIjo>0)
        {
            System.out.println("Mie Ijo\tx"+mieIjo+"\n\t\t\t"+(10000*mieIjo));
        } 
        if(mieRen>0)
        {
            System.out.println("Mie Rendang\tx"+mieRen+"\n\t\t\t"+(10000*mieRen));
        }

        
        int total = (mieGor + mieKuah + mieIjo + mieRen)*10000;
        System.out.println("\n\nTotal Harga :\t\t"+ total);
    }
}