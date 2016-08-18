/*
 * Copyright 2016 FabricMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.fabricmc.base;

import java.io.File;

public class Fabric {

    private static File gameDir;
    private static File configDir;

    public static File getGameDir() {
        return gameDir;
    }

    // INTERNAL: DO NOT USE
    public static void setGameDir(File gameDir) {
        Fabric.gameDir = gameDir;
    }

    public static File getConfigDir() {
        if (configDir == null) {
            configDir = new File(gameDir, "config");
            if (!configDir.exists()) {
                configDir.mkdirs();
            }
        }
        return configDir;
    }
}