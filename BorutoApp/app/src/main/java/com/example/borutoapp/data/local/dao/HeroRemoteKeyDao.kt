
@Dao
interface HeroRemoteKeyDao {
    @Query ("SELECT * FROM hero_remote_key_table WHERE id= :id")
    suspend fun getRemoteKey(id: Int): HeroRemoteKey?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(heroRemoteKeys: List<HeroRemoteKey>)

    @Query("DELETE FROM hero_remote_key_table")
    suspend fun deleteAllRemoteKeys()

}
