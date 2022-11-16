/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quis1_y_2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Console;
/**
 *
 * @author andreas
 */
public class Quis1_Y_2021 {

    public static void main(String[] args) throws IOException {
        
       Nelayan n1 = new Nelayan();
        Dokter d2 = new Dokter();
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
         Console con = System.console();
        
            System.out.println("NIK : ");
            n1.nik = br.readLine();
            System.out.println("Nama : ");
            n1.nama = br.readLine();
            System.out.println("Umur : ");
            n1.umur = Integer.parseInt(con.readLine());
            
            System.out.println("Alamat : ");
            n1.alamat = br.readLine();
            System.out.println("Jml Berat Ikan : ");
            n1.jmlBeratIkan = Integer.parseInt(con.readLine());
            System.out.println("Jml Pakai Solar : ");
            n1.jmlSolar = Integer.parseInt(con.readLine());
          
            System.out.println();

           

           
            

            System.out.println();

            System.out.println("NIK : ");
            d2.nik = br.readLine();
            System.out.println("Nama : ");
            d2.nama = br.readLine();
            System.out.println("Umur : ");
            d2.umur = Integer.parseInt(con.readLine());
            System.out.println("Alamat : ");
            d2.alamat = br.readLine();
            System.out.println("Jml Pasien : ");
            d2.jmlPasien = Integer.parseInt(con.readLine());
            System.out.println("Jml Obat : ");
            d2.jmlObat = Integer.parseInt(con.readLine());
       

            System.out.println("=========== DATA NELAYAN ===========");
            n1.tampilDataPenduduk();
            n1.DataNelayan();
            n1.totalPendapatNelayan();
            
            System.out.println();
            
          
            
            System.out.println("=========== DATA DOKTER ===========");
            
          
            
            System.out.println();
            
            d2.tampilDataPenduduk();
            d2.DataDokter();
            d2.totalPendapatanDokter();

     
    }
}

  

   

    

