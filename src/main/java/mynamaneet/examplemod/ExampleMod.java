package mynamaneet.examplemod;

import java.util.ArrayList;

import com.mynamaneet.dolmodloader.*;
import com.mynamaneet.dolmodloader.exceptions.InvalidLocationException;
import com.mynamaneet.dolmodloader.exceptions.InvalidPassageException;
import com.mynamaneet.dolmodloader.exceptions.InvalidTweeFileException;


public class ExampleMod extends Mod {
    public ExampleMod(){
        super("Example Mod", "1.0.7", "mynamaneet");
    }

    public static void main() {
        //Handled by ModLoader
    }

	@Override
	public void modApp() {
        try{
            ArrayList<String> message = new ArrayList<>();
            message.add("ExampleMod Test");
            message.add("<br>");
            message.add("ExampleMod 2nd Test");
            ModLoader.addPassageText(message, ModLoader.getDolPassage(ModLoader.getTweeFile(ModLoader.getDolLocation("loc-home"), "main"), "Bedroom"));
            message.clear();
            message.add("Urmomgay");
            ModLoader.addPassageText(message, ModLoader.getDolPassage(ModLoader.getTweeFile(ModLoader.getDolLocation("loc-home"), "main"), "Bedroom"));
        }catch(InvalidPassageException|InvalidLocationException|InvalidTweeFileException ex){
            ModLoader.logMessage(ex.getMessage());
        }
	}
}