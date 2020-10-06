package mynamaneet.examplemod;

import java.util.ArrayList;

import com.mynamaneet.dolmodloader.*;
import com.mynamaneet.dolmodloader.exceptions.InvalidLocationException;
import com.mynamaneet.dolmodloader.exceptions.InvalidPassageException;
import com.mynamaneet.dolmodloader.exceptions.InvalidSubfolderException;
import com.mynamaneet.dolmodloader.exceptions.InvalidTweeFileException;
import com.mynamaneet.dolmodloader.file_classes.DolLocation;
import com.mynamaneet.dolmodloader.file_classes.DolPassage;
import com.mynamaneet.dolmodloader.file_classes.DolSubfolder;
import com.mynamaneet.dolmodloader.file_classes.TweeFile;

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
            ModLoader.addPassageText("I'm right outside lmao", ModLoader.getDolPassage("Bedroom"), 3);
            ModLoader.addPassageText("This shit happen after tho", ModLoader.getDolPassage("Bedroom"), 3);

        } catch (InvalidPassageException ex) {
            ModLoader.logMessage(ex.getMessage());
        }
	}
}