package net.tweakcraft.tweakcart.api;

import org.bukkit.entity.Minecart;
import org.bukkit.entity.StorageMinecart;
import org.bukkit.entity.PoweredMinecart;
public enum CartType {
    StorageMinecart(),
    PoweredMinecart(),
    Minecart();
    
    public CartType getCartType(Minecart cart){
        if(cart instanceof StorageMinecart){
            return CartType.StorageMinecart;
        }else if(cart instanceof PoweredMinecart){
            return CartType.PoweredMinecart;
        }else{
            return CartType.Minecart;
        }
    }
}
