package toyhippogriff.coalnugget;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CoalNugget implements ModInitializer
{
    public static final Item COAL_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item CHARCOAL_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static final Tag<Item> COAL_NUGGETS = TagRegistry.item(new Identifier("coalnugget", "coal_nuggets"));

    @Override
    public void onInitialize()
    {
        Registry.register(Registry.ITEM, new Identifier("coalnugget", "coal_nugget"), COAL_NUGGET);
        Registry.register(Registry.ITEM, new Identifier("coalnugget", "charcoal_nugget"), CHARCOAL_NUGGET);

        FuelRegistry.INSTANCE.add(COAL_NUGGETS, 200);
    }
}
