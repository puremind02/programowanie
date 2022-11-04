

@Entity(tableName = HERO_REMOTE_KEY_DATABASE_TABLE)
data class HeroRomoteKey {

    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val prevPage: Int?,
    val nextPage: Int?
}