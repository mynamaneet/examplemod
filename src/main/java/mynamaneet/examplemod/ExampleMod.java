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
            DolSubfolder subfolder = ModLoader.getDolSubfolder("overworld-town");
            DolLocation location = ModLoader.getDolLocation("loc-cafe");
            TweeFile twee = ModLoader.getTweeFile(location, "chef.twee");
            DolPassage passage = ModLoader.getDolPassage("Bedroom");

            ModLoader.logMessage("SUBFOLDER - "+subfolder.getDirectoryPath().getAbsolutePath());
            ModLoader.logMessage("LOCATION - "+location.getDirectoryPath().getAbsolutePath());
            ModLoader.logMessage("TWEE - "+twee.getDirectoryPath().getAbsolutePath());
            ModLoader.logMessage("PASSAGE - "+passage.getTweeFile().getAbsolutePath());

        } catch (InvalidLocationException | InvalidTweeFileException | InvalidSubfolderException | InvalidPassageException ex) {
            ModLoader.logMessage(ex.getMessage());
        }
	}
}