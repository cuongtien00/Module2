import jdk.jfr.internal.tool.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        ReadAndWrite readAndWrite = new ReadAndWrite();
        List<Integer> list = readAndWrite.readFile("Test.txt");
        for (Integer a: list
             ) {
            System.out.println(a);
        }
        int max = readAndWrite.findMaxValue(list);
        System.out.println(max);
        readAndWrite.writeFile("result.txt",max);
    }
    public List<Integer> readFile(String file){
        InputStream inputStream = null;
        BufferedReader reader = null;
        List<Integer> list = new ArrayList<>();
        try{

            inputStream = new FileInputStream(file);
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";

            while((line = reader.readLine())!=null){
                list.add(Integer.parseInt(line));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if(inputStream!=null){
                    inputStream.close();
                }
                if(reader != null){
                    reader.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        return list;
    }
    public void writeFile(String file,int max){
        try{
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public int findMaxValue(List<Integer> list){
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(max< list.get(i)){}
            max = list.get(i);
        }
        return max;
    }
}
