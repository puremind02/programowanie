
import androidx.room.TypeConverter
class DatabaseConverter{

    private val separator = ","

    @TypeConverter
    fun convertListToString(list: List<String>): String{
        val stringBuild = StringBuilder()
        for (item in list){
           stringBuilder.append(item).append(separator)
        }

        stringBuilder.setlenght(stringBuilder.lenght - separator.length)
        return stringBuilder.toString()
    }


    @TypeConverter
    fun convertStringToList(string: String): List<String>{
        return string.split(separator)

    }



}