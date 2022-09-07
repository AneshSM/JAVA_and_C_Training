package Exception_Handeling.File;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileIO_Exception {
    static Scanner sc=new Scanner(System.in);
    static String FilePath=sc.next();
    static File f=new File(FilePath);
    
    public static void main(String []arg){
        
    }

    public static void Createfile(){
        try{
            if(f.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void WriteonFile(){
        try{
            FileOutputStream fos=new FileOutputStream(f,true);
            fos.write(100);
            String s=sc.nextLine();
            byte []b=s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("File written");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void ReadFromFile(){
       try{
        FileInputStream fis=new FileInputStream(f);
        int eof=fis.read();
        while(eof!=-1){
            System.out.print((char)eof);
            eof=fis.read();
        }
       }
       catch(FileNotFoundException e){
            e.printStackTrace();
       }
       catch(IOException e){
            e.printStackTrace();
       } 
    }
    public static void ObjectSerialize(){
        String f=sc.nextLine();
        try{
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream out=new ObjectOutputStream(fos);
        out.writeObject(out);
        out.close();
        fos.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
