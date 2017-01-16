namespace AssassinsCreedApp.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Data.Entity.Spatial;

    [Table("GameView")]
    public partial class GameView
    {
        [Key]
        [Column(Order = 0)]
        [StringLength(50)]
        public string GameName { get; set; }

        [Key]
        [Column(Order = 1)]
        public DateTime ReleaseDate { get; set; }

        [Key]
        [Column(Order = 2)]
        [StringLength(50)]
        public string PublisherName { get; set; }

        [Key]
        [Column(Order = 3)]
        [StringLength(50)]
        public string DeveloperName { get; set; }

        [Key]
        [Column(Order = 4)]
        [StringLength(50)]
        public string DLC { get; set; }

        [Key]
        [Column(Order = 5)]
        [StringLength(50)]
        public string GameMode { get; set; }

        [Key]
        [Column(Order = 6)]
        [StringLength(50)]
        public string GenreType { get; set; }
    }
}
