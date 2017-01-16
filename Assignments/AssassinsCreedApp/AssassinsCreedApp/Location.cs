namespace AssassinsCreedApp
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Data.Entity.Spatial;

    [Table("Location")]
    public partial class Location
    {
        public int LocationId { get; set; }

        [Required]
        [StringLength(50)]
        public string LocationName { get; set; }

        [Required]
        [StringLength(100)]
        public string LocationDescription { get; set; }

        public int GameId { get; set; }

        public virtual Game Game { get; set; }
    }
}
