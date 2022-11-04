



object DataBaseModule{
    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        BorutoDatabase:class.java,
        BORUTO_DATABASE

    ).build()

}