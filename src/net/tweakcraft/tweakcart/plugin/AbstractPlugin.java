package net.tweakcraft.tweakcart.plugin;

import net.tweakcraft.tweakcart.api.CartModel;
import net.tweakcraft.tweakcart.api.TweakCartEvent;

public abstract class AbstractPlugin {
    public abstract void registerEvents(TweakCartEvent... events);
    
    /**
     * Called when this plugin is found and turned on
     */
    public abstract void onEnable();
    
    public void registerParserOnKeyword(AbstractParser p, String keyword){
        return;
    }

    
    public void onVehicleBlockChange(Object data){
        //Called when a vehicle enters a new block
    }
    
    public void onVehicleBlockCollision(Object data){
        //Called when a vehicle collides with a block
        //Is a default bukkit feature
    }
    
    public void onVehicleDispense(){
        //Called when tweakcart desides to dispense a cart
    }
    
    public void onVehicleDetect(Object data){
        //Called when a cart is detected
        //Is a default bukkit feature
    }

    public final void callEvent(TweakCartEvent ev, Object data) {
        switch(ev){
        case VehicleBlockChangeEvent:
            onVehicleBlockChange(data);
            break;
        case VehicleBlockCollisionEvent:
            onVehicleBlockCollision(data);
            break;
        case VehicleDetectEvent:
            onVehicleDetect(data);
            break;
        }
        
    }
}
