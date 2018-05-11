package com.company.Lesson17;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InputOutput {
    public static void main(String[] args) {
        readWhithResources();
    }

    public static void justRead() {
        FileInputStream fis = null;
        try {
//                fis=new FileInputStream("text/test.txt");
            fis = new FileInputStream("/home/denis/Test/test.txt");
            System.out.println("file size in bytes = " + fis.available());
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void readWhithResources() {
        try (FileInputStream fis = new FileInputStream("text/test.txt")) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readAndWrite() {
        try (FileInputStream fis = new FileInputStream("text/test.txt");
             FileOutputStream fos = new FileOutputStream("text/result.txt")) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
                fos.write(content);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeStringToFile() {
        try (FileOutputStream fos = new FileOutputStream("text/result.txt")) {
            List<String> strings = new ArrayList<>();
            strings.add("One");
            strings.add("Two");
            strings.add("Three");
            strings.add("Four");
            for (String s : strings) {
                s += "\n";
                fos.write(s.getBytes());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void bufferedInputStream() {
        InputStream inStream = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bus = null;
        try {
            inStream = new FileInputStream("text/test.txt");
            bis = new BufferedInputStream(inStream);
            bus = new BufferedOutputStream(new FileOutputStream("text/buff_stream.txt"));
            while (bis.available() > 0) {
                char c = (char) bis.read();
                System.out.println("symbol=" + c);
                bus.write(c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            if (inStream != null && bis != null && bus != null) {
                try {
                    inStream.close();
                    bis.close();
                    bus.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }


    public static void bufferedInputStream1() {
        try (FileInputStream inStream =new FileInputStream("text/test.txt");
             BufferedInputStream bis = new BufferedInputStream(inStream);
             BufferedOutputStream bus = new BufferedOutputStream(new FileOutputStream("text/buff_stream.txt"))) {
            while(bis.available()>0){
                     char c = (char) bis.read();
                     System.out.println("symbol=" + c);
                     bus.write(c);
                 }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
}
public static void readByLines(){
        File file=new File("text/test.txt");
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
}
public static void readAndWriteByLines(){
        File file=new File("text/test.txt");
        try(BufferedReader br= new BufferedReader(new FileReader(file));
        BufferedWriter bw= new BufferedWriter(new FileWriter("text/buffered_result.txt"))) {
            List<String> strings = new ArrayList<>();
            String line;
            while((line=br.readLine())!=null){
                strings.add(line);
            }
            Collections.sort(strings);
            for(String s:strings){
                bw.write(s+"\n");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
}
}

