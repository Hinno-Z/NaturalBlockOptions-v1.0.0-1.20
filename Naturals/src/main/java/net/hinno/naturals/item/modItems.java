package net.hinno.naturals.item;

import net.hinno.naturals.naturals;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class modItems  {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create (ForgeRegistries.ITEMS, naturals.MODID);


    public static void register(IEventBus eventBus){
        ITEMS.register (eventBus);
    }
}
