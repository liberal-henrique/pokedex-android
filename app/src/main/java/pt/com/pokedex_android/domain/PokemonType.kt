package pt.com.pokedex_android.domain

data class PokemonType(
    val name: String
) {
    val formattedType = name.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString()}
}