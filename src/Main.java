import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();
        ArrayList<File> files = new ArrayList<>();
        String[] words = command.split(" ");
        while (!words[0].equals("Stop")) {
            try {
                switch (words[0]) {
                    case "create" -> createFile(files, words);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            command = in.nextLine();
            words = command.split(" ");
        }
    }

    public static void createFile(ArrayList<File> a, String[] words){

        String path = "";

        for (int y = 2; y < words.length; y++){

            path+= words[y] + "\\";

        }

        path+=words[1];

        File file = new File(path);


        try {

            if(file.exists()){
                int integer = path.length() + 1;
                if(words[1].charAt(words[1].length() - 4) == '.' ){

                }
                File newFile = new File(createNewName(path , 1 , );
                newFile.createNewFile();
                System.out.println("File was renamed and successfully created");
                System.out.println("New name:" + newFile.getName());

            }else{

                file.createNewFile();
                System.out.println("File was created");
                System.out.println("Name:" + file.getName());

            }

        }catch (IOException e) {

            throw new RuntimeException(e);

        }
    }
    public static void removeFile(ArrayList<File> a, String path){

        Scanner in = new Scanner(System.in);

    }

    public static void renameFile(ArrayList<File> a, String path){

        Scanner in = new Scanner(System.in);

    }

    public static void moveFile(ArrayList<File> a, String path){

        Scanner in = new Scanner(System.in);

    }
    public static String createNewName(String path, int g , String orName){

        int integer = 0;
        for (int y = path.length() - 1; y > -1; y--) {

            if (path.charAt(y) == '\\') {

                integer = y + 1;
                break;

            }

        }
        path = path.substring(0, integer) + orName + "-" + g + ".txt";
        try {

            if ((new File(path)).createNewFile()) {

                return path;

            }else {

                return createNewName(path, g + 1, orName);

            }

        }catch (IOException e) {

            throw new RuntimeException(e);

        }



    }


}