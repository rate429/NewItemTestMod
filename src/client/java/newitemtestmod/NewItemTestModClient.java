package newitemtestmod;

import net.fabricmc.api.ClientModInitializer;
import newitemtestmod.Items.ModItems;

public class NewItemTestModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ModItems.initialize();
	}
}