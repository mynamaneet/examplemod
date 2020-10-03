package mynamaneet.examplemod;

import java.util.ArrayList;

import com.mynamaneet.dolmodloader.*;
import com.mynamaneet.dolmodloader.exceptions.InvalidLocationException;
import com.mynamaneet.dolmodloader.exceptions.InvalidPassageException;
import com.mynamaneet.dolmodloader.exceptions.InvalidTweeFileException;
import com.mynamaneet.dolmodloader.file_classes.DolPassage;

public class ExampleMod extends Mod {
    public ExampleMod() {
        super("Example Mod", "1.0.7", "mynamaneet");
    }

    public static void main() {
        // Handled by ModLoader
    }

    @Override
    public void modApp() {
        try {
            DolPassage bedroom = ModLoader.getDolPassage(
                ModLoader.getTweeFile(
                    ModLoader.getDolLocation(
                        "loc-home"), 
                    "main"), 
            "Bedroom");

            ArrayList<String> message = ModLoader.getTextResource(this, "important.txt");
            ModLoader.overwritePassage(bedroom, message);
            
        } catch (InvalidPassageException | InvalidLocationException | InvalidTweeFileException ex) {
            ModLoader.logMessage(ex.getMessage());
        }
	}
}