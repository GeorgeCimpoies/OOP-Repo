namespace AssassinsCreedApp
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Data.Entity.Spatial;

    [Table("Character View")]
    public partial class Character_View
    {
        [Key]
        [Column(Order = 0)]
        [StringLength(50)]
        public string Name { get; set; }

        [StringLength(50)]
        public string DateOfBirth { get; set; }

        [Key]
        [Column(Order = 1)]
        [StringLength(50)]
        public string City { get; set; }

        [Key]
        [Column(Order = 2)]
        [StringLength(50)]
        public string Type { get; set; }
    }
}
