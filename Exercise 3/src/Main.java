import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = cvsToArray();
        System.out.println("There are so many words in the wordlist: " + words.size());

    }

    public static ArrayList<String> cvsToArray(){
        ArrayList<String> wordList = new ArrayList<>();
        try{
            File wordFile = new File("resources/words.csv");
            Scanner scanner = new Scanner(wordFile);

            while(scanner.hasNextLine()){
                String hangmanWords = scanner.nextLine();
                wordList.add(hangmanWords);
            }

        }catch(FileNotFoundException e){
            System.out.println("Could not find file");
        }
        return(wordList);
    }
}
