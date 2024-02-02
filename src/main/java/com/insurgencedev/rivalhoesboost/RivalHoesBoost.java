package com.insurgencedev.rivalhoesboost;

import com.insurgencedev.rivalhoesboost.listeners.RivalHoesEvenListener;
import org.insurgencedev.insurgencesets.api.addon.ISetsAddon;
import org.insurgencedev.insurgencesets.api.addon.InsurgenceSetsAddon;
import org.insurgencedev.insurgencesets.libs.fo.Common;

@ISetsAddon(name = "RivalHoesBoost", version = "1.0.1", author = "Insurgence Dev Team", description = "RivalHarvesterHoes Support")
public class RivalHoesBoost extends InsurgenceSetsAddon {

    @Override
    public void onAddonReloadablesStart() {
        if (Common.doesPluginExist("RivalHarvesterHoes")) {
            registerEvent(new RivalHoesEvenListener());
        }
    }
}
