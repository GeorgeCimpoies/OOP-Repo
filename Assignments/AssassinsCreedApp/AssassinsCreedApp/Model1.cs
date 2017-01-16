namespace AssassinsCreedApp
{
    using System;
    using System.Data.Entity;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Linq;

    public partial class Model1 : DbContext
    {
        public Model1()
            : base("name=Model1")
        {
        }

        public virtual DbSet<Address> Addresses { get; set; }
        public virtual DbSet<Developer> Developers { get; set; }
        public virtual DbSet<Document> Documents { get; set; }
        public virtual DbSet<DownloadableContent> DownloadableContents { get; set; }
        public virtual DbSet<Game> Games { get; set; }
        public virtual DbSet<GameMode> GameModes { get; set; }
        public virtual DbSet<Genre> Genres { get; set; }
        public virtual DbSet<Location> Locations { get; set; }
        public virtual DbSet<Medium> Media { get; set; }
        public virtual DbSet<Person> People { get; set; }
        public virtual DbSet<PersonType> PersonTypes { get; set; }
        public virtual DbSet<Platform> Platforms { get; set; }
        public virtual DbSet<Publisher> Publishers { get; set; }
        public virtual DbSet<sysdiagram> sysdiagrams { get; set; }
        public virtual DbSet<PlatformMedia> PlatformMedias { get; set; }
        public virtual DbSet<Character_View> Character_Views { get; set; }
        public virtual DbSet<Document_View> Document_Views { get; set; }
        public virtual DbSet<GameView> GameViews { get; set; }
        public virtual DbSet<Location_View> Location_Views { get; set; }

        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Address>()
                .Property(e => e.City)
                .IsUnicode(false);

            modelBuilder.Entity<Address>()
                .Property(e => e.StreetName)
                .IsUnicode(false);

            modelBuilder.Entity<Address>()
                .Property(e => e.StreetNumber)
                .IsUnicode(false);

            modelBuilder.Entity<Address>()
                .Property(e => e.County)
                .IsUnicode(false);

            modelBuilder.Entity<Address>()
                .Property(e => e.Country)
                .IsUnicode(false);

            modelBuilder.Entity<Address>()
                .Property(e => e.Description)
                .IsUnicode(false);

            modelBuilder.Entity<Address>()
                .HasMany(e => e.Developers)
                .WithRequired(e => e.Address)
                .WillCascadeOnDelete(false);

            modelBuilder.Entity<Address>()
                .HasMany(e => e.People)
                .WithRequired(e => e.Address)
                .WillCascadeOnDelete(false);

            modelBuilder.Entity<Address>()
                .HasMany(e => e.Publishers)
                .WithRequired(e => e.Address)
                .WillCascadeOnDelete(false);

            modelBuilder.Entity<Developer>()
                .Property(e => e.DeveloperName)
                .IsUnicode(false);

            modelBuilder.Entity<Developer>()
                .HasMany(e => e.Games)
                .WithMany(e => e.Developers)
                .Map(m => m.ToTable("GameDeveloper").MapLeftKey("DeveloperId").MapRightKey("GameId"));

            modelBuilder.Entity<Document>()
                .Property(e => e.DocumentName)
                .IsUnicode(false);

            modelBuilder.Entity<Document>()
                .Property(e => e.DocumentDescription)
                .IsUnicode(false);

            modelBuilder.Entity<DownloadableContent>()
                .Property(e => e.DLC)
                .IsUnicode(false);

            modelBuilder.Entity<Game>()
                .Property(e => e.GameName)
                .IsUnicode(false);

            modelBuilder.Entity<Game>()
                .Property(e => e.GameDescription)
                .IsUnicode(false);

            modelBuilder.Entity<Game>()
                .HasMany(e => e.Documents)
                .WithRequired(e => e.Game)
                .WillCascadeOnDelete(false);

            modelBuilder.Entity<Game>()
                .HasMany(e => e.DownloadableContents)
                .WithRequired(e => e.Game)
                .WillCascadeOnDelete(false);

            modelBuilder.Entity<Game>()
                .HasMany(e => e.PlatformMedias)
                .WithRequired(e => e.Game)
                .WillCascadeOnDelete(false);

            modelBuilder.Entity<Game>()
                .HasMany(e => e.Locations)
                .WithRequired(e => e.Game)
                .WillCascadeOnDelete(false);

            modelBuilder.Entity<Game>()
                .HasMany(e => e.GameModes)
                .WithMany(e => e.Games)
                .Map(m => m.ToTable("Game_GameMode").MapLeftKey("GameId").MapRightKey("GameModeId"));

            modelBuilder.Entity<Game>()
                .HasMany(e => e.Genres)
                .WithMany(e => e.Games)
                .Map(m => m.ToTable("Game_GenreType").MapLeftKey("GameId").MapRightKey("GenreId"));

            modelBuilder.Entity<GameMode>()
                .Property(e => e.GameMode1)
                .IsUnicode(false);

            modelBuilder.Entity<Genre>()
                .Property(e => e.GenreType)
                .IsUnicode(false);

            modelBuilder.Entity<Location>()
                .Property(e => e.LocationName)
                .IsUnicode(false);

            modelBuilder.Entity<Location>()
                .Property(e => e.LocationDescription)
                .IsUnicode(false);

            modelBuilder.Entity<Medium>()
                .Property(e => e.MediaType)
                .IsUnicode(false);

            modelBuilder.Entity<Medium>()
                .HasMany(e => e.PlatformMedias)
                .WithRequired(e => e.Medium)
                .WillCascadeOnDelete(false);

            modelBuilder.Entity<Person>()
                .Property(e => e.DateOfBirth)
                .IsUnicode(false);

            modelBuilder.Entity<Person>()
                .Property(e => e.Name)
                .IsFixedLength();

            modelBuilder.Entity<PersonType>()
                .Property(e => e.Type)
                .IsUnicode(false);

            modelBuilder.Entity<PersonType>()
                .HasMany(e => e.People)
                .WithRequired(e => e.PersonType)
                .WillCascadeOnDelete(false);

            modelBuilder.Entity<Platform>()
                .Property(e => e.PlatformName)
                .IsUnicode(false);

            modelBuilder.Entity<Platform>()
                .HasMany(e => e.PlatformMedias)
                .WithRequired(e => e.Platform)
                .WillCascadeOnDelete(false);

            modelBuilder.Entity<Publisher>()
                .Property(e => e.PublisherName)
                .IsUnicode(false);

            modelBuilder.Entity<Character_View>()
                .Property(e => e.Name)
                .IsFixedLength();

            modelBuilder.Entity<Character_View>()
                .Property(e => e.DateOfBirth)
                .IsUnicode(false);

            modelBuilder.Entity<Character_View>()
                .Property(e => e.City)
                .IsUnicode(false);

            modelBuilder.Entity<Character_View>()
                .Property(e => e.Type)
                .IsUnicode(false);

            modelBuilder.Entity<Document_View>()
                .Property(e => e.DocumentName)
                .IsUnicode(false);

            modelBuilder.Entity<Document_View>()
                .Property(e => e.DocumentDescription)
                .IsUnicode(false);

            modelBuilder.Entity<Document_View>()
                .Property(e => e.GameName)
                .IsUnicode(false);

            modelBuilder.Entity<GameView>()
                .Property(e => e.GameName)
                .IsUnicode(false);

            modelBuilder.Entity<GameView>()
                .Property(e => e.PublisherName)
                .IsUnicode(false);

            modelBuilder.Entity<GameView>()
                .Property(e => e.DeveloperName)
                .IsUnicode(false);

            modelBuilder.Entity<GameView>()
                .Property(e => e.DLC)
                .IsUnicode(false);

            modelBuilder.Entity<GameView>()
                .Property(e => e.GameMode)
                .IsUnicode(false);

            modelBuilder.Entity<GameView>()
                .Property(e => e.GenreType)
                .IsUnicode(false);

            modelBuilder.Entity<Location_View>()
                .Property(e => e.LocationName)
                .IsUnicode(false);

            modelBuilder.Entity<Location_View>()
                .Property(e => e.LocationDescription)
                .IsUnicode(false);

            modelBuilder.Entity<Location_View>()
                .Property(e => e.GameName)
                .IsUnicode(false);
        }
    }
}
