# NeoForgeMod (Minecraft 1.21.1)

A starter Minecraft mod template for NeoForge 1.21.1, including:
- Custom creative tab
- An example item
- Advancement unlocking by obtaining the example item
- Hooks for JEI/REI-style integration (recipes, ingredients)
- GitHub-friendly project structure

## How to Build

1. Install Java 21.
2. Install Gradle (or use Gradle wrapper).
3. Clone this repo and run:

    gradle build

## How to Develop

1. Edit `NeoForgeMod.java` to register items/blocks/tabs.
2. Texture your items in `/assets/neoforge_mod/textures/item/`.
3. Add advancements, recipes, and integration hooks in their respective folders.

## How to Integrate JEI/REI

If you add custom recipes, implement registration in integration/JEIPlugin.java (and/or analogous for REI).  
See JEI/REI documentation for current API usage.

## License

MIT