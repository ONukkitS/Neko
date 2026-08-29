package cn.nukkit.level.generator;

import cn.nukkit.level.ChunkManager;
import cn.nukkit.level.Level;
import cn.nukkit.math.NukkitRandom;
import cn.nukkit.math.Vector3;

import java.util.Map;
/*
 *
 * 因为我暂时不知道怎么写 (
 *
 */
@Deprecated
public class End extends Generator{

    @Override
    public int getId() {
        return Generator.TYPE_THE_END;
    }

    @Override
    public int getDimension() {
        return Level.DIMENSION_END;
    }

    @Override
    public void init(ChunkManager level, NukkitRandom random) {
        // EMPTY
    }

    @Override
    public void generateChunk(int chunkX, int chunkZ) {
        // EMPTY
    }

    @Override
    public void populateChunk(int chunkX, int chunkZ) {
        // EMPTY
    }

    @Override
    public ChunkManager getChunkManager() {
        return null;
    }

    @Override
    public Map<String, Object> getSettings() {
        return null;
    }

    @Override
    public String getName() {
        return "end";
    }

    @Override
    public Vector3 getSpawn() {
        return null;
    }
}
