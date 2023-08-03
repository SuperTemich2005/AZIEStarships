package org.azie.aziestarships;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AZIEStarships implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    // Declaring miscellaneous
    public static final String MODID = "aziestarships";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    // Declaring items
    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());
    // Declaring Blocks

    // Functions
    @Override
    public void onInitialize() {
        LOGGER.info("Hello world");
        Registry.register(Registries.ITEM, new Identifier(MODID,"custom_item"), CUSTOM_ITEM);
    }
}
