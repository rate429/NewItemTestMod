package newitemtestmod.Items;


import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import newitemtestmod.NewItemTestMod;
import newitemtestmod.Items.Food.Eggplant;;


// note this follows the fabric documation on the item class. 

public class ModItems {
    public static Item register(Item item, String id) {
		// Create the identifier for the item.
		Identifier itemID = Identifier.of(NewItemTestMod.MOD_ID, id);

		// Register the item.
		Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

		// Return the registered item!
		return registeredItem;
	}

	public static void initialize() {
		Eggplant.initialize(); // loads the eggplant item
	}

	
}
