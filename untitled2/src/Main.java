import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import  java.util.*;
import  java.io.*;

public class Main {
    public  static  void coptfile(String src,String dist) throws  IOException{
        FileInputStream inputStream=new FileInputStream(src);
        FileOutputStream outputStream=new FileOutputStream(dist);
        FileChannel inputchannel=inputStream.getChannel();
        FileChannel outputchannel=outputStream.getChannel();
        ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
        while(true){
            int number=inputchannel.read(byteBuffer);

if(number==-1){
    break;
}
byteBuffer.flip();
outputchannel.write(byteBuffer);
byteBuffer.clear();
        }
inputStream.close();
        outputStream.close();
        inputchannel.close();
        outputchannel.close();
    }
public static void main(String [] args) throws IOException {
coptfile("test.txt","test2.txt");

}

}

