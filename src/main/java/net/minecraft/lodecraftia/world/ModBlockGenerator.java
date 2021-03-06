package net.minecraft.lodecraftia.world;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

/**
 * Adds the custom blocks we've created to world generation.
 *
 * Created by russt on 11/24/14.
 */
public class ModBlockGenerator implements IWorldGenerator {
    @Override
    public void generate(Random random, int x, int z, World world, IChunkProvider iChunkProvider, IChunkProvider iChunkProvider1) {
        if(world.provider.getDimensionId() == 0) { // Only spawn in the normal world.
            //Overworld spawning should occur here.
        }
    }

    public void addBlockSpawn(IBlockState block, World world, Random random, int blockXPos, int blockZPos,
                              int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int maxY) {
        for (int i = 0; i < chancesToSpawn; i++) {
            int firstBlockXCoord = blockXPos + random.nextInt(maxX);
            int firstBlockYCoord = random.nextInt(maxY);
            int firstBlockZCoord = blockZPos + random.nextInt(maxZ);
            BlockPos position = new BlockPos(firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
            new WorldGenMinable(block, maxVeinSize).generate(world, random, position);
        }
    }
}
