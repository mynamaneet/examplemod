package mynamaneet.examplemod;

import java.util.ArrayList;

import com.mynamaneet.dolmodloader.*;
import com.mynamaneet.dolmodloader.exceptions.*;
import com.mynamaneet.dolmodloader.file_classes.*;

public class ExampleMod extends Mod {
    public ExampleMod() {
        super("Example Mod", "1.0.8", "mynamaneet");
    }

    public static void main() {
        // Handled by ModLoader
    }

    @Override
    public void modApp(){
        CustomSubfolder subfolder = ModLoader.createCustomSubfolder(this, "example-mod");
        CustomLocation location = ModLoader.createCustomLocation(this, "test", subfolder);
        CustomTweeFile twee = ModLoader.createCustomTweeFile(this, "main", location);
        CustomPassage passage = ModLoader.createCustomPassage(this, "Big bad bad bad", twee);

        try{
            //ModLoader.addPassageText("<<link [[Test Mod Spot|Big bad bad bad]]>><</link>>", ModLoader.getDolPassage("Bedroom"), 143);
            ModLoader.addPassageText(ModLoader.getTextResource(this, "important.txt"), ModLoader.getDolPassage("Bedroom"), 143, this);


            ModLoader.addPassageText(ModLoader.getTextResource(this, "important.txt"), passage, 1, this);

            ModLoader.removePassageLine(ModLoader.getDolPassage("Bedroom"), 5);
            ModLoader.removePassageLine(ModLoader.getDolPassage("Bedroom"), 1, "Example Mod");
        } catch(InvalidPassageException e){
            ModLoader.logMessage("ERROR");
        }
	}
}