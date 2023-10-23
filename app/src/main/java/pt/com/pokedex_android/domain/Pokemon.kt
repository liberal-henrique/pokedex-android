package pt.com.pokedex_android.domain

data class Pokemon(
    val number: Int,
    val name: String,
    val types: List<PokemonType>
) {

    val formattedName = name.replaceFirstChar{
        if (it.isLowerCase())
            it.titlecase()
        else
            it.toString()
    }
    val formattedNumber = number.toString().padStart(3, '0')
    val imageUrl = "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/${formattedNumber}.png"
}



