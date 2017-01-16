namespace AssassinsCreedApp.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Data.Entity.Spatial;

    [Table("Location View")]
    public partial class Location_View
    {
        [Key]
        [Column(Order = 0)]
        [StringLength(50)]
        public string LocationName { get; set; }

        [Key]
        [Column(Order = 1)]
        [StringLength(100)]
        public string LocationDescription { get; set; }

        [Key]
        [Column(Order = 2)]
        [StringLength(50)]
        public string GameName { get; set; }
    }
}
