/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author SKY LENOVO L490
 */
public class Main {
    public static void main(String[] argv){
        Pegawai p = new Pegawai();
        p = new Programmer();//polimorfisme
        p = new Manajer();//polimorfisme
        
        //Manajer m = new Prpgrammer();//tidak bisa karena programmer
                    //bukan subklas manajer
        Manajer m = new Manajer(); new Manajer();
        m.gajiPokok = 10000;
        m.nama = "Sai";
        m.tunjangan = 5000;
        p = m;//Polimorfisme
        p.tampilData();//VIRTUAL METHOD INVOCATION-VMI
        
        m.tampilData();//Bukan VMI, krm m bukan objek polimorfisme
        
        Pegawai[] arrPeg = new Pegawai [3];
        Programmer pr = new Programmer();
        pr.nama = "uchiha";pr.gajiPokok = 10000; pr.bonus = 120000;
        arrPeg[0] = p;
        arrPeg[1] = m;
        arrPeg[2] = new Programmer();
        arrPeg[0].tampilData();
        arrPeg[1].tampilData();
        
        hitungGajiTotal(m);
        hitungGajiTotal(pr);
    }
    public static void hitungGajiTotal(Pegawai p){
        
        if(p instanceof Programmer){
            Programmer prog = (Programmer) p;
            int gajiTot = prog.bonus+prog.gajiPokok;
            System.out.println("Gaji Total Prgogrammer = "+gajiTot);
        }else if(p instanceof Manajer){
            Manajer man = (Manajer) p;
            int gajiTot = man.tunjangan+man.gajiPokok;
            System.out.println("Gaji Total Manajer = "+gajiTot);
        }
    }
}
