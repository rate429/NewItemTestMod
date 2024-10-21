package newitemtestmod.Items.Food;



import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import newitemtestmod.Items.ModItems;
public class Eggplant {
    public static final FoodComponent EGG_PLANT_FOOD_COMPONENT = new FoodComponent.Builder()
		.alwaysEdible() // idk if this will stay.
		.snack()
		// The duration is in ticks, 20 ticks = 1 second
		.statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 10 * 20, 1), 0.5f)
        .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 60 * 20, 1), 0.1f)
        .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 10 * 20, 1), 1.0f)
		.nutrition(3)
        .saturationModifier(5)

		.build();
        
    
    public static final Item eggplant = ModItems.register(
		new Item(new Item.Settings().food(EGG_PLANT_FOOD_COMPONENT).maxCount(64)),
		"eggplant"

);

    public static void initialize() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
		.register((itemGroup) -> itemGroup.add(Eggplant.eggplant));
    }
}
