/*
 * This file is part of World Downloader: A mod to make backups of your
 * multiplayer worlds.
 * http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/2520465
 *
 * Copyright (c) 2014 nairol, cubic72
 * Copyright (c) 2018 Pokechu22, julialy
 *
 * This project is licensed under the MMPLv2.  The full text of the MMPL can be
 * found in LICENSE.md, or online at https://github.com/iopleke/MMPLv2/blob/master/LICENSE.md
 * For information about this the MMPLv2, see http://stopmodreposts.org/
 *
 * Do not redistribute (in modified or unmodified form) without prior permission.
 */
package wdl.versioned;

import java.util.List;
import java.util.Map;

import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.renderer.EntityRenderer;

/**
 * Functions that help deal with things that vary in type between versions.
 */
final class TypeFunctions {
	private TypeFunctions() { throw new AssertionError(); }

	/* (non-javadoc)
	 * @see VersionedFunctions#getChunkListClass
	 */
	@SuppressWarnings("rawtypes")
	static Class<List> getChunkListClass() {
		return List.class;
	}

	/* (non-javadoc)
	 * @see VersionedFunctions#getChunksToSaveClass
	 */
	@SuppressWarnings("rawtypes")
	static Class<Map> getChunksToSaveClass() {
		return Map.class;
	}

	/* (non-javadoc)
	 * @see VersionedFunctions#customName
	 */
	static String customName(String name) {
		return name;
	}

	/* (non-javadoc)
	 * @see VersionedFunctions#createNewGameSettings
	 */
	static GameSettings createNewGameSettings() {
		return new GameSettings();
	}

	/* (non-javadoc)
	 * @see VersionedFunctions#getGameRendererClass
	 */
	static Class<EntityRenderer> getGameRendererClass() {
		return EntityRenderer.class;
	}
}
